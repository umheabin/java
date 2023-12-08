package day01;

public class VariableEx02 {
	public static void main(String[] args) {
	//정수형 변수 선언 예제
	byte num1 = 1;
	System.out.println(num1);
	//byte는 127까지 표현할 수 있기 때문에 128은 저장할 수 없다.
	//byte num2 = 128;
	//byte의 양수 표현 범위를 넘어서 오버플로우가 발생되어 -128이 됨.
	byte num3 = (byte) (127 + 1);
	System.out.println(num3);
	//byte의 음수 표현 범위를 넘어서 언더플로우가 발생되어 127이 됨.
	byte num4 = (byte)(-128 -1);
	System.out.println(num4);
	
	int num5 = 128; //100*1 + 10*2 + 1*8
    System.out.println(num5);
    //int의 양수 표현 범위를 넘어서 저장할 수 없음.
    //int num6 = 12345789123;
    
    int num7 = 010; //8진수 10
    System.out.println(num7);
    int num8 = 0x10; //16진수 10
    System.out.println(num8);
    int num9 = 0b10; //2진수 10
    System.out.println(num9);
    
    
    
	
	

}

}