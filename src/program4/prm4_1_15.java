package program4;
import java.util.Date;
import java.util.Scanner;

public class prm4_1_15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		program1_15();
	}
	public static void program1_15() {
        System.out.print("今日の日付は? : ");
        
        Date today = new Date();  // 現在日時
        int month = today.getMonth() + 1;  // 月
        int day = today.getDate();   // 日
        
        
        Scanner scanner = new Scanner(System.in);
        String monthday = scanner.next();
        
        //System.out.print(monthday);
        
        System.out.println(month + "月" + day + "日");
	}
}
