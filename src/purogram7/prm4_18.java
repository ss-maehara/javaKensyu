package purogram7;

import java.util.Random;
import java.util.Scanner;

public class prm4_18 {

	public static void main(String[] args) {
		program4_18();

	}

	public static void program4_18() {
		//ランダムで1～3の数字を決める
		Random random = new Random();
		int cpuNum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("じゃんけんを何回行いますか?");
		int inputloopNum = scanner.nextInt();

		int inputHand = 0;
		int i = 1;

		int playerWin = 0;
		int playerLose = 0;

		String result = "";
		while (inputloopNum >= i) {
			System.out.println(i + "回戦じゃんけん！\n 1:グー　2:チョキ　3:パー");
			do {
				try {
					inputHand = scanner.nextInt();
					cpuNum = random.nextInt(3) + 1;

				} catch (Exception e) {
					System.out.println("入力された手が間違っています。");
					scanner.nextLine();
					continue;
				}
				if (inputHand < 1 || inputHand > 3) {
					System.out.println("入力された手が間違っています。");
					continue;
				}

				//プレイヤーハンド
				String playerHand = rockPaper(inputHand);
				//CPUハンド
				String cpuHand = rockPaper(cpuNum);
				//じゃんけんの結果
				result = WinOrLoseOrDraw(inputHand, cpuNum);

				//あいこの場合ぽん!がしょ!になる。
				if (result.equals("あいこで!")) {
					System.out.println("しょ!\nプレイヤー:" + playerHand + "　CPU" + cpuHand);
					continue;
				} else {
					System.out.println("ぽん!\nプレイヤー:" + playerHand + "　CPU" + cpuHand);
				}
				i++;
				System.out.println(result);
				//プレイヤーの勝ちならplayerWinに+1
				//プレイヤーの負けならplayerLoseに+1
				if (result.equals("プレイヤーの勝ち!")) {
					playerWin++;
				} else if (result.equals("プレイヤーの負け!")) {
					playerLose++;
				}

			} while (result.equals("あいこで!"));

		}
		System.out.println("戦績:" + playerWin + "勝" + playerLose + "負");
	}

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
}
