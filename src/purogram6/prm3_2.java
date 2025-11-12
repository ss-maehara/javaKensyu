package purogram6;

import java.util.Scanner;

public class prm3_2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_2();
	}

	public static void program3_2() {
		Scanner scanner = new Scanner(System.in);
		String inputAnimalName = scanner.next();

		int count = 1;
		String output = "";

		//入力された文字列を判定して繰り返し回数を決める。

		switch (inputAnimalName) {
		case "わん":
			count = 11;
			output = "わんちゃん";
			break;

		case "ねこ":
			count = 22;
			output = "ねこちゃん";
			break;

		default:
			count = 1;
			output = inputAnimalName;

		}

		animalCount(count, output);
		System.out.println("\n");
		whileAnimalCount(count, output);

	}

	/**
	 * 出力回数をおこなう。
	 * @param animalCount 繰り返し回数
	 * @param animalOutput 出力する文字列
	 */
	public static void animalCount(int animalCount, String animalOutput) {
		for (int i = 0; i < animalCount; i++) {
			System.out.println(animalOutput);
		}
	}

	//上のwhileバージョン
	public static void whileAnimalCount(int animalCount, String animalOutput) {
		int i = 0;
		while (i < animalCount) {
			System.out.println(animalOutput);
			i++;
		}
	}
}
