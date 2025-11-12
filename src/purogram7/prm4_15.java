package purogram7;

import java.util.Scanner;

public class prm4_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_15();
	}

	public static void program4_15() {
		inputNumJudge();
	}

	/**
	 * 入力された値が数字かどうかを判定する。
	 */
	public static void inputNumJudge() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = 0;
		try {
			inputNum = scanner.nextInt();
			System.out.println(inputNum);
		} catch (Exception e) {
			System.out.println("数字を入力してください");
		}
	}
}
