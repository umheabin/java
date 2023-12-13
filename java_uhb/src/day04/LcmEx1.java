package day04;

public class LcmEx1 {
	
	public static void main(String[] args) {
		/*
		 * 정수의 최소 공배수를 구하는 코드를 작성하시오.
		 */
		int num1 = 10,num2 = 15;
		for(int i = 1; i<=num1*num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + "과" + num2 + "의 최소 공배수 : " + i);
				break;
		}
	}
		
		
		
	
		for(int i = 1; i<=num1*num2; i++)
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(num1 + "과" + num2 + "의 최소 공배수 : " + i);
				break;
			}
	}

}

