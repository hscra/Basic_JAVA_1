class MyException extends Exception {
}

class DivByZeroException extends ArithmeticException {
	private double y;

	public DivByZeroException(double y) {
		this.y = y;
	}

	public double y() {
		return y;
	}
}

class ZeroByZeroException extends ArithmeticException {
}

class Mat {
	static final double EPSILON = 1e-12;

	static double divExc(double x, double y) {
		if (Math.abs(y) < EPSILON)
			throw new DivByZeroException(y);
		return x / y;
	}

	static double div(double x, double y) {
		return x / y;
	}

//	static double divExc(double x, double y) {
//		if (Math.abs(y) < EPSILON) {
//			if (Math.abs(x) < EPSILON)
//				throw new ZeroByZeroException();
//			else
//				throw new DivByZeroException();
//		}
//		return x / y;
//	}

//	static double div(double x, double y) {
//		return x / y;
//	}

//	static double divExc(double x, double y) {
//		if (Math.abs(y) < EPSILON)
//			throw new ArithmeticException();
//		return x / y;
//		if (Math.abs(y) < EPSILON)
//			throw new ArithmeticException("division␣by␣zero");
//		return x / y;
}

public class Exception01 {
	static void f5() throws Exception {
		try {
			throw new MyException();
		} catch (final Exception e) {
//			e = new Exception(); // ERROR: e is final
			throw e;
		}
	}

	static void f4() throws Exception {
		try {
			throw new MyException();
		} catch (Exception e) {
			e = new Exception(); // now it’s OK
			throw e;
		}
	}

	static void f3() throws MyException {
		try {
			throw new MyException();
		} catch (Exception e) {
			throw e;
		}
	}

//	static void f2() throws MyException {
//		try {
//			throw new MyException();
//		} catch (Exception e) {
//			e = new Exception(); // ERROR: unreported exception Exception
//			throw e;
//		}
//	}
//	static void f1() throws MyException {
//		Exception e = new MyException();
//		 throw e; // ERROR: unreported exception Exception
//	}

	static void f() throws MyException {
		try {
			System.out.println("throwing␣MyException...␣");
			throw new MyException();
		} catch (Exception e) {
			System.out.println("[f()]␣throwing␣Exception...␣");
			throw e;
		}
//		throw new Exception();
	}

	static void h() {
		try {
			f();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		try {
//			f();
//			f3();
			f4();
		} catch (MyException e) {
			System.out.print("catch-1␣" + e);
		} catch (Exception e) {
			System.out.print("catch-2␣" + e);
		}

//		{
//			h();
//		}
//		

//		try {
//			double w = Mat.divExc(2.0, 1.0e-13);
//		} catch (DivByZeroException e) {
//			System.err.print("ERROR:␣division␣by␣zero␣");
//			System.err.println("(" + e.y() + ")");
//			e.printStackTrace();
//		}

//		for (int k = 0; k < 2; k++) {
//			try {
//				double w = Mat.divExc(k, 0);
//			} catch (DivByZeroException e) {
//				System.err.println("ERROR:␣division␣by␣zero");
//			} catch (ZeroByZeroException e) {
//				System.err.println("ERROR:␣0/0");
//			}
//		}

//		try {
//			int m = 1 / 0;
//			System.out.print("continued␣here?␣");
//		} catch (ArithmeticException e) {
//			System.err.print("error...␣");
//		}
//		System.out.println("the␣rest␣of␣code");

//		System.out.println("3)␣1/0=␣" + 1 / 0);
//		System.out.print("1)␣Mat.div(0,0)=␣");
//		System.out.println(Mat.div(0, 0));
//		System.out.println("2)␣Mat.divExc(0,0)=␣");
//		System.out.println(Mat.divExc(0, 0));
//		System.out.println("3)␣1/0=␣" + 1 / 0);
	}

}
