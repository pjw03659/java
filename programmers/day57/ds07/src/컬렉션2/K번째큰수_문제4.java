package 컬렉션2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수_문제4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		while(true) {
			int data =sc.nextInt();
			if(data==0) {
				break;
			}else {
				tree.add(data);
			}
		}
		System.out.println(tree);
		Object[] arr = tree.toArray();
		System.out.println("첫번째 작은 수: "+ arr[0]);
		System.out.println("두번째 작은 수: "+ arr[1]);
		System.out.println(k+"번째 작은 수: "+ arr[k-1]);
	}

}
