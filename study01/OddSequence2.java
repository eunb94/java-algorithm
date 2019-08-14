package study01;
import java.util.Scanner;
public class OddSequence2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String seq = "";
		int ser = 0;
		System.out.println("입력된 시작값에서부터 마지막값까지 홀수의 합");
		System.out.println("시작값 : ");
		int start = scan.nextInt();
		System.out.println("마지막값 : ");
		int end = scan.nextInt();
		for(int i=start; i<=end; i++) {
			if(i % 2 != 0 ) {
				int end2 = 0;
				if(end % 2 != 0) {
					end2 = end -1;
				}if (end % 2 == 0){
				}else {
					end2 = end;
				} 
				if(i !=end) {
					seq += i + "+";
				}else {
					seq += i + "=";
				}
				ser += i;
			}
		}
		System.out.println( seq + ser );

	}
}