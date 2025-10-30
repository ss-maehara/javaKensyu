package program4;
import java.util.Scanner;

public class prm4_1_16 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program1_16();
	}
	
	public static void program1_16() {
		int num1;
		int num2;
		Scanner scanner = new Scanner(System.in); 
		
		
		
		
		while(true) {
		System.out.print("数字を入力1:");
		if(scanner.hasNextInt()) {
			 num1 = scanner.nextInt();
			 break;
		}else {
			System.out.println("数字を入力してください");
			scanner.nextLine();
		}
	}
		
		
		while(true){
		System.out.print("数字を入力2:");
		if (scanner.hasNextInt()) {
			num2 = scanner.nextInt();
			break;
		}else {
			System.out.println("数字を入力してください");
			scanner.nextLine();
		}
	}
		int sum = num1 + num2;
		System.out.print("合計:" + sum);
	}
}

