package day03;

public class WhileSumEx1 {
	public static void main(String[] args) {
    /*1부터 5까지의 합을 구하는 코드를 작성하시오.*/

	
	/*
	sum = sum + i;
	++i;
	sum = sum + i;
	++i;
	sum = sum + i;
	++i;
	sum = sum + i;
	++i;
	sum = sum + i;
	++i;
    */
	
	int sum = 0;
	int i = 1;
	int num = 100;
	while(i <= num) {
		sum = sum + i;
		++i;
	}
	

	
	System.out.println(sum);
   	
    
}
}