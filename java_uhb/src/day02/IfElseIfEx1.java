package day02;

public class IfElseIfEx1 {
	public static void main(String[] args) {
		int num = 3;
		/*num가 0이면 0이라고 출력하고,num가 양수이면 양수라고 출력하고,
		 * num가 음수이면 음수라고 출력하는 코드를 작성하시오.
		 */
		
		if(num == 0){
			System.out.println(0);
		} else if(num > 0) {
		    System.out.println(num + "양수");
		}else {
			System.out.println(num + "는 음수");
			
		}
	}

}
