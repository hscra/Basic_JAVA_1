package Polymorphism;

//class Tools {
//	static int n;
//
//	static int init(String s) {
//		System.out.println((++n) + ")␣" + s);
//		return n;
//	}
//
//	static void print(int k, int m) {
//		System.out.println("k=" + k + "␣m=" + m);
//	}
//}

class A {
	A() {
		Tools.init("A()");
	}

	{
		k = Tools.init("A␣{␣}");
	}
	int k = Tools.init("A.k");
}

class B extends A {
	B() {
		Tools.init("B()");
		Tools.print(k, m);
	}

	int m = Tools.init("B.m");
	{
		m = Tools.init("B␣{␣}");
	}
}

public class Polymorphism01 {

	public static void main(String[] args) {
		B b = new B();
	}

}
