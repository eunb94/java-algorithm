package study01;
import java.util.Scanner;
public class EvenSequence {

	public static void main(String[] args) {
		String sequence = "";
		int series = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 !=1) {
				if(i!=10) {
					sequence += i+"+";
				}else {
					sequence += i+"=";
				}
				series += i;
			}	
		}
		System.out.print(sequence + series);
	}
	}

