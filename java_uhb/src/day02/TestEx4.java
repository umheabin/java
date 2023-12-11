package day02;

import java.util.Scanner;

public class TestEx4 {
	public static void main(String[] args) {
		//성인 판별 예제
		/*나이를 입력받아 나이가 20세 이상이면 성인으로 출력하고,
		 * 20세 미만이라면 미성년자로 출력되는 코드를 작성하시오.
		 */
		    Scanner scan = new Scanner(System.in);
			System.out.println("나이를 입력 : ");
			int num = scan.nextInt();
			
			if(num >= 20) {
				System.out.println("성인!♡");
			}else if(num <= 20) {
				System.out.println("미성년자!♡");
			}
			scan.close();
	}

}
