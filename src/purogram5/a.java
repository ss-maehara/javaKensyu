package purogram5;

public class a {

	public static void main(String[] args) {
		// AチームとBチームのメンバー名
		String[] teamA = { "memberA", "memberB", "memberC" };
		String[] teamB = { "memberD", "memberE", "memberF" };

		// AチームとBチームの戦闘力
		double[] powerA = { 2500.0, 2777.2, 2200.0 };
		double[] powerB = { 2600.0, 2777.7, 2200.0 };

		// 各ペア（index 0〜2）を順番に対戦させる
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				showBattleResult(teamA[i], powerA[i], teamB[i], powerB[i]);
				break;
			case 1:
				showBattleResult(teamA[i], powerA[i], teamB[i], powerB[i]);
				break;
			case 2:
				showBattleResult(teamA[i], powerA[i], teamB[i], powerB[i]);
				break;
			default:
				System.out.println("該当する対戦はありません");
			}
		}
	}

	// 対戦結果を判定・表示するメソッド
	public static void showBattleResult(String aName, double aPower, String bName, double bPower) {
		if (aPower > bPower) {
			System.out.println(aName + " vs " + bName + "   Win:" + aName + "  Loss:" + bName);
		} else if (aPower < bPower) {
			System.out.println(aName + " vs " + bName + "   Win:" + bName + "  Loss:" + aName);
		} else {
			System.out.println(aName + " vs " + bName + "   Draw:" + aName + "," + bName);
		}
	}
}