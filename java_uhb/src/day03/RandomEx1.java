package day03;

public class RandomEx1 {
    //min ~ max 사이의 랜덤한 수를 생성하는 예제
	public static void main(String[] args) {
		
		//Math.random()은 0이상 1미만의 랜덤한 실수를 만들어줌
		int min = 1,max = 10;
		int r = (int)(Math.random() * (max-min+1) + min);
		System.out.println("랜덤 : " + r
				);
		
	}

}
