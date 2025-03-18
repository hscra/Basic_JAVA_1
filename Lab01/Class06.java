class MyCharacter1 {
	public MyCharacter1(char z) {
		this.z = z;
	}

	public char getZ() {
		return z;
	}

	public void setZ(char z) {
		this.z = z;
	}

	private char z;
}

class Symbol {
	private final int number;
	private final MyCharacter1 letter;

	public Symbol(MyCharacter1 letter, int number) {
//		this.letter = letter;
//		this.number = number;

		this.letter = new MyCharacter1(letter.getZ());
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

//	public MyCharacter1 getLetter() {
//		return letter;
//	}

	public MyCharacter1 getLetter() {
		return new MyCharacter1(letter.getZ());
	}

	public String toString() {
		return "" + letter.getZ() + number;
	}
}

class Class06 {
	public static void main(String[] args) {
//		MyCharacter1 c = new MyCharacter1('A');
//		Symbol a = new Symbol(c, 4);
//		System.out.print("␣1)␣" + a);
//
//		MyCharacter1 d = a.getLetter();
//		int m = a.getNumber();
//		d.setZ('X');
//		m = 0;
//		System.out.println("␣␣2)␣" + a);
//		MyCharacter1 c = new MyCharacter1('A');
//		Symbol a = new Symbol(c, 4);
//		System.out.print("␣1)␣" + a);
//
//		MyCharacter1 d = a.getLetter();
//		int m = a.getNumber();
//		d.setZ('X');
//		m = 0;
//		System.out.print("␣␣2)␣" + a);
//		c.setZ('X');
//		m = 7;
//		System.out.println("␣␣3)␣" + a);
		
		MyCharacter1 c = new MyCharacter1('A');
		Symbol a = new Symbol(c,4);
		System.out.print("␣1)␣" + a);
		
		MyCharacter1 d = a.getLetter();
		int m = a.getNumber();
		d.setZ('X');
		m = 0;
		System.out.print("␣␣2)␣" + a);
		
		c.setZ('X');
		m = 7;
		System.out.println("␣␣3)␣" + a);
	}
}