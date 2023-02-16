package 연습문제;

public class Truck extends Car {
	String type;
	
	@Override
	public void run() {
		System.out.println("트럭이 운행합니다.");
	}

	@Override
	public String toString() {
		return "Truck [type=" + type + ", cc=" + cc + ", gas=" + gas + "]";
	}
	
}
