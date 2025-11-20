package purogram7;

import java.util.Random;
import java.util.Scanner;

public class prm4_18remeik {

	//部長に役割を与える社長関数
	public static void main(String[] args) {
		//program4_18();
		program4_18_2();
	}

	public static void program4_18_2() {
		/*
		 * 
		 * じゃんけんをおこなう回数を取得するためにリーダーに入力を促す。①
		 * 出す手を入力するためにリーダーに入力を促す。②
		 * →じゃんけん！orあいこで!表示する
		 * CPUが出す数字を取得するようにリーダに指示する。③
		 * 勝敗の判定を取得するためにリーダーに指示をする。④
		 * →仮に引き分けだった場合、勝敗が付くまで繰り返す。
		 * →ぽん!orしょ!を表示する。
		 *プレイヤーとCPUの手を表示するようにリーダーに指示する。⑤
		 * 勝敗を表示するようにリーダーに指示する⑥
		 * じゃんけんが終わったら戦績を表示するように指示する⑦
		 */

		//7つの関数しか使わない//

		//①じゃんけんをおこなう回数を取得するためにリーダーに入力を促す
		//じゃんけんを行う回数を取得する
		int playerWin = 0;
		int playerLose = 0;
		int inputLoopNum = userLoopInput();
		for (int i = 1; i <= inputLoopNum; i++) {
			System.out.println(i + "回戦、じゃんけん！\n 1:グー　2:チョキ　3:パー");
			//②出す手を入力するためにリーダーに入力を促す。
			int inputHandNum = userInput();

			//③CPUが出す数字を取得するようにリーダに指示する。
			int cpuNum = cpuRandomHand();

			//⑤プレイヤーとCPUの手を表示するようにリーダーに指示する。
			//プレイヤーハンド
			String playerHand = rockPaper(inputHandNum);
			//CPUハンド
			String cpuHand = rockPaper(cpuNum);
			System.out.println("プレイヤー:" + playerHand + "　CPU:" + cpuHand);
			//④勝敗の判定を取得するためにリーダーに指示をする。
			String outputwinLossResults = WinOrLoseOrDraw(inputHandNum, cpuNum);
			sameHands(outputwinLossResults);
			playerWin = updateWin(playerWin, outputwinLossResults);
			playerLose = updateLose(playerLose, outputwinLossResults);
		}
		//⑦じゃんけんが終わったら戦績を表示するように指示する
		System.out.println("戦績:" + playerWin + "勝" + playerLose + "敗");
		winLossResults(playerWin, playerLose);
	}

	//リーダーに役割を与える部長関数

	//①
	public static int userLoopInput() {
		String inputStr = "";
		boolean isInputCorrect = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("じゃんけんを何回行いますか?");
		do {
			try {
				//入力
				System.out.print("入力:");
				inputStr = scanner.next();

				//入力された値が数字かどうか
				isInputCorrect = isNumericalJudgment(inputStr);
				if (isInputCorrect == false) {
					continue;
				}

			} catch (Exception e) {
				System.out.println("入力された手が間違っています。");
			}
		} while (isInputCorrect == false);

		return Integer.parseInt(inputStr);
	}

	//②
	//部下に役割を与えるリーダー関数
	public static int userInput() {
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

		return Integer.parseInt(inputStr);
	}

	//結果をリーダーに返す部下関数
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

	//結果をリーダーに返す部下関数
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

	//③
	public static int cpuRandomHand() {
		Random random = new Random();
		return random.nextInt(3) + 1;
	}

	//あいこだった場合
	public static void sameHands(String resultHand) {
		Random random = new Random();
		int inputNum;
		int cpuNum;
		String playerHand;
		String cpuHand;
		if (resultHand.equals("あいこで!")) {
			do {
				System.out.println("あいこで!");
				System.out.println("1:グー　2:チョキ　3:パー");
				inputNum = userInput();
				cpuNum = random.nextInt(3) + 1;
				playerHand = rockPaper(inputNum);

				//CPUハンド
				cpuHand = rockPaper(cpuNum);
				System.out.println("しょ!\nプレイヤー:" + playerHand + "　CPU" + cpuHand);
				String winLossResults = WinOrLoseOrDraw(inputNum, cpuNum);
			} while (playerHand == cpuHand);
		}

	}

	///結果をリーダーに返す部下関数
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

	//⑤
	//結果をリーダーに返す部下関数
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

			System.out.println("プレイヤーの勝ち!");
			return "プレイヤーの勝ち!";
		} else {
			System.out.println("プレイヤーの負け!");
			return "プレイヤーの負け!";
		}
	}

	//⑥
	//リーダーの指示で部下が自主的に結果を出す。
	public static void winLossResults(int playerWin, int playerLose) {

		if (playerWin == playerLose) {
			System.out.println("じゃんけんゲームの勝者はプレイヤーとCPUです！");
		} else if (playerWin > playerLose) {
			System.out.println("じゃんけんゲームの勝者はプレイヤーです！");
		} else {
			System.out.println("じゃんけんゲームの勝者はCPUです！");
		}
	}

	public static int updateWin(int playerWin, String result) {
		if (result.equals("プレイヤーの勝ち!")) {
			return playerWin + 1;
		}
		return playerWin;
	}

	// 負け数を更新して返す
	public static int updateLose(int playerLose, String result) {
		if (result.equals("プレイヤーの負け!")) {
			return playerLose + 1;
		}
		return playerLose;
	}

}
