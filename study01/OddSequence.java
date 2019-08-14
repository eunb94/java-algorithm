package study01;

public class OddSequence {

	public static void main(String[] args) {
		// 1 + 3 + 5 + 7 + 9 =
		// i % 2 = 0 이면 짝수 1이면 홀수
		String seq = "";
		int ser = 0;
		for(int i=1; i<=10; i++){
			if(i % 2 !=0) {
			if(i!=9) {
				seq += i+" + ";
			}else {
				seq += i+" = ";
			}
				ser += i;
			}
		}	System.out.println( seq + ser ); 
	}
}
