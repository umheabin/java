package day04;

public class PrimeNumberEx1 {
    public static void main(String[] args) {
    	/*2부터 100사이의 모든 소수를 출력하는 코드를 작성하시오.
    	 * 소수 판별 예제 이용(3일차 : ForPrimeNumberE.java참고)
    	 */
    	
    	for(int num = 2; num <=100; num++) {
    		//num가 소수이면 num을 출력하는 예제
        	
        	int count = 0, i;
        	for(i = 1; i<=num; i++) {
        		if(num % i == 0) {
        			count++;
        		}
        	}
        	if(count == 2) {
        		System.out.print(num + " ");
        	}
    	}
    	
    }
}
