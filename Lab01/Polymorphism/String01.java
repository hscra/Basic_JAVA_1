package Polymorphism;

class N {
	int k = 3;
}

class M {
	int k = 9;

	public String toString() {
		return "M[[" + k + "]]";
	}
}

public class String01 {
//	public static String valueOf(Object obj) {
//		return (obj == null) ? "null" : obj.toString();
//	}
//
//	public void print(Object obj) {
//		write(String.valueOf(obj));
//	}
//
//	private void write(String valueOf) {
//
//	}

	public static void main(String[] args) {

//		System.out.println(new N());
//		System.out.println(new M());

//		String s = "1.5E7A";
//		String s = "-1.2345e2";

//		String s = "1.5E7";
//		double x = Double.valueOf(s).doubleValue();
//		System.out.println("x␣=␣" + x);
//
//		double x = 0.5;
//		String sx = String.valueOf(x);
//		System.out.println(sx);

		double x = 0.5;
		String sx = new Double(x).toString();
		System.out.println(sx);

//		var ref = new String("AB");
//		var copy = ref;
//		ref += "CD";
//		System.out.println(ref + "␣" + (ref == copy) + "␣" + copy);

		var ref = new StringBuilder("AB");
		var copy = ref;
		ref.append("CD");
		System.out.println(ref + "␣" + (ref == copy) + "␣" + copy);
//		String s1 = new String();
//		String s2 = new String("something␣else");
//		String s3 = new String(s2);
//
//		System.out.println("s1␣equals␣s2␣-->␣" + s1.equals(s2) + "\n" + "s2␣equals␣s3␣-->␣" + s2.equals(s3));
//
//		System.out.println((s1 == s2) + " " + (s2 == s3));

	}

}
