package 형변환;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 콜렉션확인문제 {

	public static void main(String[] args) {
		//1.
		HashSet travel= new HashSet();
		travel.add("뉴욕");
		travel.add("도쿄");
		travel.add("런던");
		travel.add("파리");
		travel.add("시드니");
		travel.add("뉴욕");
		System.out.println(travel);
		
		
		//2.
		HashMap house = new HashMap();
		house.put("안방", "TV");
		house.put("거실", "쇼파");
		house.put("부엌", "냉장고");
		house.put("현관", "신발");
		System.out.println(house);
		System.out.println(house.get("현관"));
		house.replace("거실","책상");
		System.out.println(house); 
		
		//3.
		LinkedList todo = new LinkedList();
		todo.add("공부");
		todo.add("운동");
		todo.add("은행업무처리");
		todo.add("고양이 화장실청소");
		todo.add("휴식");
		System.out.println(todo);
		System.out.println("첫번째 할 일: "+todo.get(0)+"\n마지막 할 일: "+todo.get(4));
		todo.remove(1);
		todo.add(1, "청소");
		System.out.println(todo);
		
	}

}
