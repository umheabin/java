package day04;

public class StarEx3 {
	public static void main(String[] args) {
	/*     *
	*     **
	*    ***
	*   ****
	*  *****
	*/
		int rows = 5;
		for(int i = 1; i<=rows; i++) {
			// ' '5-i개 출력
			for(int j = 1; j<=rows-i; j++) {
				System.out.println("*");
			}
			//*을 i개 출력
			for(int j = 1; j<=i; j++) {
				System.out.println("*");
			}
			System.out.println();
		}
	}
}