package day03;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		char ch = 'a';
		while(true) {
			System.out.println("문자 :");
			ch = scan.next().charAt(0);
			System.out.println("문자 : " + ch);
			if(ch == 'q') {
				break;
			}
		}
		
		scan.close();
	}

}
