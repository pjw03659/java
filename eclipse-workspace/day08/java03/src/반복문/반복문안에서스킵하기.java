package 반복문;

public class 반복문안에서스킵하기 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트
		for(int i=1; i<=10;i++) {
			if((i%2)==1) {
				continue;
			} else {
				System.out.println(i);
			}
			if(i==8) {
				break;
			}
		}
		System.out.println("휴~ for문 다 끝났다");
	}

}
