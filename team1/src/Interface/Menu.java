package Interface;

import Domain.MenuItem;

public interface Menu{ // 메뉴판
	public void menuList(); // 메뉴 배열 리스트 출력
	public MenuItem choose(String name); // 메뉴 고르기
	public void menuAdd(int id, String name, int price); // 메뉴 추가
	public void menuRemove(String name); // 메뉴 삭제
}