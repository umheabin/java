package day03;

public class ForEx2 {
	public static void main(String[] args) {
	     
	     int sum = 0;
	     for(int i = 1; i<=10; i++) {
	    	 if(i % 2 ==0) {
	    		 sum = sum + i;
	    	 }
	     }
	     System.out.println("1부터 10까지 짝수의 합 :" + sum);
	}

}
