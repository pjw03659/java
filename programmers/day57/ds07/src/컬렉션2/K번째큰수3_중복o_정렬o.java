package 컬렉션2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복o_정렬o {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size= sc.nextInt();
		int k = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		//TreeSet<Integer> num = new TreeSet<Integer>(Collections.reverseOrder());//내림차순
		
		
		for(int i=0; i< size; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set);
	}

}
