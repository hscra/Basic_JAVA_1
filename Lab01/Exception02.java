class AException extends Exception {
}

class BException extends AException {
}

public class Exception02 {

	public static void main(String[] args) {
		try {
			throw new ArithmeticException("Illegal␣operation...");
		} catch (Exception e) {
			System.err.println(e);
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

//		try {
//			throw new BException();
//		} catch (AException e) {
//			System.out.println("(AException␣e),␣e␣=␣" + e);
//		} catch (Exception e) {
//			System.out.println("(Exception␣e),␣e␣=␣" + e);
//		}

//		try {
//			throw new BException();
//		} catch (AException e) {
//			System.out.println("AException,␣e=␣" + e);
//		} catch (BException e) {
//			System.out.println("BException,␣e=␣" + e);
//		}
	}

}
