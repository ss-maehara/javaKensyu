package purogram5;

import java.util.Scanner;

public class prm2_12 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_12();
	}

	public static void program2_12() {
		Scanner scanner = new Scanner(System.in);
		String inputAnimalName = scanner.next();
		if (inputAnimalName.equals("ねこ") || inputAnimalName.equals("わん")) {
			System.out.println(inputAnimalName + "ちゃん");
		} else if (inputAnimalName.equals("きつね")) {
			System.out.println(inputAnimalName + "うどん");
		} else {
			System.out.println(inputAnimalName);
		}
	}
}
