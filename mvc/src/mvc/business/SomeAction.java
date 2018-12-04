package mvc.business;

import mvc.form.Action;
import mvc.form.ActionForm;

public class SomeAction implements Action{

	@Override
	public String execute(ActionForm form) {
		// TODO Auto-generated method stub
		SomeForm some = (SomeForm) form;
		return some.toString();
	}

}
