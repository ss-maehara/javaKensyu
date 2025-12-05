package program8;

public class prm5_01_main {

	public static void main(String[] args) {
		program5_01main();

	}

	public static void program5_01main() {
		int input = 1;
		prm5_01 p01 = new prm5_01();
		String hand = p01.InputNumberToString(input);
		System.out.println(hand);
	}
}
