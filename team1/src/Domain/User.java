package Domain;

public class User { //AdminService
/*
 * 직원인지 관리자인지 
 */
	
	private boolean admin;
	private int password = 1111;
	
		
	public User() {	}
	
	public User(int password) {
		super();
		this.password = password;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return String.format("%d", password);
	}
	
	
	
}
