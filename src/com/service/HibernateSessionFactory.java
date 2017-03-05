package com.service;

import org.hibernate.Session;

import org.hibernate.HibernateException;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateSessionFactory {
	private static String configfile="/hibernate.cfg.xml";
	//ThreadLocal是一个本地线程
	private static final ThreadLocal<Session> threadLocal =new ThreadLocal<Session>();
	private static Configuration config=new Configuration();
	private static org.hibernate.SessionFactory sessionFactory;
	/*读取配置文件，创建一个会话工厂*/
	static {
		try{
		config.configure(configfile);		
		sessionFactory=config.buildSessionFactory();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/*通过会话工厂打开会话,就可以访问数据库*/
	public static Session getSession() throws HibernateException{
		Session session=(Session)threadLocal.get();
		if(session==null||!session.isOpen()){
			if(sessionFactory==null){
				rebuildSessionFactiry();
			}
			session=(sessionFactory!=null)?sessionFactory.openSession():null;
		    threadLocal.set(session);
		}
		return session;
	}
	/*重新创建一个会话工厂 */
	public static void rebuildSessionFactiry(){
		try{
			config.configure(configfile);
			sessionFactory=config.buildSessionFactory();
			System.out.println("success");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*关闭与数据库的会话*/
	public static void closeSesson() throws HibernateException{
		Session session=(Session) threadLocal.get();
		threadLocal.set(null);
		if(session!=null){
			session.close();
		}
	}
}
