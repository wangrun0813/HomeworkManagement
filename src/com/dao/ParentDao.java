package com.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.service.HibernateSessionFactory;

public class ParentDao {

	// 家长首页的信息
	public List ParentInfo(String id) {
		Session session = null;// session对象
		List list = null;
		try {
			session = HibernateSessionFactory.getSession();
			session.beginTransaction();
			// hql查询语句
			String hql = "from Parent u where u.pid=?";
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

}
