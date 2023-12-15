package day06;

import java.util.Scanner;

public class OddEvenGameEx1 {
	public static void main(String[] args) {
		//정수 num가 주어졌을 때 홀수인지 짝수인지 판별하는 게임
		int num = 10;
		//num가 1~100사이의 랜덤한 수를 생성하는 코드를 작성
		int min = 1,max = 100;
		
		//아래 코드를 현재 금액이 0이 될 때까지 반복하도록 수정
		
			
		
		Scanner scan = new Scanner(System.in);
		int totalMoney = 10000; //게임 시작시 주어지는 금액
		num = (int)(Math.random() * (max-min+1) + min);
		
		
		while(totalMoney > 0) {
			
		//사용자가 게임에 투입할 금액을 입력하는 코드를 작성
		System.out.println("배팅할 금액을 입력하세요(1~"+totalMoney+") :" );
		int money = scan.nextInt();
		
		//입력받은 money가 totalMoney보다 크면 totalMoney로 수정
		if(money > totalMoney) {
			money = totalMoney;
		}
		/*money = money > totalMoney ? totalMoney : money;*/
		
		//사용자가 0또는 1을 입력받은 코드를 작성 0:짝수 1:홀수
		
		System.out.println("홀(1)/짝(0)?");
		int user = scan.nextInt();
		
		if(num % 2 == 0) {
		   System.out.println(num + "는 짝수!");	
		   
			
		}else {
		   System.out.println(num + "는 홀수!");
		   
			
		}
		
		//사용자가 입력한 값이 맞았는지 틀렸는지를 출력하는 코드
		//사용자가 입력한 값이 num의 홀짝과 맞는지를 출력하는 코드
	    //승이면 배팅 금액에 2배를 주고 패이면 배팅 금액을 차감
		if(user == num % 2) {
			System.out.println("사용자 승!");
			totalMoney += money;
			
		} else {
			System.out.println("사용자 패!");
			totalMoney -= money;
			
		}
		
		System.out.println("현재 금액 : " + totalMoney);
		}
		System.out.println("배팅 금액이 없어서 게임을 종료합니다.");
		scan.close();
	}

}

