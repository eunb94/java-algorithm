package homework02;
import java.util.Scanner;
public class PassOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.next();
		String[] subjects = {"국어", "영어", "수학"};
		System.out.printf("%s 점수를 입력해주세요. \n", subjects[0] );
		int kor = scanner.nextInt();
		System.out.printf("%s 점수를 입력해주세요. \n", subjects[1] );
		int eng = scanner.nextInt();
		System.out.printf("%s 점수를 입력해주세요. \n", subjects[2] );
		int math = scanner.nextInt();
		int total = kor + eng + math;
		int aver = total / 3;

		String[] ans1 = {name};
		int[] ans2 = {kor, eng, math, total, aver};
		System.out.println("학생     국어     영어     수학      총점      평균     합격여부  ");
		System.out.println("===========================================");
		System.out.printf("%s   ", name);
		System.out.printf("%d   " ,  kor);
		System.out.printf("%d   ",  eng);
		System.out.printf("%d   ",  math);
		System.out.printf("%d   ", total);
		System.out.printf("%d   ", aver);
		if(70<=aver) {
			System.out.println("합격");
		}else if(90<=aver) {
			System.out.println("장학생");
		}else if(aver<70) {
			System.out.println("불합격");
		}
		
	}

}
