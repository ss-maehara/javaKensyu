package purogram6;

import java.util.Random;
import java.util.Scanner;

public class prm3_22_e {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void program3_22() {
		//サイコロを振る回数を入力する。
		int inputNum = inputUser();
		//サイコロ出る目を決める
		int dice = diceRoll();
	}

	public static int inputUser() {
		String inputStr = "";
		boolean isInputCorrect = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("何回サイコロを振りますか?");
		System.out.print("入力:");
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

	public static boolean isNumericalJudgment(String str) {

		if (str == null || str.isEmpty()) {
			return false; // nullや空文字は数字ではない
		}

		int start = 0;
		if (str.charAt(0) == '-') { // マイナスの可能性
			if (str.length() == 1) {
				return false; // "-" だけは数字ではない
			}
			start = 1;
		}
		return true;
	}

	public static int diceRoll() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	public static int dialResultJudgment(int dice) {

		int roll = 0;
		if (dice / 6 == 0) {
			return roll;
		} else if (dice / 2 == 0) {
			roll = dice - 1;
			return roll;
		} else if (dice / 2 == 1) {
			roll = dice + 1;
			return roll;
		} else {
			return dice;
		}
	}
}
