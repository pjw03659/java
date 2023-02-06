package 확인;

public class 문제풀이3 {

	public static void main(String[] args) {
		
		double x =33.3;
		double y= 22.2;
		
		boolean result1= (x==44.2);
		boolean result2= (x==y);
		boolean result3= (y>55);
		

		System.out.println("x와 44.2가 동일한가? "+result1);
		System.out.println("x와 y가 동일한가? "+result2);
		System.out.println("y는 55보다 큰가? "+result3);
	}

}
