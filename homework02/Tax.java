package homework02;
import java.util.Scanner;
public class Tax {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("성함을 입력해주세요.");
			String name = scanner.next();
			System.out.println("연봉을 입력해주세요. (만원)");
			int annual = scanner.nextInt();
			System.out.println("세율을 입력해주세요.");
			float rate = scanner.nextFloat();
			float tax = annual * rate / 100;
			System.out.println("연봉 "+ annual + "만원을 받으시는 "+ name + "님께서 납부할 세금은 "+tax+"만원 입니다.");
	}

}
