package day12;

public class PolymorphismEx1 {
   public static void main(String[] args) {
	   /*다형성 예제
	    * 1.매개변수의 다형성
	    */
	   Remocon r = new Remocon();
	   Tv tv = new Tv();
	   AirConditioner aircon = new AirConditioner(); 
	   Projector projector = new Projector();
	   r.turnOn(tv);
	   r.turnOn(aircon);
	   r.turnOn(projector);
   }

}

//리모콘 : Tv나 에어컨 등을 켜는 기기
class Remocon{
   
   void turnOn(ElectoronicProduct target) {
	   if(target instanceof Tv) {
		   System.out.println("Tv");
	   }else if(target instanceof AirConditioner) {
		   System.out.println("에어컨");
	   }else if(target instanceof Projector) {
		   System.out.println("빔 프로젝트");
	   }else {
		   System.out.println("전자");
	   }
	   System.out.println("제품이 커졌습니다.");
   }
}
   /*매개변수의 다형성을 이용하여 turnOn 메서드를 1개만 생성*/
   /*
   void turnOn(ElectoronicProduct target) {
	   System.out.println("제품이 켜졌습니다.");
    */   
   
    

//전자제품
class ElectoronicProduct{
	
}

class Tv extends ElectoronicProduct{
	
}

class AirConditioner extends ElectoronicProduct{
	
}

class Projector extends ElectoronicProduct{
	
}