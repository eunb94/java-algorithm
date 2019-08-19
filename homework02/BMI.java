package homework02;
import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===BMI 지수를 측정합니다.===");
		System.out.println("귀하의 키를 입력해주세요.");
		int hei = scanner.nextInt();
		float hei2 = hei / 100f;
		System.out.printf("%.2f \n", hei2);
		System.out.println("귀하의 몸무게를 입력해주세요.");
		int wei = scanner.nextInt();
		float bmi = wei / (hei2 * hei2);
		System.out.println(bmi);
		if(30.0 < bmi) {
			System.out.println("고도비만");
		}else if(25.0 < bmi) {
			System.out.println("비만");
		}else if(23.0 < bmi) {
			System.out.println("과체중");
		}else if(18.5 < bmi) {
			System.out.println("정상");
		}else if (bmi<18.4) {
			System.out.println("저체중");
		}

	}

}
