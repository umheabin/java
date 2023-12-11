package day02;

public class LogicalOperatorEx1 {
	public static void main(String[] args) {
	/* && : ~하고,~이고
	 * A && B : A와 B는 참/거짓을 판별할 수 있는 식 또는 변수
    성적이 100이하이고,성적이 90이상이면 A,성적이 95이면 ->true
    100이고,90이다 A, 성적이 95 이면 판별할 수 없다 ->에러 발생
    * A && B
    * F && F -> F
    * F && T -> F
    * T && F -> F
    * T && T -> T(둘다 참일 때 참)
    * || : ~이거나,~하거나
    * A || B
    * F || F ->F
    * F || T ->T
    * T || F ->T
    * T || T ->T
    *
    * ! :~아닌,반대
    * !A
    * F -> T
    * T -> F
    */
	int score = 0;
	//성적이 올바른지 확인.올바른 성적은 0이상 100이하
	//성적이 0이상이고, 성적이 100이하이다.
	//성적이 0보다 크거나 같고, 성적이 100보다 작거나 같다.
	//성적 0보다 크거나 같다.그리고 성적이 00보다 작거나 같다.
	System.out.println(score + "점은 올바른 성적인가? " + (score >= 0 && score <=100));
	
	System.out.println(score + "점은 올바른 성적이 아닌가?" + !(score >= 0 && score <=100));
	/*성적이 올바르지 않을지를 확인,올바르지 않은 성적이 0미만,100초과
	 * 성적이 0미만이거나 성적이 100초과이다.
	 * 성적이 0보다 작거나 성적이 100보다 크다.
	 * 성적 < 0 || 성적 > 100
	 */
	System.out.println(score + "점은 올바른 성적이 아닌가?" + (score < 0 || score > 100));
	
	
}
}