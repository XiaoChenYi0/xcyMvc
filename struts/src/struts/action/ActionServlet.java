package struts.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import struts.from.ActionForm;
import struts.from.FullForm;
import struts.from.XmlBean;

public class ActionServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unchecked")
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String path = this.getPath(request.getServletPath());
		Map<String,XmlBean> map = (Map<String, XmlBean>) this.getServletContext().getAttribute("struts");
		XmlBean xml = map.get(path);
		String formclass = xml.getBeanClass();
		ActionForm form = FullForm.full(formclass,request);
		String actionType = xml.getActionType();
		Action action = null;
		String url = "";
		try{
			Class<?> classstr = Class.forName(actionType);
			action = (Action) classstr.newInstance();
			url = action.execute(request, form, xml.getActionForward());
			
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("严重：控制器异常！");
		}
		RequestDispatcher dis = request.getRequestDispatcher(url);
		dis.forward(request, response);
	}
	
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		this.doGet(request, response);
	}
    
    private String getPath(String servletpath){
    	return servletpath.split("\\.")[0];
    }
}
