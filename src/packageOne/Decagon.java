package packageOne;

import java.net.SocketException;

import packageFour.Person;

public class Decagon {
	public static void main(String[] args) {
		Object s = new Person("hhhh", 'k');
		System.out.println(String.valueOf(s));

	}

	public static void method() throws Exception {
		throw new SocketException();
	}

}
