package purogram7;

import java.util.Scanner;

public class prm4_03 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_03();
	}

	public static void program4_03() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力A :");
		int inputNumA = scanner.nextInt();
		System.out.print("入力B :");
		int inputNumB = scanner.nextInt();

		int output = comparison(inputNumA, inputNumB);

		System.out.println(output);
	}

	public static int comparison(int inputNumA, int inputNumB) {

		if (inputNumA < inputNumB) {
			return inputNumB;
		} else {
			return inputNumA;
		}
	}
}
