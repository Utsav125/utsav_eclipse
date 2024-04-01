package aug07;
import java.awt.image.AbstractMultiResolutionImage;
import java.util.Scanner;
class Marriage extends RuntimeException {
	 Marriage(String s){
		 super(s);
	 }
}
public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For boys only.Enter the age--- >");
		int age=sc.nextInt();
		if(age <=21) {
			throw new Marriage("You are too young to get married");
		}
		else if(age > 50) {
			throw new Marriage("We will send you directly to the God.Its our");
		}
		else {
			throw new Marriage("Sabar kar mil jaegi");
		}
	}
}
