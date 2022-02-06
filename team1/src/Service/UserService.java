package Service;

import static util.ScannerUtil.nextInt;

import java.util.ArrayList;
import java.util.List;

import Domain.User;

public class UserService {
	private List<User> users = new ArrayList<User>();
	ProductService productService = new ProductService();
	
	public UserService() {
		users.add(new User(1111));
	}
	User user = new User();
	
	
	
	void login() {
		for(boolean a = true ; a ;) { // 로그인 메서드
		int password = nextInt("주인님~ 비밀번호를 입력해주세요");
		if (password == user.getPassword()) {
			System.out.println("로그인 성공!@#!");
			configuration();
		} else{
			System.out.println("엥??? 비밀번호가 틀려요! 다시 입력해주세요~~");
		}
			
		}
	}
	void passwordModify() { // 관리자 비밀번호 변경 메서드
		User user = findBy(nextInt("기존 비밀번호를 입력하세요"));
		if(user == null) {
			System.out.println("비밀번호가 다릅니다.");
			return;
		}
		users.removeAll(users);
		user.setPassword(nextInt("변경하실 비밀번호를 입력하세요"));
	}
		
	
	void configuration() { // 관리자 상품관리 메서드
		
		for(boolean b = true ; b ;) {
			
		int config = nextInt("1번은 [상품조회] 2번은 [상품등록] 3번은 [상품수정] 4번은 [상품삭제] 5번은 [종료] 6번은 [손님메뉴판]");
		switch (config) {
		case 1:
			productService.userProductsList();
			break;
		case 2:
			productService.productRegister();
			break;
			
		case 3:
			productService.productModify();
			break;
			
		case 4:
			productService.productRemove();
			break;
			
		case 5:
			passwordModify();
			break;
			
		case 6:
			productService.productsList();
			break;
		default:
			return;
		}
		
		}
	}
	public User findBy(int password) {
		User user = null;
		for(User u : users) {
			if(u.getPassword() == password) {
				user = u;
			}
		}
		return user;
	}
		
	
	public static void main(String[] args) { // 중간 확인용
		UserService userService = new UserService();
		
		userService.login();
//		userService.passwordModify();
		
//		userService.configuration();
	
	}
}
