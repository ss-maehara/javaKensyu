package purogram7;

import java.util.Scanner;

public class prm4_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_13();
	}

	public static void program4_13() {
		Scanner scanner = new Scanner(System.in);
		String inputCharacter = scanner.next();
		//入力された文字列にねこまたはぬこが入力されているか判定
		String outputString = nameJudge(inputCharacter);
		System.out.println(outputString);
	}

	/**
	 * 入力された文字列にねこまたはぬこが入力されているか判定
	 * @param inputCharacter
	 * @return 入力された文字列にねこorぬこがあれば様をつけ、以外はおかえりなさいを返す。
	 */
	public static String nameJudge(String inputCharacter) {
		if (inputCharacter.contains("ねこ")) {
			return "ねこさま！！";

		} else if (inputCharacter.contains("ぬこ")) {
			return "ぬこさま！！";

		} else {
			return "おかえりください。";
		}
	}
}
