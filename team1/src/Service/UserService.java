package Service;

import static util.ScannerUtil.nextInt;
import static util.ScannerUtil.nextLine;

import Domain.User;
import Service.ProductService;
public class UserService {
//	private List<User> users = new ArrayList<User>();
//	ProductService productService = new ProductService();
	
//	public UserService() {
//		users.add(new User("1111"));
//	}
	private static UserService userService = new UserService();
	private UserService() {}
	public static UserService getInstance() {
		return userService;
	}
	
	
	public void login() {
		for(boolean a = true ; a ;) { // 로그인 메서드
		String password = nextLine("비밀번호를 입력해주세요 >>");
		if (password.equals(User.getInstance().getPassword())) {
			System.out.println("로그인 성공");
			a = false;
		} else{
			System.out.println("엥??? 비밀번호가 틀려요! 다시 입력해주세요 >>");
			a = true;
		}
			
		}
	}
	public void passwordModify() { // 관리자 비밀번호 변경 메서드
		for(boolean a = true ; a ;) { // 비밀번호 변 메서드
			String password = nextLine("기존비밀번호를 입력해주세요 >>");
			if (password.equals(User.getInstance().getPassword())) {
				System.out.println("비밀번호가 확인되었습니다.");
				User.getInstance().setPassword(nextLine("변경하실 비밀번호를 입력하세요 >>"));
				System.out.println("변경 되었습니다.");
				a = false;
//			configuration();
			} else{
				System.out.println("엥??? 비밀번호가 틀려요! 다시 입력해주세요 >>");
				a = true;
				
			}
		}
	}
			
//		User user = findBy(nextLine("기존 비밀번호를 입력하세요"));
//		if(user == null) {
//			System.out.println("비밀번호가 다릅니다.");
//			return;
//		}
//		users.remove(users);
//		User.getInstance().setPassword(nextLine("변경하실 비밀번호를 입력하세요"));
		
//	}
		
	
	public void configuration() { // 관리자 상품관리 메서드
		
		for(boolean b = true ; b ;) { try {
			
			
		int config = nextInt("1. 상품조회\t2. 상품등록\t3. 상품수정\t4. 상품삭제\t5. 비밀번호변경\t6. 뒤로가기 >>");
		switch (config) {
		case 1:
			ProductService.getInstance().productsList();
			break;
		case 2:
			ProductService.getInstance().productRegister();
			System.out.println("등록 되었습니다.");
			break;
			
		case 3:
			ProductService.getInstance().productModify();
			System.out.println("수정 되었습니다.");
			break;
			
		case 4:
			ProductService.getInstance().productRemove();
			System.out.println("삭제 되었습니다.");
			break;
			
		case 5:
			getInstance().passwordModify();
			break;
			
		case 6:
			return;
			
		
		default:
			System.out.println("1~6까지의 번호를 입력해주세요");
			break;
		}
		
		} catch (NumberFormatException e) {
			System.out.println("1 ~ 6 까지의 [숫자]로 입력해주세요");
		}
		}
	}
//	public User findBy(String password) {
//		User user = null;
//		for(User u : users) {
//			if(u.getPassword() == password) {
//				user = u;
//			}
//		}
//		return user;
//	}
		
	
	public static void main(String[] args) { // 중간 확인용
		UserService userService = new UserService();
		
//		userService.login();
//		userService.passwordModify();
		
//		userService.configuration();
	
	}
}
