package mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.form.Action;
import mvc.form.ActionForm;
import mvc.unti.ActionMapping;
import mvc.unti.FullBean;

public class ActionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor of the object.
	 */
	public ActionServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//        System.out.println(request.getParameter("sign"));
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
        ActionForm form = FullBean.full(request);
        Action action = null;
        Map<String,String> map = ActionMapping.getMap();
        try{
        	String actionname = map.get(request.getParameter("sign"));
        	Class<?> classStr = Class.forName(actionname);
        	action = (Action) classStr.newInstance();
        }catch(Exception e){
        	e.printStackTrace();
        }
        String message = action.execute(form);
        PrintWriter out = response.getWriter();
        out.print(message);
        out.flush();
        out.close();
//        System.out.println(form);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
