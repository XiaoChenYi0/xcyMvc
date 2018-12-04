package test;

import struts.from.ActionForm;

public class TestForm extends ActionForm{
	public TestForm(){
		
	}
	
	private String name = "";
	
	private String pass = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
