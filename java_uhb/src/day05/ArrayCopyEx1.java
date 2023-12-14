package day05;

public class ArrayCopyEx1 {
	public static void main(String[] args) {
	int arr1 [] = new int[] {1,2,3,4,5};
	int arr2 [] = arr1;
	
	int arr3[] = new int[arr1.length];
	for(int i = 0; i<arr1.length;  i++) {
		arr3[i] = arr1[i];
	}
	
	System.arraycopy(arr1, 0, arr3, 0, arr1.length);
	System.out.println("arr3 확인 :");
	for(int i = 0; i<5; i++) {
		System.out.println(arr2[i]);
	}
	int arr5[] = new int[arr1.length];
	System.arraycopy(arr1, 1, arr5, 2, 2);
	System.out.println("\narr5 확인 :");
	for(int i = 0; i<5; i++) {
		System.out.println(arr5[i]);
	}
	
	
	}
}
