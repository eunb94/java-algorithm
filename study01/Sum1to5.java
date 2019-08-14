package study01;

public class Sum1to5 {

	public static void main(String[] args) {
		String result = "";
		for(int i=1;i<=5;i++) {
			result += (i==5) ? i+" = " : i+" + "; 
					
		System.out.print(result);
		}
	}
}
	