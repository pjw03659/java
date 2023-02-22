package 인터페이스;

public class applecomputer implements computer {

	@Override
	public void cpu() {
		System.out.println("cpu 24% 사용중");
		
	}

	@Override
	public void ram() {
		System.out.println("ram 3029MB 사용중");
		
	}

	public void battery() {
		System.out.println("배터리 잔량: 55%");
		
	}
	
}
