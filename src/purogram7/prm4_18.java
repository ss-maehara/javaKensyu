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
		int cpuNum = random.nextInt(3) + 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("じゃんけんを何回行いますか?");
		int inputloopNum = scanner.nextInt();

		int inputHand = 0;
		int i = 1;
		while (inputloopNum >= i) {
			try {
				System.out.println(i + "回戦じゃんけん！\n 1:グー　2:チョキ　3:パー");
				inputHand = scanner.nextInt();

			} catch (Exception e) {
				System.out.println("入力された手が間違っています。");
				scanner.nextLine();
				continue; // 戻る

			}
			if (inputHand < 1 || inputHand > 3) {
				System.out.println("入力された手が間違っています。");
				continue; // 戻る
			}
			String playerHand = rockPaper(inputHand);
			String cpu = rockPaper(cpuNum);

			i++;

		}
	}

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
}
