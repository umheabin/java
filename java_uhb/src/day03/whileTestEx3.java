package day03;

public class whileTestEx3 {
   	public static void main(String[] args) {
	/*1에서 10사이의 모든 짝수를 순서대로 출력하는 코드를 작성하시오.
	 * 
	 */
     int i;
     int num = 15;
     i = 2;
     while(i <= num) {
    	 System.out.println(i);
    	 i = i + 2;
    	 
     }
     i = 1;
     while(i<= num) {
    	 if(i % 2==0) {
    		 System.out.println(i);
    	 }
    	 ++i;
     }
     i = 1;
     while(i<=5) {
    	 System.out.println(2*i);
    	 ++i;
     }

}
}