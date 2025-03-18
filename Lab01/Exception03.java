class EA extends Exception {
}

class EB extends Exception {
}

class EC extends Exception {
}

public class Exception03 {
	static void f(int k) throws EA, EB, EC {
		if (k == 0)
			throw new EA();
		else if (k == 1)
			throw new EB();
		else if (k == 2)
			throw new EC();
	}

	public static void log(String s) {
		System.out.println(s);
	}

	public static void f() throws Exception {
		Double d = null;
		try {
			double x = d.doubleValue();
		} catch (Exception e) {
			log("throwing␣exception:␣" + e);
			throw e;
		} finally {
			log("[finally␣BEGIN]");
			int k = 2 / 0;
			log("[END]");
		}
	}

	public static void main(String[] args) {

		try {
			f();
		} catch (Exception e) {
			log("handling␣exception:␣" + e);
		}
		
		
		
		
		
		try {
			f(new java.util.Random().nextInt(3));
		} catch (EA e) {
			System.out.println("log:␣" + e);
		} catch (EB e) {
			System.out.println("log:␣" + e);
		} catch (EC e) {
			System.out.println("log:␣" + e);
		}

		try {
			f(new java.util.Random().nextInt(3));
		} catch (Exception e) {
			System.out.println("log:␣" + e);
		}

		try {
			f(new java.util.Random().nextInt(3));
		} catch (EA | EB | EC e) {
			System.out.println("log:␣" + e);
		}

		try {
			throw new NullPointerException("SOME␣ERROR");
		} catch (NullPointerException e) {
			System.err.println("NullPointer");
		} finally {
			System.err.println("finally...");
		}
		System.err.println("continued...");

//		try {
//			throw new ArithmeticException("SOME␣ERROR");
//		} catch (NullPointerException e) {
//			System.err.println("NullPointer");
//		} finally {
//			System.err.println("finally...");
//		}
//		System.err.println("continued...");

		try {
			// throw new ArithmeticException("SOME ERROR");
		} catch (NullPointerException e) {
			System.err.println("NullPointer");
		} finally {
			System.err.println("finally...");
		}
		System.err.println("continued...");

		Double d = null;

//		try {
//			System.out.println(d.doubleValue());
//		} finally {
//			System.err.println("finally...");
//		}
//		System.err.println("continued...");

		try {
			throw new ArithmeticException("SOME␣ERROR");
		} finally {
			System.err.println("finally...");
		}
//		System.out.println("continued...");
	}

}
