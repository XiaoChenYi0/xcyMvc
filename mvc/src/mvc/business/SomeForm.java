package mvc.business;

import mvc.form.ActionForm;

public class SomeForm extends ActionForm implements Comparable<Object>{
	
	public SomeForm(){
		
	}
	
	private String a = "";
	
	private String b = "";
	
	

	@Override
	public String toString() {
		return "SomeForm [a=" + a + ", b=" + b + "]";
	}



	public String getA() {
		return a;
	}



	public void setA(String a) {
		this.a = a;
	}



	public String getB() {
		return b;
	}



	public void setB(String b) {
		this.b = b;
	}



	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
