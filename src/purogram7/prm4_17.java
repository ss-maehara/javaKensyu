package purogram7;

import java.util.Random;
import java.util.Scanner;

public class prm4_17 {

	public static void main(String[] args) {
		program4_17();

	}

	public static void program4_17() {
		//ランダムで1～3の数字を決める
		Random random = new Random();
		int cpuHand = random.nextInt(3) + 1;

		int inputHand = 0;
		while (true) {
			try {
				System.out.println("じゃんけんを行います。");
				System.out.println("じゃんけん！\n 1:グー　2:チョキ　3:パー");

				Scanner scanner = new Scanner(System.in);
				inputHand = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("入力された手が間違っています。");
				continue; // 戻る
			}
			//入力された値が1～3を入力するまで繰り返す処理
			if (inputHand < 1 || inputHand > 3) {
				System.out.println("入力された手が間違っています。");
				continue; // 戻る
			}
			break;

		}
		//プレイヤー側のハンド
		String playerrockPaperHend = rockPaper(inputHand);
		//CPUのハンド
		String cpurockPaperHend = rockPaper(cpuHand);

		System.out.println("ぽん!\nプレイヤー:" + playerrockPaperHend + "CPU" + cpurockPaperHend);
		//じゃんけんの結果
		String result = WinOrLoseOrDraw(inputHand, cpuHand);
		System.out.println(result);

	}

	/**11月12日
	 * プレイヤー側のハンド
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
