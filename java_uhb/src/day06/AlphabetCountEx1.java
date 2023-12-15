package day06;

import java.util.Scanner;

public class AlphabetCountEx1 {
	public static void main(String[] args){	/*단어를 입력받아 단어 각 알파벳이 몇 번 나왔는지 출력하는 코드*/
	System.out.println('b'-'a');
	//단어를 입력 => 문자열을 입력
	System.out.println("단어 입력 : ");
	Scanner scan = new Scanner(System.in);
	String str = scan.next();
	int[] arr = new int[26];
		
	//반복문으로 단어의 문자열의 길이만큼 반복
	for(int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		System.out.println(ch);
		arr[ch-'a']++;
	}
	//가져온 문자의 배열 번지에 숫자를 증가
	//가져온 문자가 a이면 0번지에 있는 숫자를 1증가, b이면 1번지에 있는 숫자를 1증가
	//문자열의 각 문자를 가져옴
	for(int i = 0; i<arr.length; i++) {
		if(arr[i] != 0) {
			char ch = (char)('a' + i);
			System.out.println(ch + " : " + arr[i]);
		}
	}
	//반복문으로 배열의 크기만큼(26개) 반복
    //개수가 0이 아닌 알파벳들을 출력
	System.out.println("===========");
	char ch = 'a';
	for(int count : arr) {
		if(count !=0) {
		System.out.println(ch + " : " + count);
	}
	ch++;
	}
	scan.close();
	
	
	}
}
