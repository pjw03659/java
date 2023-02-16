package 스태틱;
		
public class 직원 {
	
	String name;
	int age;
	char gender;
	static int count;
	static int total_age;
	
	public static void getAvg() {
		
		
		System.out.println(total_age/count);
	}
	
	
	
	public 직원(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		total_age+=age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
