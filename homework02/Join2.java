package homework02;
import java.util.Scanner;
public class Join2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===회원가입===");
		String[] infos = {"아이디", "비밀번호", "이름", "생년월일(예)1980-01-01", "성인여부(성인true,미성년false)", "키(소수점 첫째자리까지)", "몸무게(소수점 첫째자리까지)", "혈액형(A)"};
		System.out.printf("%s 정보를 입력하세요. \n", infos[0]);
		String id = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[1]);
		String pass = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[2]);
		String name = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[3]);
		String birth = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[4]);
		String adult = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[5]);
		String height = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[6]);
		String weight = scanner.next();
		System.out.printf("%s 정보를 입력하세요. \n", infos[7]);
		String blood = scanner.next();
		String[] ans = {id, pass, name, birth, adult, height, weight, blood};
		System.out.println("===회원정보===");
		System.out.printf("아이디 : %s \n", ans[0]);
		System.out.printf("비밀번호 : %s \n", ans[1]);
		System.out.printf("이름 : %s \n", ans[2]);
		System.out.printf("생년월일(예)1980-01-01 : %s \n", ans[3]);
		System.out.printf("성인여부(성인true,미성년false) : %s \n", ans[4]);
		System.out.printf("키(소수점 첫째자리까지) : %s \n", ans[5]);
		System.out.printf("몸무게(소수점 첫째자리까지) : %s \n", ans[6]);
		System.out.printf("혈액형(A) : %s \n", ans[7]);
		}			 
			
		}
