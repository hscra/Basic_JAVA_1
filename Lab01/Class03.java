class D {
	D() {
		System.out.print("[C]");
	}
}

class A4 {
}

class B4 {
	B4(int n) {
	}
}

class MyNumber1 {
	double x = Math.sqrt(2);
	String s = new String("sqrt(2)=");

	MyNumber1() {
		System.out.println(s + x);
		x = Math.sqrt(4);
		s = new String("sqrt(4)=");
	}

	public String toString() {
		return s + x;
	}

	{
		x = 3;
		s = "sqrt(9)=";
	}
}

public class Class03 {

	public static void main(String[] args) {
//		D d1;
//		D d2 = new D();
//		d1 = d2;
//		D d3 = d1;
//
//		A4 a4 = new A4();
//		B4 b4 = new B4(3);
//		
		
		MyNumber1 l = new MyNumber1();
		System.out.println(l);
	}

}
