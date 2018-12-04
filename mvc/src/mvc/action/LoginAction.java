package mvc.action;

import mvc.form.Action;
import mvc.form.ActionForm;
import mvc.form.LoginForm;

public class LoginAction implements Action{

	@Override
	public String execute(ActionForm form) {
		// TODO Auto-generated method stub
		LoginForm login = (LoginForm) form;
		System.out.println(login);
		return login.toString();
	}

}
