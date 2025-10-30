package purogram5;

import java.util.Scanner;

public class prm2_9 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_9();
	}

	public static void program2_9() {
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.next();
		String inputanimalVoice = scanner.next();

		if (inputName.equals("ねこ") && inputanimalVoice.equals("にゃー")
				|| inputName.equals("にゃー") && inputanimalVoice.equals("ねこ")) {
			System.out.println("正しいです。");
		}
	}
}
