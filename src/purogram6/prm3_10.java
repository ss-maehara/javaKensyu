package purogram6;

import java.util.Scanner;

public class prm3_10 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_10();
	}

	public static void program3_10() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int sum = calculation(inputNum);

		System.out.println(sum);
	}

	/**
	 * 0が入力するまで繰り返し入力した数値を合計する。
	 * @param inputNum1 最初に入力した数値
	 * @return
	 */
	public static int calculation(int inputNum1) {
		Scanner scanner = new Scanner(System.in);

		int total = 0;
		while (inputNum1 != 0) {
			total += inputNum1;
			inputNum1 = scanner.nextInt();

		}
		return total;

	}
}
