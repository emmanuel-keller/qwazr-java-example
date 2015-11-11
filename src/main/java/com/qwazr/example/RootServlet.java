package com.qwazr.example;

import com.qwazr.tools.FreeMarkerTool;
import com.qwazr.tools.ToolsManager;
import freemarker.template.TemplateException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RootServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		ToolsManager tools = (ToolsManager) request.getAttribute("tools");
		FreeMarkerTool freemarker = tools.get("freemarker");
		try {
			request.setAttribute("my_var", "Hello World! Java Servlet example.");
			freemarker.template("src/views/index.ftl", request, response);
		} catch (TemplateException e) {
			throw new ServletException(e);
		}
	}
}