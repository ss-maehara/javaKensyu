package purogram6;

import java.util.Scanner;

public class prm3_8Remeke {

	public static void main(String[] args) {
		program3_8();

	}

	public static void program3_8() {
		Scanner scanner = new Scanner(System.in);
		//int inputNum = scanner.nextInt();
		//3回入力させて配列に格納。
		int[] forSrryNum = forInputNum(scanner);
		int[] whileArryNum = whileInputNum(scanner);
		//配列に格納してある数値の合計
		int forSum = forInputSum(forSrryNum);
		int whleSum = whileInputSum(whileArryNum);
		double forAverage = inputNumAverage(forSum);
		double whileAverage = inputNumAverage(forSum);
		System.out.println("合計: " + forSum);
		System.out.println("平均: " + forAverage);
		System.out.println("合計: " + whleSum);
		System.out.println("平均: " + whileAverage);

	}

	/**
	 * 3回入力させて配列に格納。
	 * @param scanner 入力する
	 * @return 入力した値の合計
	 */
	public static int[] forInputNum(Scanner scanner) {
		int[] arryNum = new int[3];

		for (int i = 0; i < arryNum.length; i++) {
			arryNum[i] = scanner.nextInt();
		}

		return arryNum;

	}

	//whileVer
	public static int[] whileInputNum(Scanner scanner) {
		int[] arryNum = new int[3];
		int i = 0;
		while (i < arryNum.length) {
			arryNum[i] = scanner.nextInt();
			i++;
		}
		return arryNum;

	}

	/**
	 * 配列に格納してある数値の合計
	 * @param arryNum
	 * @return
	 */
	public static int forInputSum(int[] arryNum) {
		int sum = 0;
		for (int num : arryNum) {
			sum += num;
		}

		return sum;

	}

	//whileVer
	public static int whileInputSum(int[] arryNum) {
		int sum = 0;
		int i = 0;
		while (i < arryNum.length) {
			sum += arryNum[i];
			i++;
		}
		return sum;

	}

	/**
	 * 平均を出す
	 * @param sum
	 * @return
	 */
	public static double inputNumAverage(int sum) {

		return sum / 3;

	}
}
