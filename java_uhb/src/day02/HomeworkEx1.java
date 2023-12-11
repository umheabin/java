package day02;

import java.util.Scanner;

public class HomeworkEx1 {
     public static void main(String[] args) {
    	 /*성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 
    	  * 작성하시오.
    	  * 90점이상 ~ 100점이하 : A
    	  * 80점이상 ~ 90점미만 : B
    	  * 70점이상 ~ 80점미만 : C
    	  * 60점이상 ~ 70점미만 : D
    	  * 60미만 : F
    	  * 0보다 작거나 100보다 큰 경우:잘못된 점수
    	  */
    	Scanner scan = new Scanner(System.in);
 		System.out.println("점수를 입력 : ");
 		int num = scan.nextInt();
 		if(num >= 90){
 			System.out.println("A");
 		}
 		else if(num >=80) {
 			System.out.println("B");
 		}
 		else if(num >=70) {
 			System.out.println("C");
 		}
 		else if(num >=60) {
 			System.out.println("D");
 		}
 		else {
 			System.out.println("F");
 		}
 			
     }
}
    	 
    

