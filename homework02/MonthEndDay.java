package homework02;
import java.util.Scanner;
public class MonthEndDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해주세요.");
		int month = scanner.nextInt();
		String res = "";
		switch(month) {
		case 1 : res = "31일"; break;
		case 2 : res = "29일"; break;
		case 3 : res = "31일"; break;
		case 4 : res = "30일"; break;
		case 5 : res = "31일"; break;
		case 6 : res = "30일"; break;
		case 7 : res = "31일"; break;
		case 8 : res = "31일"; break;
		case 9 : res = "30일"; break;
		case 10 : res = "31일"; break;
		case 11 : res = "30일"; break;
		case 12 : res = "31일"; break;
		default : res = "잘못 입력하셨습니다"; break;
		}
		System.out.println(month + " 월은 " + res + "까지 입니다.");
		
		

	}

}
