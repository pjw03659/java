package 상속기본;

public class 학용품 {
	int price;
	String company;
	public 학용품(int price, String company) {
		this.price = price;
		this.company = company;
	}
	public void 사다() {
		System.out.println("학용품 가격: "+price+"원 입니다.");
	}
	@Override
	public String toString() {
		return "학용품 [price=" + price + ", company=" + company + "]";
	}
	
}
