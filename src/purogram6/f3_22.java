/*
package purogram6;

import java.util.Random;
import java.util.Scanner;

public class f3_22 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public static void program3_22() {

		//サイコロを振る回数を入力する。
		int inputNum = inputUser();

		//プレイヤーの出た目
		int[] rollsPlayersA = new int[inputNum];
		int[] rollsPlayersB = new int[inputNum];
		int[] rollsPlayersC = new int[inputNum];

		//サイコロ出る目を決める
		int dice = diceRoll();
		//サイコロの出目の判定
		int firstJudgment = dialResultJudgment(dice);
		//サイコロの出目と、位置を保存
		rollSave();
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

	public static void daice(int inputNum, int[] playerDaiceA, int[] playerDaiceB, int[] playerDaiceC) {
		Random random = new Random();
		for (int i = 0; i < inputNum; i++) {
			playerDaiceA[i] = random.nextInt(6) + 1;
			playerDaiceB[i] = random.nextInt(6) + 1;
			playerDaiceC[i] = random.nextInt(6) + 1;
		}

	}

	public static int diceRoll() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	//際ロコの目が6の倍数か、奇数か、偶数か判定をする。
	public static int dialResultJudgment(int dice) {

		int roll = 0;
		if (dice % 6 == 0) {
			return roll;
		} else if (dice % 2 == 0) {
			roll = dice - 1;
			//return roll;
		} else if (dice % 2 == 1) {
			roll = dice + 1;
			//return roll;
		} else {
			return dice;
		}
		int judgmentSecond = secondJudgment(roll);

		return judgmentSecond;
	}

	//↑サイコロで奇数か偶数で+-1した後6の倍数になっていないか判定
	public static int secondJudgment(int roll) {

		int multipleResult = 0;
		if (roll % 6 == 0) {
			multipleResult = 0;
		} else {
			multipleResult = roll;
		}
		return multipleResult;

	}

	//int inputNum, int dice
	public static void rollSave(int inputNum, int dice) {
		//サイコロを振る回数を入力する。
		int[] Savadice = new int[inputNum];
		int[] rollsPlayersA = new int[inputNum];
		int position = 0;

		for (int i = 0; i < rollsPlayersA.length; i++) {
			//サイコロ出る目を決める
			rollsPlayersA[i] = dice;

		}

	}

	public static int playerPosition(int dice) {
		int position = 0;
		int firstJudgment = dialResultJudgment(dice);
		position += firstJudgment;
		return position;

	}

}
*/
