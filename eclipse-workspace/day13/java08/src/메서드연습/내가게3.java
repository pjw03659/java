package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 =new 계산기3();
		
		int price =6900;
		int count1 = 5;  //오전에 온 손님 수
		int count2 = 4;  //오후에 온 손님 수
		
		int total_count = cal3.add(count1, count2);
		int morning=cal3.mul(price, count1);
		int afternoon=cal3.mul(price, count2);
		int total_amount=cal3.add(morning, afternoon);
		int amount_per_one = cal3.div(total_amount,total_count);
		System.out.println("오늘 온 손님의 총 합은 "+total_count+"명입니다.");
		System.out.println("오전과 오후 손님수 차이는 "+Math.abs(cal3.minus(count1, count2))+"입니다.");
		System.out.println("오전에 들어온 손님의 결제 금액은 "+morning +"원 입니다.");
		System.out.println("오후에 들어온 손님의 결제 금액은 "+afternoon +"원 입니다.");
		System.out.println("오전과 오후에 들어온 손님의 결제 금액은 "+total_amount +"원 입니다.");
		System.out.println("1인당 결제 금액은 "+amount_per_one +"원 입니다.");
	}
}

	
