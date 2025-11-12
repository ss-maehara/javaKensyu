package purogram7;

import java.util.Scanner;

public class prm4_16 {

	public static void main(String[] args) {
		program4_16();

	}

	public static void program4_16() {
		numJudge();
	}

	/**
	 * 1～5までは有効、それ以外は入力範囲外ですと表示させる。
	 */
	public static void numJudge() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		if (inputNum <= 5 && inputNum >= 1) {
			System.out.println(inputNum);
		} else {
			System.out.println("入力範囲外です。");
		}
	}
}
