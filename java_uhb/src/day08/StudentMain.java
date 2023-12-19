package day08;

public class StudentMain {
	public static void main(String[] args) {
		Student std = new Student();
		std.printInfo();
		
		std.grade = 1;
		std.classNum = 1;
		std.num = 1;
		std.name ="홍길동";
		std.printInfo();
		
		std.setKor(90);
		std.setEng(100);
		std.setMath(80);
		std.printScore();
	}

}
