package program4;
import java.util.Scanner;

public class prm4_1_17 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program1_17();
	}
	public static void program1_17() {
		String name;
		String food;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("あなたの名前:");
			if(scanner.hasNextInt()) {
				System.out.println("文字を入力してください。");
				scanner.nextLine(); // 入力を消す
			}else {
				name = scanner.nextLine();
				break;
			}
		}
		
		while(true) {
			System.out.print("あなたの好きな食べ物:");
			if(scanner.hasNextInt()) {
				System.out.print("文字を入力してください");
				scanner.nextLine(); // 入力を消す
			}else {
				food = scanner.nextLine();
				break;
			}
		}
		System.out.println("あなたの名前は" + name + "です。" + "好きな食べ物は" + food + "です。");
	}
}
