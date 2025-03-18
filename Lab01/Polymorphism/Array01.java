package Polymorphism;

class MyCharacter {
	char z = 'x';
}

public class Array01 {

	public static void main(String[] args) {
//		MyCharacter[] ts = new MyCharacter[3];
//		for (int i = 0; i < ts.length; i++)
//			ts[i] = new MyCharacter(); /* !! */
//		System.out.println(ts[0].z);
//		System.out.println(ts[1].z);
//		System.out.println(ts[2].z);
//		System.out.println((ts[0].z) == ts[1].z);
//		System.out.println(ts[0].equals(ts[1]));
//		
		
		
		int[][] d = { {1, 2, 3 }, {4, 5 } };
		System.out.println( java.util.Arrays.toString(d) );
		System.out.println( java.util.Arrays.toString(d[0]) );
		System.out.println( java.util.Arrays.toString(d[1]) );
//		System.out.println( java.util.Arrays.toString(d[2]) );
	}

}
