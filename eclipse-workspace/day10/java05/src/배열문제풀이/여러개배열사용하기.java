package 배열문제풀이;

public class 여러개배열사용하기 {

	public static void main(String[] args) {
		String[] 식구= {"아버지","어머니","누나","나"};
		int[] age = {100,88,33,24};
		double[] height = {177.5,152.2,165.4,175.4};
		
		System.out.println("이름\t나이\t키");
		System.out.println("--------------------");
		for (int i = 0; i < height.length; i++) {
			System.out.println(식구[i] + "\t"+age[i]+"\t"+height[i]);
		}

	}

}
