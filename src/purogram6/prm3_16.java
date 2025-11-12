package purogram6;

import java.util.Scanner;

public class prm3_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_16();
	}

	public static void program3_16() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		//入力された数字文だけ入力できるようにし、入力された値の合計
		int totalNum = inputNumSun(inputNum, scanner);
		System.out.println("合計:" + totalNum);

		//入力された数字文だけ入力できるようにし、入力された値の合計
		//whileバージョン
		int whiletotalNum = whileInputNumSun(inputNum, scanner);
		System.out.println("合計:" + whiletotalNum);
	}

	/**
	 * 入力された数字文だけ入力できるようにし、入力された値の合計
	 * @param numSum 最初に入力された数字
	 * @param scanner 入力された数字を読み取る
	 * @return
	 */
	public static int inputNumSun(int numSum, Scanner scanner) {
		int total = 0;

		for (int i = 0; i < numSum; i++) {
			int sum = scanner.nextInt();
			total += sum;
		}

		return total;

	}

	public static int whileInputNumSun(int numSum, Scanner scanner) {

		int count = 0;
		int total = 0;
		while (count < numSum) {
			int sum = scanner.nextInt();
			total += sum;
			count++;
		}
		return total;
	}
}
