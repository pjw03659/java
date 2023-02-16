package 상속;

public class 원더우먼 extends 우먼 {
	boolean strong;
	
	public void artifact() {
		System.out.println("이름은 "+name);
		System.out.println("티아라는 부메랑");
	}

	@Override
	public String toString() {
		return "원더우먼 [strong=" + strong + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
	
	
}		
