package homework02;
import java.util.Scanner;
public class ScoreCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	

			System.out.println("진행 1, 종료 -1");
			int num = scanner.nextInt();
			int res = 0;
			int c = 0;
			int b = 0;
			int end = 0;
			
			if(num==1) {
				System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
				int a = scanner.nextInt();
				while(a==-1) {
					String res2 = a+ "더하시려는 숫자를 입력하세요(종료는 -1)";

				
				}
				}else if(num==-1){
					System.out.println("시스템 종료"); return;
				
				}
		
	}

		}

	
