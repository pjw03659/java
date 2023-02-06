package 연산자;

public class 비교연산자 {

	public static void main(String[] args) {
		//기본형 데이터는 비교연산자를 가지고 비교 가능
		//기본형 데이터가 아니면 비교연산자를 가지고 비교 불가
		int id=1111;
		int id2=2222;
		
		int pw= 3333;
		int pw2= 3333;
		
		System.out.println("아이디가 동일한가 ? " + (id == id2));
		System.out.println("패스워드가 동일한가? " + (pw == pw2));
	}

}
