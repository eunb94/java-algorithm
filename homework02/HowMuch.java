package homework02;
import java.util.Scanner;
public class HowMuch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("얼마예요?");
		int ans = 0;
		ans = scanner.nextInt();
		System.out.println(ans+"원 입니다. 몇개 드릴까요?");
		int ans2 = 0;
		ans2 = scanner.nextInt();
		System.out.println(ans2+"개 주세요.");
		int total = ans*ans2;
		System.out.println("총 금액은"+ total + "입니다.");
		System.out.println("비싸요, 10% 깎아주세요.");
		int dc = total/10;
		total = total-dc;
		System.out.println("그럼 "+ total +"원만 주세요.");
		
	
		

	}

}
