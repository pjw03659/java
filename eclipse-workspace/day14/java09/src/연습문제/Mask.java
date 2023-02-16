package 연습문제;

public class Mask {
	String color;
	int price;
	int amount;
	public Mask(String color, int price, int amount) {
		this.color = color;
		this.price = price;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "mask [color=" + color + ", price=" + price + ", amount=" + amount + "]";
	}
	
}
