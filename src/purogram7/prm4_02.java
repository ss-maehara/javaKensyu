package purogram7;

public class prm4_02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program4_02();
	}

	public static void program4_02() {
		int num = 1;
		double doubNum = 0.1;
		String Str = "A";

		output(num);
		output(doubNum);
		output(Str);
	}

	//オーバーロード
	//11同じ名前だけどひきすうがちがうから行ける
	public static void output(int Val) {
		System.out.println(Val);
	}

	public static void output(double Val) {
		System.out.println(Val);
	}

	public static void output(String Val) {
		System.out.println(Val);
	}
}
