package 인터페이스;

public class bananacomputer implements computer{

	@Override
	public void cpu() {
		System.out.println("cpu 11% 사용중");
		
	}

	@Override
	public void ram() {
		System.out.println("ram 1529MB 사용중");
		
	}

	public void battery() {
		System.out.println("배터리 잔량: 78%");
		
	}

}
