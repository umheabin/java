package day14;

public class ExceptionEx1 {
    public static void main(String[] args) {
    	int num1 = 1,num2 = 0;
    	try {
    	System.out.println(num1 /num2);
    	/*catch(RuntimeException e) {
    	}	*/
    	}catch(ArrayIndexOutOfBoundsException e) {
    	  System.out.println("잘못된 번지입니다.");	
    	}catch(ArithmeticException e){
    	System.out.println("0으로 나누면 안됩니다.");
    	}catch(Exception e) {
    		System.out.println("모든 예외를 처리합니다.");
    }System.out.println("프로그램을 종료합니다.");
}
}