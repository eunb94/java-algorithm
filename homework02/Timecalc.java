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
		System.out.println("초 값을 입력하세요. [  ]");
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH-MM-SS");
		System.out.println(date);
		String result = sdf2.format(date);
		String res = result.substring(6,8);
		System.out.println(res);
		String sec = "";
		sec = scanner.next();
		int time, time2 = 0;
		String result1 = "";


	}

}
