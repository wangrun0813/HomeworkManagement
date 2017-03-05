package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.model.Course;
import com.model.Password;
import com.model.Student;
import com.model.Teach;
import com.model.Teacher;
import com.model.University;
import com.service.HibernateSessionFactory;

public class AdminDao {
	//注册页面中获得所有的学校
	public List AdminUniversity() {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			// hql查询语句
			String hql = "from University";
			Query query = session.createQuery(hql);
			list = query.list();
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return list;
	}
	
	
	//老师注册
			public void saveTeacher(Teacher teacher){
				Session session=null;
				try{
					//获取session
					session=HibernateSessionFactory.getSession();
					session.beginTransaction();//开启事物
					session.save(teacher);//持久化student
					session.getTransaction().commit();//提交事物
				}catch(Exception e){
					e.printStackTrace();//打印异常信息
					session.getTransaction().rollback();//回滚事物
				}finally{
					HibernateSessionFactory.closeSesson();
				}
			}
	
	// 管理员首页的信息
	public List AdminInfo(String id) {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			// hql查询语句
			String hql = "from Admin u where u.aid=?";
			Query query = session.createQuery(hql);
			query.setParameter(0, id);
			list = query.list();
			System.out.println(list.get(0).toString());
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		return list;
	}
	
	//注册学校
		public void saveUniversity(University university){
			Session session=null;
			try{
				//获取session
				session=HibernateSessionFactory.getSession();
				session.beginTransaction();//开启事物
				session.save(university);//持久化student
				session.getTransaction().commit();//提交事物
			}catch(Exception e){
				e.printStackTrace();//打印异常信息
				session.getTransaction().rollback();//回滚事物
			}finally{
				HibernateSessionFactory.closeSesson();
			}
		}
		
		
		//判断学校id是否已经注册
		public boolean findSchoolByid(String id){
			Session session=null;
			boolean exist=false;
			try{
				//获取session
				session=HibernateSessionFactory.getSession();
				session.beginTransaction();
				//hql语言查询
				String hql="from University p where p.uid=?";
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
		
		//删除教师
		public List delPassword(String tid){
			Session session=null;//session对象
			Teacher teacher=null;//用户
			try{
			session=HibernateSessionFactory.getSession();
			session.beginTransaction();
			//hql更改语句
			teacher=(Teacher)session.get(Teacher.class,tid);
			session.delete(teacher);
			session.getTransaction().commit();
			}catch(Exception e){
				e.printStackTrace();
				session.getTransaction().rollback();
			}finally{
			HibernateSessionFactory.closeSesson();
			}
			return null;			
		}
		
		//更改教师信息
		public List upTeacher(String tid,String temail,String tphone){
			Session session=null;//session对象
			Teacher teacher=null;//用户
			try{
			session=HibernateSessionFactory.getSession();
			session.beginTransaction();
			//hql更改语句
			teacher=(Teacher)session.get(Teacher.class,tid);
			teacher.setTemail(temail);
			teacher.setTphone(tphone);
			session.saveOrUpdate(teacher);
			session.getTransaction().commit();
			}catch(Exception e){
				e.printStackTrace();
				session.getTransaction().rollback();
			}finally{
			HibernateSessionFactory.closeSesson();
			}
			return null;			
		}
		
		
		// 管理员修改学生信息的页面
		public List updateStudentInfo(String uname) {
			Session session = null;// session对象
			List list = null;
			try {
				session = HibernateSessionFactory.getSession();
				session.beginTransaction();
				// hql查询语句
				String hql = "from Student u where u.uname=?";
				Query query = session.createQuery(hql);
				query.setParameter(0, uname);
				list = query.list();
				System.out.println(list.get(0).toString());
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			return list;
		}
		//安排教师课程（通过uid查询学校班级）
		public List showSclass(String uid) {
			Session session = null;// session对象
			List list = null;
			try {
				session = HibernateSessionFactory.getSession();
				session.beginTransaction();
				// hql查询语句
				String hql = "from Sclass u where u.university.uid=?";
				Query query = session.createQuery(hql);
				query.setParameter(0,uid);
				list = query.list();
				System.out.println(list.get(0).toString());
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			return list;
		}
		//安排教师课程（查询所有的课程号）
		public List showcid() {
			Session session = null;// session对象
			List list = null;
			try {
				session = HibernateSessionFactory.getSession();
				session.beginTransaction();
				// hql查询语句
				String hql = "from Course";
				Query query = session.createQuery(hql);
				list = query.list();
				System.out.println(list.get(0).toString());
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			return list;
		}
		//安排教师课程（通过uid查询教师号）
		public List showtid(String uid) {
			Session session = null;// session对象
			List list = null;
			try {
				session = HibernateSessionFactory.getSession();
				session.beginTransaction();
				// hql查询语句
				String hql = "from Teacher u where u.university.uid=?";
				Query query = session.createQuery(hql);
				query.setParameter(0,uid);
				list = query.list();
				System.out.println(list.get(0).toString());
				session.getTransaction().commit();
			} catch (Exception e) {
				e.printStackTrace();
				session.getTransaction().rollback();
			}
			return list;
		}
		
		//注册学校
				public void saveCourse(Teach teach){
					Session session=null;
					try{
						//获取session
						session=HibernateSessionFactory.getSession();
						session.beginTransaction();//开启事物
						session.save(teach);
						session.getTransaction().commit();//提交事物
					}catch(Exception e){
						e.printStackTrace();//打印异常信息
						session.getTransaction().rollback();//回滚事物
					}
				}
				
		

}

