//using java generics, make a function general and independent of datatype.

package edu.sjsu.cmpe273;

public class Generics {

	public static <G> G[] Show(G[] myData) {
		// display
		for (G element : myData) {
			System.out.print(element + " ");
		}

		return myData;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] IntArr = { 1, 2, 3, 4, 5 };
		String[] StrArr = { "This is string array!" };
		Double[] DoubleArr = { 55.0, 4.67, 3.32, 7.54 };

		System.out.println("printing int array : ");
		Show(IntArr);
		System.out.println();
		System.out.println("printing string : ");
		Show(StrArr);
		System.out.println();
		System.out.println("printing double array : ");
		Show(DoubleArr);
	}

}
