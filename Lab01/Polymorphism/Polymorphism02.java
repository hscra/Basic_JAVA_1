package Polymorphism;

class Tools {
	static void log(String s) {
		System.out.println(s);
	}
}

class Connection {
	Connection() {
		Tools.log("Connection␣OPEN");
	}

	void close() {
		Tools.log("Connection␣CLOSE");
	}
}

class Database {
	Database() {
		Tools.log("Database␣OPEN");
	}

	void close() {
		Tools.log("Database␣CLOSE");
	}
}

class ConnectionSSH extends Connection {
	ConnectionSSH() {
		Tools.log("ConnectionSSH␣OPEN");
	}

	Database t = new Database();

	void close() {
		Tools.log("ConnectionSSH␣CLOSE");
		t.close();
		super.close();
	}
}

public class Polymorphism02 {

	public static void main(String[] args) {
		System.out.println("1)␣Creating␣objects...");
		ConnectionSSH p = new ConnectionSSH();
		System.out.println("2)␣Closing␣connections...");
		p.close();
	}

}
