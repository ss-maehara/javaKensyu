package purogram6;

import java.util.Scanner;

public class prm3_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_4();
	}

	public static void program3_4() {
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();

		//入力した文字列を反転
		String outputReverse = stringOutput(inputString);
		System.out.println(outputReverse);
		//入力した文字列を5回出力
		usuallyString(inputString);

		System.out.println();
		// 入力した文字列を反転While
		String WhileUutputReverse = WhileStringOutput(inputString);
		System.out.println(outputReverse);

		////入力した文字列を5回出力While
		WhileUsuallyString(inputString);
	}

	/**
	 * 文字列を反転して出力する
	 * @param inputString 入力した文字列
	 * @return 入力した文字列を反転させた文字列
	 */
	public static String stringOutput(String inputString) {
		String reverse = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			reverse = reverse + inputString.charAt(i);
		}
		return reverse;

	}

	/**
	 * 入力した文字列を5回出力させる。
	 * @param usually 入力した文字列
	 */
	public static void usuallyString(String usually) {
		for (int i = 0; i < 5; i++) {
			System.out.println(usually);
		}
	}

	//入力した文字列を反転して出力whileVer
	public static String WhileStringOutput(String inputString) {
		String reverse = "";
		int i = inputString.length() - 1;
		while (i >= 0) {
			reverse += inputString.charAt(i);
			i--;
		}
		return reverse;
	}

	public static void WhileUsuallyString(String usually) {
		int i = 0;
		while (i < 5) {
			System.out.println(usually);
			i++;
		}
	}
}
