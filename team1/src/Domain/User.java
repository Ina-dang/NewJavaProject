package Domain;

public class User { //AdminService
/*
 * 직원인지 관리자인지 
 */
	
	boolean admin;
	int password = 1111;
	
	public User() {}
	
	
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
	
	
	
}
