package program8;

import java.util.Scanner;

public class prm5_02 {

	public static void main(String[] args) {
		program5_2();

	}

	public static void program5_2() {
		//入力関数
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力:");
		int input = scanner.nextInt();
		//じゃんけんの出す手
		String result = InputNumberToString(input);
		//文字数を判定
		int wordCount = GetNumberOfCharacters(result);
		System.out.println(wordCount + "文字");

	}

	/**12/1
	 * 数値を文字列に変えて返す
	 * @param input 入力数字
	 * @return 文字列
	 */
	public static String InputNumberToString(int input) {
		switch (input) {
		case 1:
			return "グー";
		case 2:
			return "チョキ";
		case 3:
			return "パー";
		default:
			return "エラー";
		}
	}

	//文字数を判定
	public static int GetNumberOfCharacters(String result) {
		if (result.equals("グー") || result.equals("パー")) {
			return 2;
		} else {
			return 3;
		}
	}
}
