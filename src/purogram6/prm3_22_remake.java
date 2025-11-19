package purogram6;

import java.util.Random;
import java.util.Scanner;

public class prm3_22_remake {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_22();
	}

	public static void program3_22() {
		String[] players = { "プレイヤーA", "プレイヤーB", "プレイヤーC" };
		//位置
		int[] positions = { 0, 0, 0 };

		Scanner scanner = new Scanner(System.in);
		System.out.print("サイコロを回す回数を指定してください:");
		int inputNum = scanner.nextInt();

		//int randomInt = random.nextInt(6) + 1;
		//プレイヤーの出た目
		int[] rollsPlayersA = new int[inputNum];
		int[] rollsPlayersB = new int[inputNum];
		int[] rollsPlayersC = new int[inputNum];
		//サイコロを振る
		daice(inputNum, rollsPlayersA, rollsPlayersB, rollsPlayersC);
		//出目が奇数なら+1、偶数なら-1、6の倍数なら0にする
		evenOddMultiple(positions, rollsPlayersA);
		evenOddMultiple(positions, rollsPlayersB);
		evenOddMultiple(positions, rollsPlayersC);
		//出た目の数positionsの配列に入れる
		//updetePositions(positions, inputNum, rollsPlayersA, rollsPlayersB, rollsPlayersC);
		//合計の到着マスが奇数があれば+1、偶数なら-1、6の倍数なら0にする
		//int[] arrivalResult = evenOddMultiple(positions);
		//出力
		outputResult(players, positions, rollsPlayersA, rollsPlayersB, rollsPlayersC);
	}

	/**11月5日
	 * 入力した回数サイコロを順番に振り、配列に格納する。
	 * @param times
	 * @param playerDaiceA プレイヤーAの出目
	 * @param playerDaiceB プレイヤーBの出目
	 * @param playerDaiceC プレイヤーCの出目
	 */
	public static void daice(int inputNum, int[] playerDaiceA, int[] playerDaiceB, int[] playerDaiceC) {
		Random random = new Random();
		for (int i = 0; i < inputNum; i++) {
			playerDaiceA[i] = random.nextInt(6) + 1;
			playerDaiceB[i] = random.nextInt(6) + 1;
			playerDaiceC[i] = random.nextInt(6) + 1;
		}

	}

	/**11月5日
	 * 出た目の数合計をpositionsに入れる
	 * @param positions 位置
	 * @param inputNum　サイコロを振る回数
	 * @param rollsPlayersA プレイヤーAの出た目の合計
	 * @param rollsPlayersB プレイヤーAの出た目の合計
	 * @param rollsPlayersC プレイヤーAの出た目の合計
	 */
	/*public static void updetePositions(int[] positions, int inputNum, int[] rollsPlayersA, int[] rollsPlayersB,
			int[] rollsPlayersC) {
		for (int i = 0; i < inputNum; i++) {
			positions[0] += rollsPlayersA[i];
			positions[1] += rollsPlayersB[i];
			positions[2] += rollsPlayersC[i];
		}
	}*/

	/**
	 * 出目が奇数なら+1、偶数なら-1、6の倍数なら0にする
	 * @param evenOddMultiple
	 * @return positionsの中身の数字
	 */

	public static void evenOddMultiple(int[] positions, int[] rollsPlayers) {

		/*
		for (int i = 0; i < rollsPlayers.length; i++) {
			if (rollsPlayers[i] % 6 == 0) {
				positions *= 0;
			} else if (rollsPlayers[i] % 2 == 0) {
				positions = rollsPlayers[i] -= 1;
			} else {
				rollsPlayers[i] += 1;
				if (rollsPlayers[i] % 6 == 0) {
					positions *= 0;
				}
				positions += rollsPlayers[i];
		
			}
		}
		return positions;
		*/

		for (int j = 0; j < positions.length; j++) {
			for (int i = 0; i < rollsPlayers.length; i++) {
				/*if (rollsPlayers[i] % 6 == 0) {
					positions[j] = 0;
				} else if (rollsPlayers[i] % 2 == 0) {
					positions[j] = rollsPlayers[i] - 1;
				} else {
					rollsPlayers[i] += 1;
					if (rollsPlayers[i] % 6 == 0) {
						positions[j] = 0;
					}
					positions[j] += rollsPlayers[i];
				
				}*/
				if (rollsPlayers[i] % 6 == 0) {
					positions[j] = 0;
				} else if (rollsPlayers[i] % 2 == 0) {
					positions[j] = rollsPlayers[i] - 1;
				} else if (rollsPlayers[i] % 6 == 0) {
					positions[j] = 0;
				} else {
					rollsPlayers[i] += 1;
				}
				positions[j] += rollsPlayers[i];
			}

		}
		//return positions;
	}

	/**
	 * 11月06日
	 * @param players プレイヤーA,プレイヤーB,プレイヤーC
	 * @param 振った目の合計位置
	 * @param playerDaiceA プレイヤーAの出した目
	 * @param playerDaiceB プレイヤーBの出した目
	 * @param playerDaiceC プレイヤーCの出した目
	 */
	public static void outputResult(String[] players, int[] positions, int[] playerDaiceA, int[] playerDaiceB,
			int[] playerDaiceC) {
		for (int i = 0; i < players.length; i++) {
			System.out.print(players[i] + "：到達マス" + positions[i] + "　サイコロ：");

			if (i == 0) {
				for (int j = 0; j < playerDaiceA.length; j++) {
					System.out.print(playerDaiceA[j]);
					if (j < playerDaiceA.length - 1) {
						System.out.print("、"); // 全角カンマ
					}
				}
			} else if (i == 1) {
				for (int j = 0; j < playerDaiceB.length; j++) {
					System.out.print(playerDaiceB[j]);
					if (j < playerDaiceB.length - 1) {
						System.out.print("、"); // 全角カンマ
					}
				}
			} else {
				for (int j = 0; j < playerDaiceC.length; j++) {
					System.out.print(playerDaiceC[j]);
					if (j < playerDaiceC.length - 1) {
						System.out.print("、"); // 全角カンマ
					}
				}

			}
			System.out.println();
		}

	}
}
