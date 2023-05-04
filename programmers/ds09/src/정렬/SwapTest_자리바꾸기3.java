package 정렬;

import java.util.Arrays;

public class SwapTest_자리바꾸기3 {

	public static void main(String[] args) {
		String[] str= {"햄버거", "샌드위치","커피"};
		print(str);
		swap(str,0,1);
		print(str);
		
	}
	
	public static void swap(String[] str, int a, int b ) {
		String temp= str[b];
		str[b]=str[a];
		str[a]=temp;
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
