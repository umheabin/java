package day02;

import java.util.Scanner;

public class ScannerEx1 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int num1 = scan.nextInt();
		//정수를 입력받은 예제
		System.out.println("입력받은 정수: " + num1);
		
		System.out.println("한 단어를 입력하세요. : ");
		String str1 = scan.next();
		System.out.println("입력받은 단어 : " + str1);
        //실수를 입력받은 예제		
		System.out.println("실수를 입력하세요.");
		double num2 = scan.nextDouble();
		System.out.println("입력받은 실수 : " + num2);
		
	    System.out.println("한 단어를 입력하세요 : ");
	    String str3 = scan.nextLine();
	    System.out.println("입력받은 단어: " + str3);
	    //문자를 입력받는 예제
	    System.out.println("문자를 입력하세요 : ");
	    //"문자열".charAt(번지) : 번지번째에 있는 문자를 가져옴
	    char ch = scan.next().charAt(0);
	    System.out.println("입력받은 문자 : " + ch);
		scan.close();
		//문자열을 입력받는 예제
		//한 단어를 입력받은 예제
		
		//한 줄을 입력받는 예제
	
		
		scan.close();
	
	}

}
