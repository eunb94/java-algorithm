package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaSc {
	public static void main(String[] args) {
		System.out.println("가위바위보 게임");
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("1.가위, 2.바위, 3.보");
		int com = 0;
		com = ran.nextInt(3)+1;
		System.out.println("가위바위보 중 선택 [   ]");
		int user = 0;
		user = scan.nextInt();
		System.out.println("랜덤 값" + com);
		String res = "";
		switch(user) {
		case 1 :	
			switch(com) {
			case 1 : res = " 비겼습니다."; break;
			case 2 : res = " 졌습니다."; break;
			case 3 : res = " 이겼습니다."; break;
			
			}System.out.println(res); break;
		case 2 : 
			switch(com) {
			case 1 : res = " 이겼습니다."; break;
			case 2 : res = " 비겼습니다."; break;
			case 3 : res = " 졌습니다."; break;
			}System.out.println(res); break;
		case 3 : 
			switch(com) {
			case 1 : res = " 졌습니다."; break;
			case 2 : res = " 이겼습니다."; break;
			case 3 : res = " 비겼습니다."; break;
			}System.out.println(res);break;
		}
	}
}

