package day14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
	public static void main(String[] args){
		//속담을 입력받아 저장하고,출력하는 코드를 작성하시오.
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		
		String str;
		do {
			System.out.println("속담을 입력하세요.(종료하려면 -1) :");
			str = scan.nextLine();
			list.add(str);
			
		}while(!str.equals("-1"));
		
		for(String tmp: list) {
			System.out.println(tmp);
		}
	}

}
