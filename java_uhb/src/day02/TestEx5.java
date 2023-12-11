package day02;

import java.util.Scanner;

public class TestEx5 {
	public static void main(String[] args) {
		/*월을 입력받아서 입력받은 월의 계절을 출력하세요.
		 *3,4,5 : 봄
		 *6,7,8 : 여름
		 *9,10,11:가을
		 *12,1,2:겨울
		 * 그 외 : 잘못된 일
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력 : ");
		int num = scan.nextInt();
		
		if (num == 3 || num == 4 || num == 5) {
			System.out.println("봄");
		}
		else if(num == 6 || num == 7 || num == 8) {
			System.out.println("여름");
		}
		else if(num == 9 || num == 10 || num == 11) {
			System.out.println("가을");
		}
		else if(num == 12 || num == 1 || num == 2) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못된 월");
		}
		
		if(num < 1 || num > 12) {
			System.out.println(num + "월은 잘못된 월");
		} else if(num <= 2 || num == 12) {
			System.out.println(num + "월은 겨울");
		} else if(num <= 5) {
			System.out.println(num +" 월은 봄 ");
		} else if(num <=8) {
			System.out.println(num + "월은 여름");
		} else {
		    System.out.println(num + "월은 가을");
		}
		
		scan.close();
			
	
	}

}
