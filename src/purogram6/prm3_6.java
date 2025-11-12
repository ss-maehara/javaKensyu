package purogram6;

public class prm3_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program3_6();
		multiplication();
	}

	public static void program3_6() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		System.out.println("\n");
	}

	//whileでおこなう掛け算
	public static void multiplication() {
		int i = 1;
		int j = 1;
		while (i <= 9) {
			j = 1;
			while (j <= 9) {
				System.out.print(i * j + "\t");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
