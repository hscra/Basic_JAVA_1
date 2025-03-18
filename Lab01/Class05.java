class P {
	int k;

	P(int k) {
		this.k = k;
	}

	P() {
		// System.out.println(); /* <-- ERROR */
		this(-1);
	}

	P printPlus() {
		k++;
		System.out.print("[k=" + k + "]␣");
		return this;
	}

//	void set(int n) {
//		this(n); // ERROR !!! <---line 5
//	}
}

class N {
	int n;

	N(int t) {
		n = t;
	}
}

class M {
	final int NR;

	M(int i) {
		NR = i;
	}
}

class O {
	final int n;

	O(int x) {
		n = x;
	}

	O() {
		this(3);
	}
}

public class Class05 {

	public static void main(String[] args) {
//		P p = new P();
//		p.printPlus().printPlus().printPlus();
//
//		P p1 = new P();
//		System.out.println(p1.k);

//		final N f = new N(1);
//		N g = new N(9);
//		System.out.println("f=" + f.n + "␣g=" + g.n);
//		f.n = 8;
//		System.out.println("f=" + f.n + "␣g=" + g.n);
//		// f = g; /* ERROR */
//		g = f;
//		g.n = 7;
//		System.out.println("f=" + f.n + "␣g=" + g.n);

//		M m = new M(777);

//		System.out.println(m.NR);
		// m.NR = 3; /* ERROR */

		O a1 = new O(7);
		O a2 = new O();
		System.out.println(a1.n);
		System.out.println(a2.n);
	}

}
