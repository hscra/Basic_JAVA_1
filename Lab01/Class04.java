import java.util.*;

class MyCharacter implements Cloneable {
	char z = 'A';

	public MyCharacter clone() throws CloneNotSupportedException {
		return (MyCharacter) super.clone();
	}
}

class MyNotice implements Cloneable {
	public MyCharacter z1 = new MyCharacter();
	public MyCharacter z2 = new MyCharacter();

	public String toString() {
		return "[" + z1.z + z2.z + "]";
	}

	public MyNotice clone() throws CloneNotSupportedException {
		return (MyNotice) super.clone();
	}
}

public class Class04 {

	public static void main(String[] args) throws CloneNotSupportedException {
//		MyCharacter z1 = new MyCharacter();
//		z1.z = 'B';
//		MyCharacter z2 = z1.clone();
//		System.out.println("z1:␣" + z1.z + "␣,␣␣␣z2:␣" + z2.z);
//		System.out.println("==␣␣-->␣" + (z1 == z2));
//		System.out.println("equals␣-->␣" + z1.equals(z2));
//		
//		
//		
		MyNotice n = new MyNotice();
		n.z1.z = 'a'; 
		n.z2.z = 'b';
		MyNotice m = n.clone();
		System.out.println(n + "␣,␣" + m);
		m.z1.z = 'Z';
		System.out.println(n + "␣,␣" + m);
		
	}

}