package 연습문제;

public class PC상황표 {

	public static void main(String[] args) {
		count_Thread count = new count_Thread();
		timer_Thread timer = new timer_Thread();
		image_Thread image = new image_Thread();
		
		count.start();
		timer.start();
		image.start();
	}

}
