package 배열문제풀이;

public class 성적변동 {

	public static void main(String[] args) {
		int[] term1= {77,88,99,55,70};
		int[] term2= {99,100,88,80,70};
		
		int count =0;
		int count2=0;
		for(int i =0; i<term2.length;i++) {
			if(term1[i]<term2[i]) {
				count++;
			}else if(term1[i]==term2[i]) {
				count2++;
			}
		}
		System.out.println("향상된 학생수 "+count+"명");
		System.out.println("동일한 학생수 "+count2+"명");

	}

}
