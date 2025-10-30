package purogram5;

public class prm2_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		prgram2_5();
	}

	public static void prgram2_5() {
		String inputAnimalName = "きつね";//animalName
		String inputAnimalName2 = "たぬき"; //animalName2

		if (inputAnimalName.equals("ねこ") && inputAnimalName2.equals("いぬ")
				|| inputAnimalName.equals("いぬ") && inputAnimalName2.equals("ねこ")) {

			System.out.println("OK");
		}
		if (inputAnimalName.equals("きつね") && inputAnimalName2.equals("たぬき")
				|| inputAnimalName.equals("たぬき") && inputAnimalName2.equals("きつね")) {
			System.out.println("NG");
		}
	}
}
