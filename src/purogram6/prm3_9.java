package purogram6;

import java.util.Scanner;

public class prm3_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_9();
	}

	public static void program3_9() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1～10の数字を入力してください :");
		int inputNum = scanner.nextInt();

		int rangeNum = 1;
		if (inputNum <= 10) {
			rangeNum = inputNum;
		}

		numContinuous(rangeNum);
		System.out.println("\n");
		whileNumContinuous(rangeNum);
	}

	public static void numContinuous(int conNum) {
		for (int i = 1; i <= conNum; i++) {
			System.out.println(i);
		}

	}

	public static void whileNumContinuous(int conNum) {
		int i = 1;
		while (i <= conNum) {
			System.out.println(i);
			i++;
		}
	}
}
