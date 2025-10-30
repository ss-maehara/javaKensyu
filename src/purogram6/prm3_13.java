package purogram6;

import java.util.Scanner;

public class prm3_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_13();
	}

	public static void program3_13() {
		Scanner scanner = new Scanner(System.in);
		String inputAnimalName = scanner.next();

		String judgCat = "";
		String judgDog = "";

		switch (inputAnimalName) {
		case "ねこ":
			judgCat = "ねこちゃん";
			animalCatCount(judgCat);
			//whileAnimalCatCount(judgCat);
			break;
		case "わん":
			judgDog = "わんちゃん";
			animalDogCount(judgDog);
			//whileAnimalDogCount(judgDog);
			break;
		default:
			System.out.println(inputAnimalName);
			break;

		}

	}

	public static void animalCatCount(String judgCat) {

		for (int i = 0; i <= 22; i++) {
			System.out.println(judgCat);
		}
	}

	public static void animalDogCount(String judgDog) {
		for (int i = 0; i <= 11; i++) {
			System.out.println(judgDog);
		}
	}

	public static void whileAnimalCatCount(String judgCat) {
		int i = 0;
		while (i <= 22) {
			System.out.println(judgCat);
			i++;
		}
	}

	public static void whileAnimalDogCount(String judgDog) {
		int i = 0;
		while (i <= 11) {
			System.out.println(judgDog);
			i++;
		}
	}
}
