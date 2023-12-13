package day04;

public class StarEx4 {
	/*       *
	 *      ***
	 *     *****
	 *    *******
	 *   *********
	 * 
	 * 
	 * 
	 */
	int rows = 5;
	for(int i = 1; i<=5; i++) {
		// ' ' 출력 5-i개
		for(int j = 1; j<=rows-i; j++) {
			System.out.println(' ');
		}
		for(int j =1; j<=2*i-1; j++) {
			System.out.println("*");
		}
		System.out.println();
		//*출력 2*i-1개
		
		//엔터
	}
}
}