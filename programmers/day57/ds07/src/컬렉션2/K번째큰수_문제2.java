package 컬렉션2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수_문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int k = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for(int i=0; i< size; i++) {
			set.add(sc.nextInt());
		}
		System.out.println(set);
		
	}

}
