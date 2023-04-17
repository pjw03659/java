package 컬렉션2;

import java.util.HashSet;
import java.util.Iterator;

public class Set반복자iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> bag = new HashSet<>();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		bag.add("볼펜");
		System.out.println(bag.size());
		System.out.println(bag);
		
		Iterator<String> it =bag.iterator();
		System.out.println(it.hasNext());
		for (int i = 0; i < bag.size(); i++) {
			String x = it.next();
			System.out.println(x);
		}
	}

}
