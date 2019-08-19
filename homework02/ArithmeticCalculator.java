package homework02;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("연산의 종류를 선택하세요. 1. +, 2. -, 3. *, 4. /");
		int cho = scanner.nextInt();
		System.out.println("계산할 값을 입력해주세요.");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if(cho == 1) {
			int c = a + b;
			System.out.println(String.format("%d + %d = %d", a, b, c));
		}else if(cho == 2) {
			int c = a - b;
			System.out.println(String.format("%d - %d = %d", a, b, c));
		}else if(cho == 3) {
			int c = a * b;
			System.out.println(String.format("%d * %d = %d", a, b, c));
		}else if(cho == 4){
			int c = a / b;
			int d = a % b;
			System.out.println(String.format("%d / %d = %d [%d] ", a, b, c, d));
		}
		

	}

}
