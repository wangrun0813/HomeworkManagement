package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Student;
import com.service.HibernateSessionFactory;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentDao {


	// 学生注册
	public void saveStudent(Student student) {
		Session session = null;
		try {
			// 获取session
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();// 开启事物
			session.save(student);// 持久化student
			session.getTransaction().commit();// 提交事物
		} catch (Exception e) {
			e.printStackTrace();// 打印异常信息
			session.getTransaction().rollback();// 回滚事物
		} finally {
			HibernateSessionFactory.closeSesson();
		}
	}

	// 学生首页的信息
	public List StudentInfo(String id) {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			// hql查询语句
			String hql = "from Student u where u.sid=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, id);
			list = query.list();
			System.out.println(list.get(0).toString());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		} finally {
			HibernateSessionFactory.closeSesson();
		}
		return list;
	}

	// 学生下载作业主信息
	public List downloadHomework(String sclass) {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			// hql查询语句
			String hql = "from Teach u where u.id.sclass.sclass=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, sclass);
			list = query.list();
			System.out.println(list.get(0).toString());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return list;
	}
	
	

	// 学生下载单学科作业
	public List downloadHomework2(String sclass, String tid, String Cid) {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			// hql查询语句
			String hql = "from Homework u where u.id.sclass.sclass=? and u.id.teacher.tid=? and u.id.course.cid=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, sclass);
			query.setParameter(1, tid);
			query.setParameter(2, Cid);
			list = query.list();
			System.out.println(list.get(0).toString());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return list;
	}
	
	// 学生显示下载单学科作业
		public List showhomework(String sclass, String tid, String Cid,String title) {
			Session session = null;// session对象
			List list = null;
			try {
				session = HibernateSessionFactory.getSession();
				session.beginTransaction();
				// hql查询语句
				String hql = "from Homework u where u.id.sclass.sclass=? and u.id.teacher.tid=? and u.id.course.cid=? and u.id.title=?";
				Query query = session.createQuery(hql);
				query.setParameter(0, sclass);
				query.setParameter(1, tid);
				query.setParameter(2, Cid);
				query.setParameter(3, title);
				list = query.list();
				System.out.println(list.get(0).toString());
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			return list;
		}

	// 学生首页的今日作业信息
	public List StudentHomework(String sclass) {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
//			// 获取系统当前日期
//			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
//			Date date = new Date();
//			String string = date.getYear() + 1900 + "-" + (date.getMonth() + 1)
//					+ "-" + date.getDate();
//			date = format1.parse(date.toString());
			// hql查询语句
			String hql = "from Homework u where u.id.sclass.sclass=? ";
			Query query = session.createQuery(hql);
			query.setParameter(0, sclass);
		//	query.setParameter(1, date);
			list = query.list();
			System.out.println(list.get(0).toString());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return list;
	}
}
