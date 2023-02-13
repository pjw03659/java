package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬순위 {

	public static void main(String[] args) {
		//정렬을 할때는 Arrays
		Random r = new Random(42);
		int[] jumsu = new int[10000];
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i]=r.nextInt(1000)+1;
			
		}
		//for-each:알아서 위치값으 옮겨주면서 하나씩 꺼내옵니다.
		for(int x:jumsu) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		//오름차순
		Arrays.parallelSort(jumsu);
		for(int x:jumsu) {
			System.out.println(x);
		}
		System.out.println("최솟값: "+jumsu[0]);
		System.out.println("최댓값: "+jumsu[jumsu.length-1]);
		
		int sum30=0;
		for(int i =7000; i<jumsu.length;i++) {
			sum30=sum30+i;
		}
		System.out.println(sum30/3000.0);
		int sum_low=0;
		for(int i=0; i<3000;i++) {
			sum_low=sum_low+jumsu[i];
		}
		System.out.println(sum_low/3000.0);
		String result= Arrays.toString(jumsu);//비파괴
		System.out.println(result);
	}
	

}
