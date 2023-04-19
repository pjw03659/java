package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기2 {

	public static void main(String[] args) {
		int[] num = {6, 1, 2, 3, 5, 9};
		print(num);
		
		swap(num, 0,5);
		print(num);
	}
	
	public static void swap(int[] num ,int x, int y) {
		int temp=num[y];
		num[y]=num[x];
		num[x]=temp;
	}
	
	
	
	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}
	
	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}
}
