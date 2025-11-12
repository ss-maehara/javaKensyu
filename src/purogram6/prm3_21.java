package purogram6;

import java.util.Random;
import java.util.Scanner;

public class prm3_21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_21();
	}

	public static void program3_21() {

		Random random = new Random();
		int randomInt = random.nextInt(100) + 1;

		int numPattern = 0;
		int inputNum = 0;
		String result = "";
		while (numPattern != 1) {
			//数字を入力
			inputNum = inputCheak();
			//入力された数字がランダム生成された数字と正解か大きいか小さいか判定
			numPattern = numCheck(inputNum, randomInt);
			//出力内容を表示する文字列を取得
			result = resultShow(numPattern, inputNum);
			System.out.println(result);
		}
	}

	/**11月4日
	 * 入力された値が数字か判定し、数字が入力されるまで繰り返す。
	 * @param scanner入力された数字を読み取る
	 * @return 入力された値
	 */
	public static int inputCheak() {
		Scanner scanner = new Scanner(System.in);
		String inputStrNum = "";
		boolean isNumber;
		int inputIntNum = 0;
		while (true) {
			try {
				System.out.print("数字を入力:");
				//数字入力
				inputStrNum = scanner.next();
				//数字か判定
				isNumber = inputStrNum.matches("[0-9]+");
				//数字ではない場合もう一度入力
				if (isNumber == false) {
					System.out.println("数字を入力してください");
					continue;
				}
				//文字列を数字に変換
				inputIntNum = Integer.parseInt(inputStrNum);
				//1未満100より大きいか判定し、条件を満たした場合のみもう一度入力
				if (inputIntNum < 1 || inputIntNum > 100) {
					System.out.println("1から100までの数字を入力してください");
					continue;
				}
				//正しい場合は入力終了
				break;
			} catch (NumberFormatException e) {
				System.out.println("数字を入力してください");
			}
		}
		return inputIntNum;
	}

	/**11月05日
	 * 入力された数字がランダム生成された数字と正解か大きいか、小さいか判定
	 * @param num
	 * @param randomInt
	 * @return 1:同じ 2:大きい 3:小さい -1:エラー
	 */
	public static int numCheck(int num, int randomInt) {
		try {
			if (num == randomInt) {
				return 1; //同じ
			} else if (num < randomInt) {
				return 2; //大きい
			} else {
				return 3; //小さい
			}
		} catch (Exception e) {
			return -1; //エラー
		}
	}

	/**11月05日
	 * 出力内容を表示する文字列を取得
	 * @param numPattern 入力された数字の判定結果
	 * @return 出力内容を表示する文字列
	 */
	public static String resultShow(int numPattern, int inputNum) {
		switch (numPattern) {
		case 1:
			return inputNum + "は正解";
		case 2:
			return inputNum + "より大きい";
		case 3:
			return inputNum + "より小さい";
		default:
			return "エラー";
		}
	}

}
