package com.qwazr.example;

import com.qwazr.library.annotations.Library;
import com.qwazr.tools.FreeMarkerTool;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

	@Library("freemarker")
	protected FreeMarkerTool freemarker;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			request.setAttribute("my_var", "Hello World! Java Servlet example.");
			request.setAttribute("last_job_execution", JobRunnable.lastJobExecution);
			freemarker.template("com/qwazr/example/index.ftl", request, response);
		} catch (TemplateException e) {
			throw new ServletException(e);
		}
	}
}