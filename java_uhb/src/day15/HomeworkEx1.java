package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import day15.student.Student;
import java.util.Random;


public class HomeWorkEx1 {
	
	private static Scanner scan = new Scanner(System.in);
	
	private static List<Student> list = new ArrayList<Student>();

  public static void main(String[] args) {
		
		
		/* 영어 단어장을 관리하는 프로그램을 작성하세요.
		 * 기한은 1/5까지 github에 업로드 후 강사에게 공유(단톡방)
		 * - 한 단어에 뜻이 여러개 있을 수 있음
		 * - 단어, 품사, 뜻을 관리
		 * - 단어 추가
		 * - 단어 수정
		 * - 단어 삭제
		 * - 뜻 추가
		 * - 뜻 수정
		 * - 뜻 삭제
		 * - 단어 조회
		 * 
		 * - 기타 추가 기능을 구현해도 됨
		 * - 등록된 단어장에서 랜덤으로 문제가 나오고 맞추는 기능
		 * - 오답 노트를 관리하는 기능 
		 * - 많이 조회한 단어를 확인하는 기능
		 * */
	
	  int menu;
		//반복문
		do {
			//메뉴 출력
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택한 메뉴에 맞는 기능 실행
			runMenu(menu);
		
		}while(menu !=8);
  }
        public static void printMenu() {
	    System.out.println("-------------");
	    System.out.println("1. 단어 추가");
	    System.out.println("2. 단어 수정");
	    System.out.println("3. 단어 삭제");
	    System.out.println("4. 단어 조회");
	    System.out.println("5. 뜻 추가");
	    System.out.println("6. 뜻 수정");
	    System.out.println("7. 뜻 삭제");
	    System.out.println("8. 랜덤 퀴즈쇼!!");
	    System.out.println("8. 종료");
	    System.out.println("-------------");
	    System.out.print("메뉴 선택 : ");
   
  }
		
		public static void runMenu(int menu) {
			switch(menu) {
			case 1:
				//단어 추가 기능 구현
				insertWord();
				break;
			case 2:
				//단어 수정 기능 구현
				break;
			case 3:
				//단어 삭제 기능 구현
				break;
			case 4:
				//단어 조회 기능 구현
		        break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				checkWord();
				break;
			default:
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}
		public static void insertWord() {
			System.out.print("단어 : ");
			String word = scan.next();
			
			System.out.print("뜻 : ");
			scan.nextLine();
			String meaning = scan.nextLine();
			
			Word tmp = new Word(word, meaning);
			
			if(!list.contains(word) && list.contains(meaning)) {
				System.out.println("단어를 추가했습니다.");
			}
         
		}
		public static void checkWord() {
			System.out.println("단어 :");
			String word = scan.next();
			
			String[] items= {"cherry","apple","banana","melon","7"};

			Random random=new Random();

			int[] nums=new int[1];
			for(int i=0; i<nums.length; i++) {
				nums[i]=random.nextInt(5);
			}
			String result = items[nums[0]]+"|"+items[nums[1]]+"|"+items[nums[2]];

			System.out.println(result);

			int[] point = {10,20,30,40,1000};

			if(nums[0]==nums[1] && nums[0]==nums[2]) {
				for(int n=0; n<point.length; n++) {
					if(nums[0]==n) {
						System.out.println(point[n]+"점 입니다.");
					}
				}
			}else {
				System.out.println("0점 입니다.");
			}
					
		}
		
		
}

