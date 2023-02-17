package 상속기본;

public class 볼펜 extends 학용품{
	double thickness;

	
	public 볼펜(int price, String company, double thickness) {
		super(price, company);
		this.thickness = thickness;
	}
	public void 글을쓰다() {
		System.out.println("볼펜으로 글을 씁니다.");
	}
	@Override
	public String toString() {
		return "볼펜 [thickness=" + thickness + ", price=" + price + ", company=" + company + "]";
	}
	
}
