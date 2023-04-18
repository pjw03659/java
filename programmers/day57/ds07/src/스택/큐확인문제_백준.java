package 스택;

import java.util.LinkedList;
import java.util.Queue;

public class 큐확인문제_백준 {

	public static void main(String[] args) {
		int x = 6;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		for(int i =1; i<=x;i++) {
			queue.add(i);
		}
		System.out.println(queue);
		for(int i =0; i<=queue.size();i++) {
			queue.remove();
			System.out.println(queue);
			
			queue.add(queue.remove());
			System.out.println(queue);
		}
		queue.remove();
		System.out.println(queue);
		
	}
	

}
