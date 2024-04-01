package aug07;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


class Employee{
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return  " "+id+"    "+name;
	}
}
public class Test {
		public static void main(String[] args) {
			ArrayList<Employee> a1=new ArrayList<Employee>();
			Employee e1=new Employee();
			e1.setId(120);
			e1.setName("Utsav");
			a1.add(e1);
			
			Employee e2=new Employee();
			e2.setId(101);
			e2.setName("Vijay");
			a1.add(e2);
			System.out.println("Using List Iterator : ->");
			ListIterator itr=a1.listIterator(); // Universal Cursor.
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the name which you want to change ->");
			String s1 = sc.nextLine();
			System.out.println("Enter the new Name instead of "+s1);
			String s2=sc.nextLine();
			while(itr.hasNext()) {
				Employee e=(Employee)itr.next();
				String s = e.getName();
				if(s1.equals(s)) {
					e.setName(s2);
				}
			}
			System.out.println("In reverse order->");
			while(itr.hasPrevious()) {
				System.out.println(itr.previous());
			}
			
		} 
}





/*
 
 /*  Cursors in Java
 1) Enumeration  - >   Legacy Classes.  jo classes 1.o versions se li gai he. It moves only in forward direction.
 2) Iterator     - >   Universal.
 3) ListIterator - >   Only on List Object.  It contains 9 methods. it moves forward and also in backward direction
*/