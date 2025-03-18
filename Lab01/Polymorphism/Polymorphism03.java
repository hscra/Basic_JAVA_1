package Polymorphism;

abstract class Data {
	abstract void write();

	Data() {
		System.out.println("Data()␣BEGIN");
		write(); // !!!

		System.out.println("Data()␣END");
	}
}

class Number extends Data {
	int k = 1;

	Number(int i) {
		System.out.println("Number(int)␣BEGIN");
		k = i;
		write();
		System.out.println("Number(int)␣END");
	}

	void write() {
		System.out.println("k=" + k);
	}
}

public class Polymorphism03 {

	public static void main(String[] args) {
		Data d1 = new Number(9);
	}

}
