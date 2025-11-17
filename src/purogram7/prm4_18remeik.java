package purogram7;

import java.util.Random;
import java.util.Scanner;

public class prm4_18remeik {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_18();
	}

	public static void program4_18() {
		//ランダムで1～3の数字を決める
		Scanner scanner = new Scanner(System.in);
		System.out.print("じゃんけんを何回行いますか?:");
		int inputloopNum = scanner.nextInt();

		int i = 1;
		int playerWin = 0;
		int playerLose = 0;
		//userの入力
		//String userInputStrHand = userInput();
		// int に変換
		//int inputNum = Integer.parseInt(userInputStrHand);

		String result = "";
		while (inputloopNum >= i) {

			System.out.println(i + "回戦じゃんけん！\n 1:グー　2:チョキ　3:パー");
			Random random = new Random();
			int cpuNum = random.nextInt(3) + 1;
			//userの入力
			String userInputStrHand = userInput();
			// int に変換
			int inputNum = Integer.parseInt(userInputStrHand);
			//プレイヤーハンド
			String playerHand = rockPaper(inputNum);
			//CPUハンド
			String cpuHand = rockPaper(cpuNum);

			//じゃんけんの結果
			result = WinOrLoseOrDraw(inputNum, cpuNum);

			System.out.println("ぽん!\nプレイヤー:" + playerHand + "　CPU" + cpuHand);
			System.out.println(result);
			//あいこならもう一度入力
			if (result.equals("あいこで!")) {
				sameHands(random);
			}
			if (result.equals("プレイヤーの勝ち!")) {
				playerWin++;
			} else if (result.equals("プレイヤーの負け!")) {
				playerLose++;
			}
			i++;

		}
		System.out.println("戦績:" + playerWin + "勝" + playerLose + "負");
		winLossResults(playerWin, playerLose);
	}

	public static String userInput() {
		String inputStr = "";
		boolean isInputCorrect = false;
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				//System.out.print("入力:");
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

	//あいこだった場合
	public static void sameHands(Random random) {
		/*if (intputNum == cpuNum) {
			System.out.println("あいこで!");
			String userInputStrHand = userInput();
			System.out.println("しょ!\nプレイヤー:" +  userInputStrHand + "　CPU" + cpuNum);
		} else {
			System.out.println("ぽん!\nプレイヤー:" + intputNum + "　CPU" + cpuNum);
		}*/
		String userInputStrHand;
		int inputNum;
		int cpuNum;
		String playerHand;
		String cpuHand;
		do {
			userInputStrHand = userInput();
			inputNum = Integer.parseInt(userInputStrHand);
			cpuNum = random.nextInt(3) + 1;
			playerHand = rockPaper(inputNum);
			//CPUハンド
			cpuHand = rockPaper(cpuNum);
			System.out.println("しょ!\nプレイヤー:" + playerHand + "　CPU" + cpuHand);
		} while (playerHand == cpuHand);

	}

	/*	public static void countWinLose(int playerWin, int playerLose, String result) {
	
			if (result.equals("プレイヤーの勝ち!")) {
				playerWin++;
			} else if (result.equals("プレイヤーの負け!")) {
				playerLose++;
			}
		}
	*/
	/**11月13日
	 * プレイヤー、CPUのハンドを出す関数
	 * @param Hand 1,2,3
	 * @return 出す手
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
			return "あいこで!";
		} else if ((inputHand == 1 && cpuHand == 2) || (inputHand == 2 && cpuHand == 3)
				|| (inputHand == 3 && cpuHand == 1)) {
			return "プレイヤーの勝ち!";
		} else {
			return "プレイヤーの負け!";
		}
	}

	public static void winLossResults(int playerWin, int playerLose) {
		if (playerWin == playerLose) {
			System.out.println("じゃんけんゲームの勝者はプレイヤーとCPUです！");
		} else if (playerWin > playerLose) {
			System.out.println("じゃんけんゲームの勝者はプレイヤーです！");
		} else {
			System.out.println("じゃんけんゲームの勝者はCPUです！");
		}
	}
}
