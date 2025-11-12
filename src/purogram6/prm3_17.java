package purogram6;

import java.util.Scanner;

public class prm3_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_17_2();
	}

	public static void program3_17() {
		Scanner scanner = new Scanner(System.in);
		String outputEvenNumber = evenNumberJudg(scanner);
		System.out.println(outputEvenNumber);
	}

	public static void program3_17_2() {
		Scanner scanner = new Scanner(System.in);
		int[] inputNum = new int[5];
		boolean[] isEvenNumbers = new boolean[5];
		//値を入力
		inputNumbers(scanner, inputNum);
		//偶数判定
		boolean isEvenNumber = false;
		for (int i = 0; 0 < inputNum.length; i++) {
			isEvenNumber = isEvenNumberJudg(inputNum[i]);
			//偶数なら結果を保存
			if (isEvenNumber) {
				isEvenNumbers[i] = true;
			}
		}
		//偶数があるかどうかをチェック
		for (int i = 0; 0 < inputNum.length; i++) {
			isEvenNumber = isEvenNumberJudg(inputNum[i]);
			//奇数か判定
			if (isEvenNumbers[i] == false) {
				continue;
			}
			isEvenNumber = true;
			break;
		}
		if (isEvenNumber == false) {
			System.out.println("偶数なし");
		}

		String output = "";
		//偶数の場合の結果を表示する
		for (int i = 0; 0 < inputNum.length; i++) {
			//偶数なら結果を保存
			if (isEvenNumbers[i]) {
				output = inputNum[i] + "、";
			}
		}
		//最後の文字を削除
		if (output.endsWith("、")) {
			output.substring(0, output.length() - 1);
		}

		System.out.println(output);
	}

	/**
	 * 入力された値が偶数かどうか判定
	 * @param scanner 入力された値判定
	 * @return 偶数の数字
	 */
	public static String evenNumberJudg(Scanner scanner) {
		String output = "";
		int inputNum = 0;
		int count = 0;
		for (int i = 1; i <= 5; i++) {
			inputNum = scanner.nextInt();
			//入力された値が偶数か判定
			if (inputNum % 2 == 0) {
				//入力回数2回目以降なら「、」を付ける。
				if (!(count == 0)) {
					output += "、";
				}
				String saucer = String.valueOf(inputNum);
				output += saucer;
				count++;

			}
		}
		if (count == 0) {
			return "偶数なし";
		} else {
			return "偶数の値は" + output;
		}
	}

	//入力
	public static void inputNumbers(Scanner scanner, int[] inputNum) {
		for (int i = 0; i < 5; i++) {
			inputNum[i] = scanner.nextInt();
		}
	}

	/**
	 * 入力された値が偶数か判定する関数
	 * @param scanner 入力された値判定
	 * @return 判定決壊 true:偶数 false:奇数
	 */
	public static boolean isEvenNumberJudg(int inputNum) {
		//入力された値が偶数か判定
		if (inputNum % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
