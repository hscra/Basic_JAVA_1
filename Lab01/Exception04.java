class XException extends Exception {
}

class YException extends Exception {
}

class MyException extends Exception {
//	MyException(String message, Throwable cause) {
//		super(message, cause);
//	}
}

class A {
	A() throws XException {
		System.out.println("A()");
		throw new XException();
	}

	void f() throws Exception {
	}

	void g() throws XException {
	}
}

class B extends A {
	B() throws XException, YException {
		System.out.println("B()");
		throw new YException();
	}

	void f() throws YException {
	}
	// void g() throws YException { } /* ERROR */
}

public class Exception04 {
//	static void f() throws MyException {
//		Exception e = new NullPointerException();
//		throw new MyException("chain", e);
//	}

	static void f() throws MyException {
		NullPointerException cause = new NullPointerException();
//		throw (MyException) new MyException().initCause(cause);
		throw (MyException) new MyException().initCause(cause);
	}

	public static void main(String[] args) {
//		try {
//			B b = new B();
//		} catch (XException | YException e) {
//			e.printStackTrace();
//		}

//		B c = new B();

		try {
			f();
		} catch (MyException e) {
			System.out.println("Exception:␣" + e);
			System.out.println("Cause:␣" + e.getCause());
		}
	}

}
