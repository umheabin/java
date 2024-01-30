package university;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.print.PrintService;

import university.service.PrintServiceImp;

public class universityProgram {

	
	private Scanner scan = new Scanner(System.in);
	private PrintService printSerive = (PrintService) new PrintServiceImp();
	
	private final int EXIT = 5;
	public void run() {
		
		int menu = 0;
		String fileName = "src/word/wordList.txt";
	
		do {
			try {
				printMenu();
				//메뉴 선택
				menu = scan.nextInt();
				runMenu(menu);
			}catch(InputMismatchException e) {
				System.out.println("잘못된 메뉴입니다.");
				//메뉴를 잘못 입력하면 입력 버퍼에 잘못 입력된 메뉴가 남아있어서 비워줘야 함.
				//비워주지 않으면 무한 루프 발생
				scan.nextLine();
			}
		}while(menu != EXIT);
	}

	public void printMenu() {
		
		
	}

	private void runMenu(int menu) {
			switch(menu) {
			case 1:
				wordManage();
				break;
			case 2:
				meanManage();
				break;
			case 3:
				printManage();
				break;
			case 4:
				gameManage();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				throw new InputMismatchException();
			}
		}

	private void printManage() {
		// TODO Auto-generated method stub
		
	}

	private void gameManage() {
		// TODO Auto-generated method stub
		
	}

	private void meanManage() {
		// TODO Auto-generated method stub
		
	}

	private void wordManage() {
		// TODO Auto-generated method stub
		
	}
	}