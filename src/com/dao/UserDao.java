/*
 * user登陆
 */
package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Password;
import com.model.Student;
import com.model.Teacher;
import com.service.HibernateSessionFactory;
 
public class UserDao {
	
	
	//密码注册
	public void savepswd(Password ps){
		Session session=null;
		try{
			//获取session
			session=HibernateSessionFactory.getSession();
			session.beginTransaction();//开启事物
			session.save(ps);//持久化student
			session.getTransaction().commit();//提交事物
		}catch(Exception e){
			e.printStackTrace();//打印异常信息
			session.getTransaction().rollback();//回滚事物
		}finally{
			HibernateSessionFactory.closeSesson();
		}
	}
	//判断用户名是否已经注册
	public boolean findUserByname(String id){
		Session session=null;
		boolean exist=false;
		try{
			//获取session
			session=HibernateSessionFactory.getSession();
			session.beginTransaction();
			//hql语言查询
			String hql="from Password p where u.id=?";
			Query query=session.createQuery(hql).setParameter(0,id);
			Object judgeid=query.uniqueResult();
			//如果用户存在exist为true
			if(judgeid!=null){
				exist=true;
			}
			session.getTransaction().commit();//提交事物
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();//回滚事物
		}finally{
			HibernateSessionFactory.closeSesson();
		}
		return exist;
	}
	
	//用户登录用户名，密码验证
	public Password findUser(String id,String pswd){
		Session session=null;//session对象
		Password password=null;//用户
		try{
		session=HibernateSessionFactory.getSession();
		session.beginTransaction();
		System.out.println("session"+session);
		//hql查询语句
		String hql="from Password u where u.id=? and u.pswd=?";
		Query query=session.createQuery(hql).setParameter(0, id).setParameter(1,pswd);//动态赋值
		password=(Password)query.uniqueResult();
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
		HibernateSessionFactory.closeSesson();
		}
		return password;
	}
	

	//更改密码
		public List upPassword(String id,String pswd){
			Session session=null;//session对象
			Password password=null;//用户
			try{
			session=HibernateSessionFactory.getSession();
			session.beginTransaction();
			//hql更改语句
			password=(Password)session.get(Password.class,id);
			password.setPswd(pswd);
			session.saveOrUpdate(password);
			session.getTransaction().commit();
			}catch(Exception e){
				e.printStackTrace();
				session.getTransaction().rollback();
			}finally{
			HibernateSessionFactory.closeSesson();
			}
			return null;			
		}
}
