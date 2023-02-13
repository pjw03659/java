package 배열심화;

public class 깊은복사확인문제 {
	public static void main(String[] args) {
		String[] subject= {"국어","영어","수학","컴퓨터","회화"};
		int[] term1= {44,66,22,99,100};
		int[] term2= term1.clone();
		term2[0]=22;
		term2[2]=88;
		System.out.println("1학기 성적:");
		for (int i = 0; i < term2.length; i++) {
			System.out.println(subject[i]+": "+term1[i]);

		}
		System.out.println("2학기 성적:");
		for (int i = 0; i < term2.length; i++) {
			System.out.println(subject[i]+": "+term2[i]);

		}
		int same=0;
		int up=0;
		String up_sub="";
		for (int i = 0; i < term2.length; i++) {
			if(term1[i]==term2[i]) {
				same++;
			} else if(term1[i]<term2[i]) {
				up++;
				up_sub= subject[i]+ " ";
			}
		}
		System.out.println("동일한 과목수: "+same);
		System.out.println("오른 과목수: "+up);
		System.out.println("오른 과목명: "+up_sub);
	}
	
	
}
