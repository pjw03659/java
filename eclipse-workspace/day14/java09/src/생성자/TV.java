package 생성자;

public class TV {
	
	public int ch;//0
	public int vol;//0
	public boolean onOff;//false
	
	//다른 생성자 메서ㅡ가 업으면 부품만들때(객체생성) 자동으로 생성됨/
	//기본 생성자(default constructor)
//	public TV() {
//		System.out.println("TV객체가 하나 생성됨");
//	}
	public TV() {
		System.out.println("TV객체가 하나 생성됨");
	}
	
	public TV(int x, int y, boolean z) { //매개변수(파라미터)
		//무더기영역(heap)에 저장된 멤버변수에 값을 넣어줌
		this.ch=x;
		this.vol=y;
		this.onOff=z;
		
	}
	
	public void 채널을바꾸다() {
		int change =1; //지역변수,local변수, 자동초기화X
		System.out.println(ch+"에서 "+change+"로 바꾸다.");
	}
	
	

	public void 유튜브보다() { //메서드를 만드는 것 -> 매서드 정의한다.
		System.out.println(vol+"을 키워서 동영상을 보다.");
	}
	
}
