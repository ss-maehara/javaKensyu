package purogram6;

import java.util.Scanner;

public class prm3_8 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_8();
	}

	public static void program3_8() {
		Scanner scanner = new Scanner(System.in);
		int inputNum1 = scanner.nextInt();
		int inputNum2 = scanner.nextInt();
		int inputNum3 = scanner.nextInt();

		int sumInput = inputSum(inputNum1, inputNum2, inputNum3);
		double sumAvg = inputAverage(sumInput);

		System.out.println("平均:" + sumAvg);
		System.out.println("合計:" + sumInput);

		String s = inputSumAverage(inputNum1, inputNum2, inputNum3);
	}

	public static int inputSum(int inpNum1, int inpNum2, int inpNum3) {
		int sum = inpNum1 + inpNum2 + inpNum3;
		return sum;

	}

	public static double inputAverage(int sumAve) {
		double average = sumAve / 3.0;
		return average;
	}

	public static String inputSumAverage(int inpNum1, int inpNum2, int inpNum3) {
		int sum = inpNum1 + inpNum2 + inpNum3;
		double average = sum / 3.0;
		return "平均:" + sum + "\n" + "合計:" + average;

	}
}
