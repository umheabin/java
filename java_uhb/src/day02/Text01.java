package day02;

public class Text01 {
	public static void main(String[] args) {
		/*다음 코드를 이용하여 국어,영어,수학에 평균을 구하여
		 * 콘솔에 출력하는 코드를 작성하시오.
		 */
		int KorScore = 100,
		    engScore = 50,
		    mathScore = 92;
		
		int sum = 0;
		double avg = 0.0;
		
		sum = KorScore + engScore +mathScore;
		avg = sum / 3.0;
		
		System.out.println("세 과목의 종합: " + sum);
		System.out.println("세 과목의 평균: " + avg);
		
	}

}
