package 연습문제;

public class CoffeTruck extends Truck {
	String usage;
	
	@Override
	public void run() {
		System.out.println("커피트럭을 운행합니다.");
		System.out.println("배기량은 "+cc+"입니다.");
		
	}
	public void fuel() {
		System.out.println("연료가 "+gas+"L 남았습니다.");
		if(gas<10) {
			System.out.println("가까운 주유소에서 연료를 보충하세요");
		}
	}
	@Override
	public String toString() {
		return "CoffeTruck [usage=" + usage + ", type=" + type + ", cc=" + cc + ", gas=" + gas + "]";
	}
	
}
