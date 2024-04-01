package aug07;
//Custom Excepton
public class Example {
public static void main(String[] args) {
	try {
		System.out.println("HELOO THIS IS EXECPTION");
		throw new CustomException();
	}
	catch (CustomException e) {
		e.demo();
	}
}
}
