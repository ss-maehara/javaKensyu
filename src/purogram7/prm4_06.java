package purogram7;

public class prm4_06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		purogram4_06();
	}

	public static void purogram4_06() {
		String animalName = "きつね";
		// 文字列を1文字ずつ取り出し()を付ける
		output(animalName);
	}

	/**11月06日
	 * 文字列を1文字ずつ取り出し()を付ける
	 * @param fox
	 */
	public static void output(String fox) {
		for (int i = 0; i < fox.length(); i++) {
			System.out.print("(" + fox.charAt(i) + ")");
		}
	}
}
