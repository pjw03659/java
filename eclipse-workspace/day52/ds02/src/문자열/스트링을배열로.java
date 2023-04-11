package 문자열;

import java.util.Arrays;
import java.util.List;

public class 스트링을배열로 {
	public static void main(String[] args) {
		String all = "국어, 영어, 수학, 컴퓨터";
		String[] subject = all.split(", ");
		System.out.println("과목수는 " + subject.length);
		System.out.println("컴퓨터의 위치는 " + subject[3]);
		for (int i = 0; i < subject.length; i++) {
			if (subject[i].equals("컴퓨터")) {
				System.out.println(i);
			}
		}

		int count = 0;
		for (int i = 0; i < subject.length; i++) {
			if (subject[i].length() < 3) {
				count++;
			}
		}
		System.out.println(count);

		List<String> list = Arrays.asList(subject);
		System.out.println(list.indexOf("컴퓨터"));
	}

}
