package day02;

public class IfEx1 {
	public static void main(String[] args) {
		/* ...이면 ~이다 : 조건문
		 * ...: 조건식
		 * ~ : 실행문
		 * if(조건식){
		 * 실행문;
		 * }
		 * *///정수가 0이면 0이라고 출력하고,정수가 0이 아니면 0이 아닙니다.라고 출력하는 예제
		int num = 0;
		
		if(num == 0) {
			System.out.println( "0입니다.");
			
		}
		if(num !=0) {
			System.out.println(num + "는 0이 아닙니다.");
		}
	}

}
