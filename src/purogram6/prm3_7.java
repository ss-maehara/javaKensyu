package purogram6;

public class prm3_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_7();
	}

	public static void program3_7() {
		evenNumber();
		whileEvenNumber();
	}

	public static void evenNumber() {
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
		}
		System.out.println();
	}

	public static void whileEvenNumber() {
		int i = 1;
		while (i <= 20) {
			if (i % 2 == 0) {
				System.out.print(i);
			}
			i++;
		}
	}
}
