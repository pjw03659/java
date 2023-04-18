package 스택;

import java.util.Arrays;
import java.util.Stack;

public class 자연수뒤집어배열로만들기_stack {

	public static void main(String[] args) {
		long n =12345;
		
		String[] s = String.valueOf(n).split("");
		
		Stack<String> stack = new Stack<String>();
		for(String x:s) {
			stack.push(x);
		}
		System.out.println(stack);
		int[] answer = new int[stack.size()];
		for(int i=0 ; i<answer.length ; i++){
			answer[i]=Integer.parseInt(stack.pop());
		}
		System.out.println(Arrays.toString(answer));
	}

}
