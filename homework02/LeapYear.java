package homework02;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("===윤년 계산기===");
		System.out.println("윤년을 확인할 연도를 입력해주세요.");
		int year = scan.nextInt();
		String ans = "";
		
		if(year%4==0) {
			ans = "윤년";
		}else if(year%100==0) {
			ans = "평년";
		}else if(year%400==0) {
			ans = "윤년";
		}else {
			ans = "평년";
		}
		System.out.println("입력하신 " + year + "년은 " + ans + " 입니다.");
	}

}
