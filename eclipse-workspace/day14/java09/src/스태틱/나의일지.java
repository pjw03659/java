package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부",8,"마포구청역");
		System.out.println(Day.count);
		System.out.println(Day.total+"시간");
		Day day2 = new Day("주변산책",1,"망원역근처");
		System.out.println(Day.count);
		System.out.println(Day.total+"시간");
		Day day3 = new Day("시험요약정리",2,"집");
		System.out.println(Day.count);
		System.out.println(Day.total+"시간");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
	}

}
