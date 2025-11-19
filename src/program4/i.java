package program4;

import java.util.Random;

public class i {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		popopo();
	}

	public static void popopo() {
		Random random = new Random();
		//1～100までの数字をランダムで決める
		int randomInt = random.nextInt(47) + 1;
		System.out.println(randomInt);
	}
}
