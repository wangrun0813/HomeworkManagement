package com.action;


import java.util.List;
import java.util.Map;

import javax.jms.Session;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.dao.AdminDao;
import com.dao.ParentDao;
import com.dao.StudentDao;
import com.dao.TeacherDao;
import com.dao.UserDao;
import com.model.Admin;
import com.model.Homework;
import com.model.Parent;
import com.model.Password;
import com.model.Student;
import com.model.Teach;
import com.model.Teacher;
import com.model.University;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private static String forword = null;
	private String id;
	private String pswd;
	private HttpSession session;

	public LoginAction() {
		session = ServletActionContext.getRequest().getSession();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	// 用户名和密码验证
	public String execute() {
		// 实例化Userdao
		UserDao dao = new UserDao();
		StudentDao stuDao=new StudentDao();
		TeacherDao teaDao=new TeacherDao();
		ParentDao parDao=new ParentDao();
		AdminDao adminDao=new AdminDao();
		id = getId();// jsp页面输入的值
		pswd = getPswd();
		// 根据用户名，密码查询
		Password ps = dao.findUser(id, pswd);
		if (ps != null) {
			String indentity = (String)id.subSequence(0, 1);
			// 学生
			if (indentity.equals("s")) {
				Student student =(Student)stuDao.StudentInfo(id).get(0);
				session.setAttribute("student", student);
				//通过class得到teach表中的对象
				List<Teach> teach=(List<Teach>)stuDao.downloadHomework(student.getSclass());
				session.setAttribute("teach",teach);
				//学生每日作业
				List<Homework> stuhomework=(List<Homework>)stuDao.StudentHomework(student.getSclass());
				session.setAttribute("stuhomework",stuhomework);

				forword = "success";
			}
			// 老师
			else if (indentity.equals("t")) {
				//教师信息
				Teacher teacher =(Teacher)teaDao.TeacherInfo(id).get(0);
				session.setAttribute("teacher", teacher);
				//通过id得到teach表中的对象
				//Teach teach=(Teach)teaDao.uploadHomework(id);
				List<Teach> teachs = (List<Teach>)teaDao.uploadHomework(id);	
				session.setAttribute("teach",teachs);
                //通过id得到homework中已经布置的作业
				List<Homework> homeworks=(List<Homework>)teaDao.haveSubmit(id);
				session.setAttribute("homeworks", homeworks);
				
				forword = "success1";
			} else if (indentity.equals("p")) {
				// 家长
				forword = "success2";
				Parent parent =(Parent)parDao.ParentInfo(id).get(0);
				session.setAttribute("parent",parent);
			}else if(indentity.equals("a")){
				//管理员信息
				Admin admin=(Admin)adminDao.AdminInfo(id).get(0);
				session.setAttribute("admin", admin);
				//获得学校这个对象
				List<University> university = (List<University>)adminDao.AdminUniversity();
				session.setAttribute("university", university);
				forword = "success3";
			}
		} else {
			forword = "input";
		}
		return forword;
	}

	public HttpSession getSession() {
		return session;
	}


}
