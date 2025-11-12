package purogram7;

import java.util.Scanner;

public class prm4_12 {

	public static void main(String[] args) {
		program4_12();

	}

	public static void program4_12() {
		// 入力する関数
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力1:");
		int inputNum1 = scanner.nextInt();

		System.out.print("入力2:");
		int inputNum2 = scanner.nextInt();
		// 計算を行う関数
		int result = calculation(inputNum1, inputNum2);
		// 表示を行う関数
		String resultSumOutput = OutputResult(result);

		System.out.println("出力3:" + resultSumOutput);
	}

	/**
	 * 計算をおこなう
	 * @param inputNum1
	 * @param inputNum2
	 * @return 足し算をおこなった結果
	 */
	public static int calculation(int inputNum1, int inputNum2) {
		return inputNum1 + inputNum2;

	}

	/**
	 * 表示をおこなう関数
	 * @param suminput
	 * @return 表示する文字列
	 */
	public static String OutputResult(int suminput) {
		String stringResult = String.valueOf(suminput);
		return stringResult;

	}
}
