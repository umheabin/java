package day05;

import java.util.Scanner;

public class ArrayEx1 {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int kor1,kor2,kor3,kor4,kor5;
		kor1 = scan.nextInt();
		kor2= scan.nextInt();
		kor3 = scan.nextInt();
		kor4 = scan.nextInt();
		kor5 = scan.nextInt();
		
		int[] korScores = new int[5];
		 
		for(int i = 0; i<5;i++) {__
			System.out.print("학생" + (i+1) + "성적: ");
		korScores[i] = scan.nextInt();
		}
		
		for(int i = 0; i<5; i++) {
			System.out.println("학생" + (i+1) + "성적 :" + korScores);
	
			
		
		scan.close();
		
		
		
		}
	}

}