package purogram7;

import java.util.Scanner;

public class prm4_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_05();
	}

	public static void program4_05() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		boolean isNumJudge = isCheckDivisible(inputNum);
		output(isNumJudge);

	}

	public static void output(boolean isNumJudge) {
		if (isNumJudge) {
			System.out.println("割り切れる");
		} else {
			System.out.println("割り切れない");
		}
	}

	//turefale
	public static boolean isCheckDivisible(int num) {
		if (num % 5 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
