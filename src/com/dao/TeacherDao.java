package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Homework;
import com.service.HibernateSessionFactory;

public class TeacherDao {
	//老师首页的信息
	public List TeacherInfo(String id){
		Session session=null;//session对象
		List list=null;
		try{
		session=HibernateSessionFactory.getSession();
		session.beginTransaction();
		//hql查询语句
		String hql="from Teacher u where u.tid=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		list=query.list();
		System.out.println(list.get(0).toString());
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally{
			HibernateSessionFactory.closeSesson();
		}
		return list;
	}
	
	//老师布置作业
	public List uploadHomework(String id){
		Session session=null;//session对象
		List list=null;
		try{
		session=HibernateSessionFactory.getSession();
		session.beginTransaction();
		//hql查询语句
		String hql="from Teach u where u.id.teacher.tid=?";
		Query query=session.createQuery(hql);
		query.setParameter(0, id);
		list=query.list();
		System.out.println(list.get(0).toString());
		session.getTransaction().commit();
		}catch(Exception e){
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return list;
	}
	
	//查询老师已经布置的作业
		public List haveSubmit(String tid){
			Session session=null;//session对象
			List list=null;
			try{
			session=HibernateSessionFactory.getSession();
			session.beginTransaction();
			//hql查询语句
			String hql="from Homework u where u.id.teacher.tid=?";
			Query query=session.createQuery(hql);
			query.setParameter(0, tid);
			list=query.list();
			System.out.println(list.get(0).toString());
			session.getTransaction().commit();
			}catch(Exception e){
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			return list;
		}
	
	
	//保存作业信息
			public void saveHomework(Homework homework){
				Session session=null;
				try{
					//获取session
					session=HibernateSessionFactory.getSession();
					session.beginTransaction();//开启事物
					session.save(homework);//持久化homework
					session.getTransaction().commit();//提交事物
				}catch(Exception e){
					e.printStackTrace();//打印异常信息
					session.getTransaction().rollback();//回滚事物
				}finally{
					HibernateSessionFactory.closeSesson();
				}
			}
			
			
			//老师布置作业
			public List uploadTeacherInfo(String uid){
				Session session=null;//session对象
				List list=null;
				try{
				session=HibernateSessionFactory.getSession();
				session.beginTransaction();
				//hql查询语句
				String hql="from Teacher u where u.university.uid=?";
				Query query=session.createQuery(hql);
				query.setParameter(0, uid);
				list=query.list();
				session.getTransaction().commit();
				}catch(Exception e){
					e.printStackTrace();
					session.getTransaction().rollback();
				}
				return list;
			}		
			
}
