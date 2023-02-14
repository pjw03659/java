package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		//꼭 하고 싶은 것 9가지 작성, 프린트
		String[][] s = {
				{"영화보기","책읽기","잠자기"},
				{"미국 여행하기","호주 여행하기","유럽 여행하기"},
				{"돈 많이 벌기","맛있는 음식 먹기","푹 쉬기"}
		};
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
		
		}
	}


