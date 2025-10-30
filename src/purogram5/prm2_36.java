package purogram5;

public class prm2_36 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program2_36();
	}

	public static void program2_36() {
		// A・Bのチームの戦闘力
		String member = "memberA";
		double[] powerTeamA = { 2500.0, 2777.2, 2200.0 };
		double[] powerTeamB = { 2600.0, 2777.7, 2200.0 };

		// A・Bチームメンバー
		String[] teamNameA = { "memberA", "memberB", "memberC" };
		String[] teamNameB = { "memberD", "memberE", "memberF" };

		//memberA対memberB
		int resultAvsD = (powerTeamA[0] > powerTeamB[0]) ? 1 : (powerTeamA[0] < powerTeamB[0]) ? 2 : 3;
		switch (resultAvsD) {
		case 1:
			System.out
					.println(teamNameA[0] + " vs " + teamNameB[0] + "  Win:" + teamNameA[0] + "  Loss:" + teamNameB[0]);
			break;
		case 2:
			System.out
					.println(teamNameA[0] + " vs " + teamNameB[0] + "  Win:" + teamNameB[0] + "  Loss:" + teamNameA[0]);
			break;
		case 3:
			System.out.println(teamNameA[0] + " vs " + teamNameB[0] + "  Draw:" + teamNameA[0] + "," + teamNameB[0]);
			break;
		}

		//memberBvsmeberE
		int resultBvsE = (powerTeamA[1] > powerTeamB[1]) ? 1 : (powerTeamA[1] < powerTeamB[1]) ? 2 : 3;
		switch (resultBvsE) {
		case 1:
			System.out
					.println(teamNameA[1] + " vs " + teamNameB[1] + "  Win:" + teamNameA[1] + "  Loss:" + teamNameB[1]);
			break;
		case 2:
			System.out
					.println(teamNameA[1] + " vs " + teamNameB[1] + "  Win:" + teamNameB[1] + "  Loss:" + teamNameA[1]);
			break;
		case 3:
			System.out.println(teamNameA[1] + " vs " + teamNameB[1] + "  Draw:" + teamNameA[1] + "," + teamNameB[1]);
			break;
		}

		//meberCvsmemberF
		int resultCvsF = (powerTeamA[2] > powerTeamB[2]) ? 1 : (powerTeamA[2] < powerTeamB[2]) ? 2 : 3;
		switch (resultCvsF) {
		case 1:
			System.out
					.println(teamNameA[2] + " vs " + teamNameB[2] + "  Win:" + teamNameA[2] + "  Loss:" + teamNameB[2]);
			break;
		case 2:
			System.out
					.println(teamNameA[2] + " vs " + teamNameB[2] + "  Win:" + teamNameB[2] + "  Loss:" + teamNameA[2]);
			break;
		case 3:
			System.out.println(teamNameA[2] + " vs " + teamNameB[2] + "  Draw:" + teamNameA[2] + "," + teamNameB[2]);
			break;
		}

	}
}
