package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		Random r= new Random(10);//씨앗값, seed
		for(int i=0; i<6;i++) {
		System.out.println(r.nextInt(45));
		}
	}

}
