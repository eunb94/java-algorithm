package homework02;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat; 
public class Timecalc {
	/** To.개발자님께
	초단위로 알려주는 시험이 있는데
	이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sec =0; 
	 	int min =0; 
	 	int hour =0; 
	 	while(true) { 
				System.out.println("계산할 시간을 입력해주세요."); 
				int time = scanner.nextInt(); 
					hour = time/3600; 
					min = (time%3600)/60; 
		 			sec = time%60; 
					System.out.println(String.format("%d시 %d분 %d초 입니다.",hour,min,sec)); 
		 		} 

	}

}
