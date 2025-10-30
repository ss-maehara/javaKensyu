package purogram6;

import java.util.Scanner;

public class prm3_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_15();
	}

	public static void program3_15() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		outputCharacter(inputNum);
		forOutputCharacter(inputNum);
	}

	public static void outputCharacter(int inputNum) {
		int i = inputNum;
		while (i >= 1) {
			int j = 1;
			while (j <= i) {
				System.out.print("*");
				j++;
			}
			i--;
			System.out.println();
		}
	}

	public static void forOutputCharacter(int inputNum) {
		for (int i = inputNum; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}
