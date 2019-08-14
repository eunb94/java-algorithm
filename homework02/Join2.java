package homework02;
import java.util.Scanner;
public class Join2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id, pas, name, birth, adu, hei, wei, bld = "";
		System.out.println("===회원가입===");
		System.out.println("아이디 : ");
		id = scanner.next();
		System.out.println("비밀번호 : ");
		pas = scanner.next();
		System.out.println("이름 : ");
		name = scanner.next();
		System.out.println("생년월일(예) 1980-01-01 : ");
		birth = scanner.next();
		System.out.println("성인여부(성인 true, 미성년 false : ");
		adu = scanner.next();
		System.out.println("키(소수점 첫째자리까지 : ");
		hei = scanner.next();
		System.out.println("몸무게(소수점 첫째자리까지 : ");
		wei = scanner.next();
		System.out.println("혈액형(A) : ");
		bld = scanner.next();
		
		System.out.println("===회원정보===");
		System.out.println("아이디 : "+ id);

	}

}
