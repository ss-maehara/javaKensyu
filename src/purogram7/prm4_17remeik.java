package purogram7;

import java.util.Random;
import java.util.Scanner;

public class prm4_17remeik {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_17();
	}

	public static void program4_17() {
		//ランダムで1～3の数字を決める
		Random random = new Random();
		int cpuHand = random.nextInt(3) + 1;

		System.out.println("じゃんけんを行います。");
		System.out.println("じゃんけん！\n 1:グー　2:チョキ　3:パー");

		//userの入力
		String userInputStrHand = userInput();

		// int に変換
		int inputHand = Integer.parseInt(userInputStrHand);

		//プレイヤー側のハンド
		String playerrockPaperHend = rockPaper(inputHand);
		//CPUのハンド
		String cpurockPaperHend = rockPaper(cpuHand);

		System.out.println("ぽん!\nプレイヤー:" + playerrockPaperHend + "CPU" + cpurockPaperHend);
		//じゃんけんの結果
		String result = WinOrLoseOrDraw(inputHand, cpuHand);
		System.out.println(result);

	}

	public static String userInput() {
		String inputStr = "";
		boolean isInputCorrect = false;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.print("入力:");
				//入力
				inputStr = scanner.next();

				//入力された値が数字かどうか
				isInputCorrect = isNumericalJudgment(inputStr);
				if (isInputCorrect == false) {
					continue;
				}
				//1以上3以下
				isInputCorrect = isRangeSpecification(inputStr);
				if (isInputCorrect == false) {
					continue;
				}

			} catch (Exception e) {
				System.out.println("入力された手が間違っています。");
			}
		} while (isInputCorrect == false);

		return inputStr;
	}

	//if文追記
	// 入力された値が数字かどうか判定
	public static boolean isNumericalJudgment(String inputStr) {
		try {
			Integer.parseInt(inputStr);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("入力された手が間違っています。");
			return false;
		}
	}

	// 入力された値が 1〜3 の範囲かどうか判定
	public static boolean isRangeSpecification(String inputStr) {
		int num = Integer.parseInt(inputStr);

		if (num >= 1 && num <= 3) {
			return true;
		} else {
			System.out.println("入力された手が間違っています。");
			return false;
		}
	}

	/**11月12日
	 * ハンド
	 * @param Hand プレイヤー、CPUのハンド
	 * @return 出した手
	 */
	public static String rockPaper(int Hand) {
		switch (Hand) {
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

	/**11月12日
	 * じゃんけんの結果
	 * @param inputHand プレイヤーのハンド
	 * @param cpuHand CPUのハンド
	 * @return じゃんけんの結果
	 */
	public static String WinOrLoseOrDraw(int inputHand, int cpuHand) {
		if (inputHand == cpuHand) {
			return "引き分け!";
		} else if ((inputHand == 1 && cpuHand == 2) || (inputHand == 2 && cpuHand == 3)
				|| (inputHand == 3 && cpuHand == 1)) {
			return "プレイヤーの勝ち!";
		} else {
			return "プレイヤーの負け!";
		}
	}
}
