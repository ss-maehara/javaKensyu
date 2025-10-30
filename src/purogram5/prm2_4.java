package purogram5;
import java.util.Scanner;

public class prm2_4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		prgram2_4();
	}
	public static void prgram2_4() {
		Scanner scanner = new Scanner(System.in);
		String inputAnimalName = scanner.next();
		
		if(inputAnimalName.equals("たぬき") || inputAnimalName.equals("きつね")) {
			System.out.println("NG");
		}
	}
}
