class A1 {
	int i;
	String s;
//	int n = -1;
	int n;
	{
		for (int i = 1; i <= 10; i++) {
			n = n + i;
		}
	}
}

class MyNumber {
	int x = 5;

	void setX(MyNumber c) {
		x = c.x;
	}
}

class Tools {
	void print(MyNumber obj) {
		System.out.print("x=" + obj.x + ",␣");
		obj.x = 0;
	}

	void swap(MyNumber a, MyNumber b) { // in our class Tools
		MyNumber t = a;
		a = b;
		b = t;
	}

	void swapReally(MyNumber a, MyNumber b) {
		MyNumber t = new MyNumber();
		t.setX(a);
		a.setX(b);
		b.setX(t);
	}

	static void print(double x) {
		System.out.println("x=" + x);
	}
}

class A2 {
	static double n;
	static {
		System.out.print("A␣static{}");
	}
//	{
//		System.out.println("init␣[B]");
//		n = Math.sqrt(3);
//	}
//	static {
//		System.out.println("init␣[A]");
//		n = Math.sqrt(2);
//	}
}

class B2 {
	static double n;
	double p;
	static {
		System.out.print("␣B␣static{}␣");
		/* p=7;ERROR! */}
	{
		System.out.print("B{}␣");
	}
//	static double n;
//	{
//		System.out.println("init␣[B]");
//		n = Math.sqrt(3);
//	}
}

class C {
	static double n = initN();

	static double initN() {
		return Math.sqrt(2);
	}
}

public class Class01 {
	public static void main(String[] args) {
//		MyNumber w = new MyNumber();
//		w.x = -1;
//		MyNumber v = new MyNumber();
//		v.x = 2;
//		System.out.println(w.x + "␣" + v.x);
//		new Tools().swap(v, w);
//		System.out.println(w.x + "␣" + v.x);
//
//		w.x = -1;
//		v.x = 2;
//		System.out.println(w.x + "␣" + v.x);
//		new Tools().swapReally(v, w);
//		System.out.println(w.x + "␣" + v.x);
//
//		Tools.print(2.3);

//		System.out.println("A.n=" + A2.n);
//		new A2();
//		new A2();
//		new A2();
//		System.out.println("A.n=" + A2.n);
		/**
		 * init␣[A] A.n=1.4142135623730951 A.n=1.4142135623730951
		 */
//
//		System.out.println("B.n=" + B2.n);
//		new B2();
//		new B2();
//		new B2();
//		System.out.println("B.n=" + B2.n);

		/**
		 * B.n=0.0 init␣[B] init␣[B] init␣[B] B.n=1.7320508075688772
		 * 
		 */

//		A1 a = new A1();
//		a.i = 5;
//		a.s = "this␣is␣A";
//		System.out.println(a.s + ",␣a.i␣=␣" + a.n);
//		System.out.println("a.n=" + new A1().n);

		System.out.print("␣1)A.n=" + A2.n);
		System.out.print("␣2)B.n=" + B2.n);
		System.out.print("␣3)");
		new A2();
		new A2();
		System.out.print("␣4)");
		new B2();
		new B2();
		
		System.out.println("\nC.n=" + C.n);
	}
}
