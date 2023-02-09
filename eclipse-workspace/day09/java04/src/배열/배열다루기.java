package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
//		int[] x = new int[10];
//		x[0]=10;
//		x[1]=20;
//		
//		for(int i=0;i<x.length;i++) {
//		System.out.println(x[i]);
//		}
		char[] gender= {'남','여','여','남'};
		String[] name= {"아빠", "엄마","누나","나"};
		double[] eye= {0.6, 1.5, 0.3, 0.5};
		boolean[] lunch= {true,true, false, true};
		
		for (int i = 0; i < gender.length; i++) {
			System.out.println("가족"+(i+1)+"의 성별:"+gender[i]);
		}
		for (int i = 0; i < name.length; i++) {
			System.out.println("가족"+(i+1)+"의 이름:"+name[i]);
		}
		for (int i = 0; i < eye.length; i++) {
			System.out.println("가족"+(i+1)+"의 시력:"+eye[i]);
		}
		for (int i = 0; i < lunch.length; i++) {
			System.out.println("가족"+(i+1)+"의 점심식사 여부:"+lunch[i]);
		}
	}

}
