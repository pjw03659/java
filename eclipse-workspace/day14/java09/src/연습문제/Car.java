package 연습문제;

public class Car {
	int cc;
	int gas;
	public void run() {
		System.out.println("차를 운행합니다.");
	}
	public void gas() {
		System.out.println("기름이 "+gas+"L 남았습니다.");
	}
	@Override
	public String toString() {
		return "Car [cc=" + cc + ", gas=" + gas + "]";
	}
	
}
