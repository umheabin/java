package day03;

import java.util.Scanner;

public class SwitchEx4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수와 연산자 입력(예:1+2):");
	    int num1 = scan.nextInt();
	    char operator = scan.next().charAt(0);
	    int num2 = scan.nextInt();
	    
	    switch(operator) {
	    case '+':
	    	System.out.println(num1 + operator + num2 + "=" +(num1+num2));
	    	break;
	    case '-':
	    	System.out.println(num1 + operator + num2 + "=" +(num1-num2));
	    	break;
	    case '*':
	    	System.out.println(num1 + operator + num2 + "=" +(num1 *num2));
	    	break;
	    case '/':
	    	System.out.println(num1 + operator + num2 + "=" +(num1 /(double)num2));
	    	break;
	    case '%':
	    	System.out.println(num1 + operator + num2 + "=" +(num1+num2));
	    	break;
	    default:
	    	System.out.println(operator + "는 산술 연산자가 아님");
	    }
	}

}
