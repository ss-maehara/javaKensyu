package purogram6;

import java.util.Random;
import java.util.Scanner;

public class prm3_22_e {

	public static void main(String[] args) {
		program3_22();

	}

	public static void program3_22() {
		String nameA = "A", nameB = "B", nameC = "C";
		//サイコロを振る回数を入力する。
		int inputNum = inputUser();

		//プレイヤーの出た目
		//配列の方がいい
		int[] rollsPlayersA = new int[inputNum];
		int diceA = 0;
		int firstJudgmentA = 0;
		int positionA = 0;
		int resultA = 0;

		int[] rollsPlayersB = new int[inputNum];
		int diceB = 0;
		int firstJudgmentB = 0;
		int positionB = 0;
		int resultB = 0;

		int[] rollsPlayersC = new int[inputNum];
		int diceC = 0;
		int firstJudgmentC = 0;
		int positionC = 0;
		int resultC = 0;

		for (int i = 0; i < inputNum; i++) {
			//サイコロ出る目を決める
			diceA = diceRoll();
			rollsPlayersA[i] = diceA;
			//サイコロの出目の判定結果を格納
			firstJudgmentA = dialResultJudgment(diceA);
			//サイコロの出目を追加
			positionA += firstJudgmentA;
			//6の倍数だったら場所を0にする。
			resultA = positionReset(firstJudgmentA, positionA);
			positionA = resultA;

			//サイコロ出る目を決める
			diceB = diceRoll();
			rollsPlayersB[i] = diceB;
			//サイコロの出目の判定
			firstJudgmentB = dialResultJudgment(diceB);
			//サイコロの出目を追加
			positionB += firstJudgmentB;
			//6の倍数だったら場所を0にする。
			resultB = positionReset(firstJudgmentB, positionB);
			positionB = resultB;

			//サイコロ出る目を決める
			diceC = diceRoll();
			rollsPlayersC[i] = diceC;
			//サイコロの出目の判定
			firstJudgmentC = dialResultJudgment(diceC);
			//サイコロの出目を追加
			positionC += firstJudgmentC;
			//6の倍数だったら場所を0にする。
			resultC = positionReset(firstJudgmentC, positionC);
			positionC = resultC;
		}
		output(rollsPlayersA, resultA, nameA);
		output(rollsPlayersB, resultB, nameB);
		output(rollsPlayersC, resultC, nameC);
	}

	//入力された値が数字であるか判定。
	//数字ではない場合再入力させる。
	public static int inputUser() {
		String inputStr = "";
		boolean isInputCorrect = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("何回サイコロを振りますか?");
		//System.out.print("入力:");
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

	//ランダム関数でサイコロの出目を決める
	public static int diceRoll() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	//サイロコの目が6の倍数か、奇数か、偶数か判定をする。
	//到着マスが奇数か偶数か6の倍数か判定
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
			return multipleResult;
		} else {
			multipleResult = roll;
		}
		return multipleResult;

	}

	//出目が6で0が合えされた時だった場合、位置を0にする
	public static int positionReset(int firstJudgment, int position) {
		if (firstJudgment == 0) {
			position = 0;
			return position;
		} else {
			return position;
		}
	}

	/*
	//int inputNum, int dice
	public static int[] rollSave(int inputNum, int dice, int[] rollsPlayers) {
	
		for (int i = 0; i < rollsPlayers.length; i++) {
			//サイコロ出る目を決める
			rollsPlayers[i] = dice;
		}
		return rollsPlayers;
	
	}
	*/
	/*
	public static int playerPosition(int dice) {
		int position = 0;
		int firstJudgment = dialResultJudgment(dice);
		position += firstJudgment;
		return position;
	
	}
	*/
	//出力
	public static void output(int[] playerDaice, int result, String name) {
		System.out.print("プレイヤー" + name + "：到達マス " + result + "　サイコロ：");

		for (int i = 0; i < playerDaice.length; i++) {
			System.out.print(playerDaice[i]);
			if (i < playerDaice.length - 1) {
				System.out.print("、");
			}
		}
		System.out.println();
	}
}
