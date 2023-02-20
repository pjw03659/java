package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제 {
	public static void main(String[] args) {
		HashSet lotto = new HashSet();
		Random r = new Random(42);
		
		boolean size = true;
		
		while(size) {
			lotto.add(r.nextInt(1000));
			if(lotto.size()==6) {
				size = false;
			}
		
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}
}
