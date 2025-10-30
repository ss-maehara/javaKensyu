package program4;
import java.util.Scanner;

public class prm4_1_18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program1_18();
	}
	public static void program1_18() {
		int a = 50;
		int b = 20;
		int c = 40;
		int bread ;
		int fruit;
		int sweets;
		
		
		Scanner scanner = new Scanner(System.in); 
		
		while (true) {
			System.out.print(a+"円のパンをいくつ買いますか？：");
			if(scanner.hasNextInt()) {
				bread = scanner.nextInt();
				break;
			}else {
				System.out.println("個数を数字で入力してください。");
				scanner.nextLine();
			}
		}
		while(true) {
			System.out.print(b+"円のフルーツをいくつ買いますか？：");
			if(scanner.hasNextInt()) {
				fruit = scanner.nextInt();
				break;
			}else {
				System.out.println("個数を数字で入力してください。");
				scanner.nextLine();
			}
		}
		while(true) {
			System.out.print(c + "円のおかしをいくつ買いますか？：");
			if(scanner.hasNextInt()) {
				sweets = scanner.nextInt();
				break;
			}else {
				System.out.println("個数を数字で入力してください。");
				scanner.nextLine();
			}
		}
		int sum = bread * a + fruit * b + sweets * c;
		
		System.out.println("合計は" + sum + "です。");
		
		System.out.print("支払金額:");
		int pay = scanner.nextInt();
		 int otsuri= pay - sum;
		
		System.out.println("おつり" + otsuri);
		
	}
}
