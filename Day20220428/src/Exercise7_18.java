
public class Exercise7_18 {
	
	static void action(Robot R) {
		if (R instanceof DanceRoBot) {
			DanceRoBot dr = (DanceRoBot)R;
			dr.dance();
		} else if (R instanceof SingRobot) {
			SingRobot sr = (SingRobot)R;
			sr.sing();
		}  else if (R instanceof DrawRobot) {
			DrawRobot sr = (DrawRobot)R;
			sr.draw();
		}
	}

	public static void main(String[] args) {
		Robot[] arr = {new DanceRoBot(), new SingRobot(), new DrawRobot()};
		
		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
	}

}

class Robot {}

class DanceRoBot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}
class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다");
	}
}
class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}

