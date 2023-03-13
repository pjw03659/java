package 자바db연결;

public class ProductDAO {
	//CRUD 기능 메서드 생성
	public void insert(ProductVO bag) {
		//1.가방이 전달되면 저장
		//2.필요할 때 가방에서 데이터를 하나씩 꺼내주세요.
		System.out.println("전달된 id는 "+bag.getId());
		System.out.println("전달된 name은 "+bag.getName());
		System.out.println("전달된 contnent는 "+bag.getContent());
	}
}
