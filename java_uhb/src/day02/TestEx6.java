package day02;

import java.util.Scanner;

public class TestEx6 {
	public static void main(String[] args) {
		/*산술 연산자와 두 정수를 입력받아
		 * 산술연산자에 맞는 연산결과를 출력하는 코드를 작성하시오.
		 * 예
		 * 두 정수와 연산자 입력(예:1+2) : 1+2
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력 : ");
		int num1 = scan.nextInt();
		
		System.out.println("정수를 입력 : ");
		int num2 = scan.nextInt();
		
	
		
		System.out.println("연산자를 입력하세요 : ");
		char operator = scan.next().charAt(0);
		
		
	    if(operator == '+' ) {
		System.out.println(num1 + " " + operator + "" + num2
			 + " = " + (num1 + num2));	
	    scan.close();
	    }else if(operator == '-' ) {
		System.out.println(num1 + " " + operator + "" + num2
		 + " = " + (num1 - num2));	
		scan.close();
		   
	    }else if(operator == '*' ) {
	    System.out.println(num1 + " " + operator + "" + num2
		+ " = " + (num1 * num2));
	    scan.close();
			  
	    }else if(operator == '%' ) {
		System.out.println(num1 + " " + operator + "" + num2
		+ " = " + (num1 % num2));	
		scan.close();		
		
	 
			
	}
}
}