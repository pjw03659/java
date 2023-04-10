package 배열;

public class 배열최솟값구하기1 {

	public static void main(String[] args) {
		int[] s = {90, 80, 20, 60, 70};
		
		int min=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(s[i]<min) {
				min=s[i];
			}
		}
		System.out.println("최솟값은 "+ min);
	}

}
