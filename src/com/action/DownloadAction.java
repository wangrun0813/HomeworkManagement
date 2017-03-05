package com.action;

import java.io.*;
import java.util.List;

import javassist.compiler.ast.StringL;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.dao.StudentDao;
import com.model.Homework;
import com.model.Student;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	private String uploadFileName;

	private HttpSession session;

	public DownloadAction() {
		session = ServletActionContext.getRequest().getSession();
	}

	public InputStream getDownloadFile() {
		try {
			uploadFileName = ServletActionContext.getRequest().getParameter(
					"uploadFileName");
			uploadFileName = new String(uploadFileName.getBytes("ISO8859-1"), "UTF-8");
			ServletActionContext.getResponse().setHeader("Content-Disposition","attachment;fileName="+java.net.URLEncoder.encode(uploadFileName, "UTF-8"));

		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File file = new File(
				"C:\\Users\\Administrator\\Workspaces\\MyEclipse 10\\homework\\"
						+ uploadFileName);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return fis;
	}

	public String execute() throws Exception {

		return super.execute();
	}

}
