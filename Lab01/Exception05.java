import java.io.BufferedReader;

class MyResource implements AutoCloseable {
	public void work() throws Exception {
		System.err.print("doing␣work...␣");
		throw new Exception("Exception␣in␣work()");
	}

	public void close() throws Exception {
		System.err.print("closing...␣");
		throw new Exception("Exception␣in␣close()");
	}
}

public class Exception05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BufferedReader in = new BufferedReader("oop_set.pdf");
//		try {
//			s = in.readLine();
//		} finally {
//			in.close();
//		}
//
//		try (BufferedReader in2 = new BufferedReader(/* ... */)) {
//			s2 = in.readLine();
//		}
		try (MyResource r = new MyResource()) {
			r.work();
		} catch (Exception e) {
			System.err.print("[e=" + e + "]");
		}
		System.out.println("␣THE␣END␣");

		try (MyResource r = new MyResource()) {
			r.work();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("␣THE␣END␣");

		MyResource r = new MyResource();
		try {
			r.work();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("␣THE␣END␣");

		try (MyResource r2 = new MyResource()) {
			r2.work();
		} catch (Exception e) {
			System.err.println("[e=" + e + "]");
			Throwable[] tab = e.getSuppressed();
			for (int i = 0; i < tab.length; ++i) {
				System.out.print("[suppressed␣#" + (i + 1) + "]␣");
				tab[i].printStackTrace();
			}
		}
		System.out.println("␣THE␣END␣");
	}
}
