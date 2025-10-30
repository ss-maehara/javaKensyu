package purogram6;

import java.util.Scanner;

public class prm3_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_5();
	}

	public static void program3_5() {
		Scanner scanner = new Scanner(System.in);
		String inputAnimalName = scanner.next();

		//入力された文字を判定
		String inputCatJude = "";
		String inputNotCat = "";

		switch (inputAnimalName) {
		case "ねこ":
			inputCatJude = inputAnimalName;
			//入力された文字列がねこだった時の処理
			outputCat(inputCatJude);
			System.out.println("\n");
			whileOutputCat(inputCatJude);
			break;

		default:
			inputNotCat = inputAnimalName;
			//入力された文字列がねこ以外の処理
			outputNotACat(inputNotCat);
			System.out.println("\n");
			whileOutputNotACat(inputNotCat);
		}

	}

	/**
	 * 入力された文字列がねこだった時の処理
	 * @param cat ねこ
	 */
	public static void outputCat(String cat) {
		for (int i = 0; i <= 2; i++) {
			System.out.println("くろ" + cat);
			System.out.println("しろ" + cat);
			System.out.println("みけ" + cat);
		}
	}

	//while文
	public static void whileOutputCat(String cat) {
		int i = 0;
		while (i <= 2) {
			System.out.println("くろ" + cat);
			System.out.println("しろ" + cat);
			System.out.println("みけ" + cat);
			i++;
		}
	}

	/**
	 * 入力された文字列がねこではない時の処理
	 * @param noCat ねこ以外
	 */
	public static void outputNotACat(String noCat) {
		String reverse = "";
		// 文字列を反転
		for (int i = noCat.length() - 1; i >= 0; i--) {
			reverse = reverse + noCat.charAt(i);
		}

		// 文字列と反転文字列をに3回出力
		for (int i = 0; i < 3; i++) {
			System.out.println(noCat);
			System.out.println(reverse);
		}
	}

	//while文
	public static void whileOutputNotACat(String noCat) {
		// 文字列を反転
		String reverse = "";
		int j = noCat.length() - 1;
		while (j >= 0) {
			reverse = reverse + noCat.charAt(j);
			j--;
		}
		// 文字列と反転文字列をに3回出力
		int i = 0;
		while (i < 3) {
			System.out.println(noCat);
			System.out.println(reverse);
			i++;
		}
	}
}
