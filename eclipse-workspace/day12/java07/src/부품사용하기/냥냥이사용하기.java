package 부품사용하기;

import 부품만들기.냥냥이;

public class 냥냥이사용하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		냥냥이 c1 = new 냥냥이();
		냥냥이 c2 = new 냥냥이();
		
		c1.name="냥돌이";
		c1.breed="코리안숏헤어";
		System.out.println("c1의 이름: "+c1.name);
		System.out.println("c1의 품종: "+c1.breed);
		System.out.println("집사 깨우기");
		c1.집사깨우기();
		c2.name="냥순이";
		c2.breed="코리안숏헤어";
		System.out.println("c2의 이름: "+c2.name);
		System.out.println("c2의 품종: "+c2.breed);
		System.out.println("식빵 굽기");
		c2.식빵굽기();
		
		
	}

}
