package a220117;

public class VarAndMethod {
	//변수와 메서드
	
	/*
	 * 스타크래프트로 예시
	 * 테란, 저그, 프로토스 중
	 * 베럭 >> 마린
	 * 
	 * 마린을 프로그래밍 화 하는 법
	 * 1. 마린에 관련된 데이터 수집
	 * 		속성 : 체력 40/40(현재값/최대값), 데미지 6 
	 * 			   ↑ 10마리를 생성하든 100마리를 생성하든 똑같은 조건
	 * 		
	 * 		그중 현재체력은 생성 후 각자 가진 다른 값
	 * 		(싸우다 온 애도 있고 죽어서 0된애도 있고)
	 * 		
	 * 		데미지도 6 + 1 + 1 + 1 업그레이드, 즉 변화에 의해서 바뀜. (업그레이드 하면 이건 일괄적용) >> so 클래수 변수
	 * 		현재체력 >> 인스턴스 변수
	 * 		최대체력 >> 클래스 변수
	 * 		킬수 >> 인스턴스 변수
	 * 
	 * 인스턴스 변수 : 클래스의 인스턴스를 생설할 때 만들어진다
	 * 				   독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다
	 * 
	 * 클래스변수    : 인스턴스변수 앞에 static붙임
	 * 				   모든 인스턴스가 공통된 저장공간(변수)를 공유
	 * 				   한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야하는 속성의 경우 클래스변수로 선언
	 * 		
	 * 		기능 : 스팀팩 사용
	 * 
	 * 
	 * 		상속 : 소형유닛, 종족
	 * 		인터페이스 구현 : 뚜벅이, 벙커로 들어갈 수 있다, 원거리 딜링을 할 수 있다
	 * 		
	 */
}
