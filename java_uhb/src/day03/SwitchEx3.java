package day03;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		/*월을 입력받아 월의 계절을 출력하세요.
		 * 3,4,5 : 봄
		 * 6,7,8 : 여름
		 * 9,10,11 : 가을
		 * 12,1,2 : 겨울
		 * 그 외:잘못된 월
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 3,4,5:
			System.out.println(month + "은 봄");
		break;
		case 6,7,8:
			System.out.println(month + "은 여름");
	    break;
		case 9,10,11:
			System.out.println(month +"은 가을");
		break;
		case 12,1,2:
			System.out.println(month +"은 겨울");
		break;
		default:
			System.out.println(month + "월은 잘못된 월");
		}
	}

}
