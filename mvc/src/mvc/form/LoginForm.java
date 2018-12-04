package mvc.form;

public class LoginForm extends ActionForm implements Comparable<Object>{
	public LoginForm(){
		
	}
	
	public LoginForm(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	private String username;
	
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean equals(Object o){
		return false;
	}

	@Override
	public String toString() {
		return "LoginForm [username=" + username + ", password=" + password
				+ "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
