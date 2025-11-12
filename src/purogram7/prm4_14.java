package purogram7;

import java.util.Scanner;

public class prm4_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_14();
	}

	public static void program4_14() {
		//入力する関数
		String inputCharacter = inputCharacter();
		//入力判定をおこなう
		boolean inputJudge = inputJudge(inputCharacter);
		//出力内容を判定
		String outputJudge = outputJudge(inputCharacter, inputJudge);
		outputresult(outputJudge);
	}

	/**11月12日
	 * 入力する関数
	 * @return 入力した文字列
	 */
	public static String inputCharacter() {
		Scanner scanner = new Scanner(System.in);

		return scanner.next();

	}

	/**
	 * 入力判定をおこなう
	 * @param inputCharacter
	 * @return ねこorぬこならtrue,それ以外はfaile
	 */
	public static boolean inputJudge(String inputCharacter) {
		if (inputCharacter.contains("ねこ") || inputCharacter.contains("ぬこ")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 出力内容を判別する関数
	 * @param inputCharacter
	 * @param inputJudge
	 * @return 表示内容
	 */
	public static String outputJudge(String inputCharacter, boolean inputJudge) {
		if (inputJudge) {
			if (inputCharacter.contains("ねこ")) {
				return "ねこさま！";
			} else {
				return "ぬこさま！";
			}
		} else {
			return "おかえりください";
		}

	}

	/**
	 * 出力
	 * @param outputJudge
	 */
	public static void outputresult(String outputJudge) {
		System.out.println(outputJudge);
	}
}
