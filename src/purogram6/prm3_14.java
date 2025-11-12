package purogram6;

import java.util.Scanner;

public class prm3_14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_15();
	}

	public static void program3_15() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		countNum(inputNum);
		forCountNum(inputNum);
	}

	public static void countNum(int inputCountNum) {
		int i = 1;
		int j = 1;
		while (i <= inputCountNum) {
			j = 0;
			while (j < i) {
				System.out.print(i);
				j++;
			}
			System.out.println();
			i++;
		}

	}

	public static void forCountNum(int inputCountNum) {
		for (int i = 1; i <= inputCountNum; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
