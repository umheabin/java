package day03;

public class NestedIfEx1 {
	public static void main(String[] args) {
		int num = 1;
		
		if(num % 2 == 0) {
			if(num % 3 == 0) {
				System.out.println(num + "은 6의 배수");
			} else {
				System.out.println(num + "은 2의 배수");
			}
			
		}else {
			System.out.println("2,6의 배수가 아님");
		}
	}

}
