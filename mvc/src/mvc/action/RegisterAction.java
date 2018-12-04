package mvc.action;

import mvc.form.Action;
import mvc.form.ActionForm;
import mvc.form.RegisterForm;

public class RegisterAction implements Action{

	@Override
	public String execute(ActionForm form) {
		// TODO Auto-generated method stub
		RegisterForm register = (RegisterForm) form;
		System.out.println(register);
		return register.toString();
	}

}
