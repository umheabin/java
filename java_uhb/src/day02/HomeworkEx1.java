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
 		int score = scan.nextInt();
 		if(score >= 90 && score <= 100){
 			System.out.println("A");
 		}
 		else if(score >=80 && score < 90) {
 			System.out.println("B");
 		}
 		else if(score >=70 && score < 80) {
 			System.out.println("C");
 		}
 		else if(score >=60 && score < 70) {
 			System.out.println("D");
 		}
 		else if(score < 60) {
 			System.out.println("F");
 		}
 		else {
 			System.out.println("잘못된 점수");
 		}
 		
 		if(score < 0 || score > 100) {
 			System.out.println("잘못된 점수");
 		}else if(score >=90) {
 			System.out.println(score + "점은 A");
 		}else if(score >=80) {
 			System.out.println(score + "점은 B");
 		}else if(score >=70) {
 			System.out.println(score + "점은 C");
 		}else if(score >=60) {
 			System.out.println(score + "점은 D");
 		}else {
 			System.out.println(score + "점은 F");
 		}
 			
     }
}
    	 
    

