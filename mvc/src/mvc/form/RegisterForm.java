package mvc.form;

public class RegisterForm extends ActionForm implements Comparable<Object>{
	public RegisterForm(){
		
	}
	
	private String username = "";
	
	private String new_password = "";
	
	private String old_password = "";
	
	private String phone = "";

	@Override
	public String toString() {
		return "Register [username=" + username + ", new_password="
				+ new_password + ", old_password=" + old_password + ", phone="
				+ phone + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNew_password() {
		return new_password;
	}

	public void setNew_password(String new_password) {
		this.new_password = new_password;
	}

	public String getOld_password() {
		return old_password;
	}

	public void setOld_password(String old_password) {
		this.old_password = old_password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public boolean equals(Object o){
		return false;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
