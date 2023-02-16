package 연습문제;

public class 내차들 {

	public static void main(String[] args) {
		CoffeTruck ct1 = new CoffeTruck();
		ct1.cc=3000;
		ct1.gas=8;
		ct1.type="트럭";
		ct1.usage="커피트럭";
		ct1.run();
		ct1.fuel();
		System.out.println(ct1);
	}

}
