package struts.from;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ActionListener implements ServletContextListener {


	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("信息：系统已经注销！");
	}


	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		ServletContext context = arg0.getServletContext();
		String xmlpath = context.getInitParameter("strusts-config");
		String tomcatpath = context.getRealPath("\\");
		try {
			Map<String,XmlBean> map = StrutsXml.initStrutsXml(tomcatpath+xmlpath);
			context.setAttribute("struts", map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("信息：系统已经加载完成！");
	}

}
