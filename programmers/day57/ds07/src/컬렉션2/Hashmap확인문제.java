package 컬렉션2;

import java.util.HashMap;

public class Hashmap확인문제 {
	public static void main(String[] args) {
		String[] fruit = { "apple", "banana", "apple", "banana", "melon", "apple" };
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(String x : fruit) {
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		System.out.println(map);
		int max =0;
		String max_fruit="";
		for(String key : map.keySet()) {
			if(map.get(key)>max) {
				max=map.get(key);
				max_fruit+=key;
			}
		}
		
		System.out.println("득표수가 가장 많은 과일: "+max_fruit);
		System.out.println("득표수: "+ max);
		System.out.println(map.keySet());
	}
}
