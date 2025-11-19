package purogram7;

import java.util.Scanner;

public class prm4_04 {

	public static void main(String[] args) {

		program4_04();
	}

	public static void program4_04() {
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		checkDivisible(inputNum);
	}

	public static void checkDivisible(int num) {
		if (num % 5 == 0) {
			System.out.println("5で割り切れる");
		} else {
			System.out.println("5で割り切れない");
		}
	}
}
