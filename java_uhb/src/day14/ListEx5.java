package day14;

import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;

public class ListEx5 {
	public static void main(String[] args) {
		//contains와 indexOf
		List<A> list = new ArrayList<A>();
		list.add(new A(1));
		list.add(new A(10));
		
		System.out.println(list.indexOf(new A(1)));
	}

}
@EqualsAndHashCode
class A{
	private int num;
	
	public void print() {
		
		System.out.println(num);
	}
	public A(int num) {
		this.num = num;
	}
}