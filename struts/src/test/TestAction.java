package test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import struts.action.Action;
import struts.from.ActionForm;

public class TestAction implements Action {

	@Override
	public String execute(HttpServletRequest request, ActionForm form,
			Map<String, String> actionForward) {
		// TODO Auto-generated method stub
		String url = "failure";
		TestForm myform = (TestForm) form;
		if(myform.getName().equals("admin")){
			url = "success";
		}
		return actionForward.get(url);
	}

}
