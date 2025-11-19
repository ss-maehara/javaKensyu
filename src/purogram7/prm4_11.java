package purogram7;

import java.util.Scanner;

public class prm4_11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_11();
	}

	public static void program4_11() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力1:");
		int inputNum1 = scanner.nextInt();

		System.out.print("入力2:");
		int inputNum2 = scanner.nextInt();

		System.out.println("計算方法：(1：足し算　２：引き算　３：掛け算　４：割り算）");
		System.out.print("選択:");
		int calculationSelection = scanner.nextInt();

		//計算方法表示
		String displayCalculationMethod = calculationMethod(calculationSelection);
		//入力1、入力2を計算する
		int outputResult = inputCalculation(inputNum1, inputNum2, calculationSelection);
		System.out.println("結果:" + inputNum1 + displayCalculationMethod + inputNum2 + "=" + outputResult);

	}

	/**11月11日
	 * 計算方法表示
	 * @param calculationSelection
	 * @return 記号
	 */
	public static String calculationMethod(int calculationSelection) {

		switch (calculationSelection) {
		case 1:
			return "+";
		case 2:
			return "-";
		case 3:
			return "*";
		case 4:
			return "/";
		default:
			return "?";
		}

	}

	/**
	 * 入力1、入力2を計算する
	 * @param inputNum1 入力された数字1
	 * @param inputNum2 入力された数字
	 * @param calculationSelection　計算方法
	 * @return 計算済みの値
	 */
	public static int inputCalculation(int inputNum1, int inputNum2, int calculationSelection) {
		int result = 0;
		switch (calculationSelection) {
		case 1:
			result = inputNum1 + inputNum2;
			return result;
		case 2:
			result = inputNum1 - inputNum2;
			return result;
		case 3:
			result = inputNum1 * inputNum2;
			return result;
		case 4:
			result = inputNum1 / inputNum2;
			return result;
		default:
			return result;
		}

	}
}
