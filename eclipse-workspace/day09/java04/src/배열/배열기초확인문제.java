package 배열;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] num= new int[5];
		System.out.println(num.length);
		num[0]=100;
		System.out.println(num[0]);
		num[4]=500;
		System.out.println(num[4]);
		num[2]=200;
		System.out.println(num[2]);
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		for (int i = 0; i < num.length; i++) {
			System.out.println("num["+i+"]:"+num[i]);
		}
	}

}
