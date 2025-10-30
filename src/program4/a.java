package program4;
import java.util.Scanner;

public class a {

    public static void main(String[] args) {
        program1_1();
    }
    
    public static void program1_1() {
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in); 
        
        // num1の入力
        while(true) {
            System.out.print("数字を入力1: ");
            if(scanner.hasNextInt()) {
                num1 = scanner.nextInt();
                scanner.nextLine(); // 改行を消す
                break; // 数字が入力されたらループを抜ける
            } else {
                System.out.println("数字を入力してください");
                scanner.nextLine(); // 不正入力を消す
            }
        }
        
        // num2の入力
        while(true) {
            System.out.print("数字を入力2: ");
            if(scanner.hasNextInt()) {
                num2 = scanner.nextInt();
                scanner.nextLine(); // 改行を消す
                break; // 数字が入力されたらループを抜ける
            } else {
                System.out.println("数字を入力してください");
                scanner.nextLine(); // 不正入力を消す
            }
        }
        
        int sum = num1 + num2;
        System.out.println("合計: " + sum);
        
        scanner.close();
    }
}
