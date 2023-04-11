package 배열;


public class 정리문제6 {

	public static void main(String[] args) {
		String s5 ="[10,20,30,40,50]";
		
		String result= s5.replace('[', ' ');
		result= result.replace(']', ' ');
		result= result.trim();
		
		String[] num = result.split(",");
		int [] number= new int[num.length];
		int sum=0;
		for (int i = 0; i < num.length; i++) {
			number[i]=Integer.parseInt(num[i]);
			sum= sum+number[i];
		}
		System.out.println(sum);
	}

}
