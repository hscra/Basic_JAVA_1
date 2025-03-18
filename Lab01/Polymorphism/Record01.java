package Polymorphism;

record Person(String name, int age) {
	
//	public Person(String name, int age) {
		public Person {
		if (age < 0) {
			throw new java.lang.IllegalArgumentException(String.format("Invalid␣age:␣%d", age));
		}
//		this.age = age;
//		this.name = name;
	}
}

public class Record01 {

	public static void main(String[] args) {
		Person p = new Person("Roy␣Batty", 3);
		System.out.println("p␣=␣" + p);
		System.out.println("p.name()␣=␣" + p.name());
		System.out.println("p.age()␣=␣" + p.age());
		System.out.println("p.hashCode()␣=␣" + p.hashCode());
		Person q = new Person("Roy␣Batty", 3);
		System.out.println("p.equals(q)␣=␣" + p.equals(q));
		Person r = new Person("Rick␣Deckard", 40);
		System.out.println("p.equals(r)␣=␣" + p.equals(r));
		
		
		Person p1 = new Person("Roy␣Batty", 3);
		System.out.println("p␣=␣" + p1);
		Person r1 = new Person("Rachael␣Tyrell", -1);
//		Person r1 = new Person("Rachael␣Tyrell", -1);
	}

}
