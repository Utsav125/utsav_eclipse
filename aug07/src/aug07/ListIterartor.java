package aug07;
//List Iterator in java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class Product{
	private int id;
	private String pName;
	private float pPrice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String pName, float pPrice) {
		super();
		this.id = id;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getpPrice() {
		return pPrice;
	}
	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", pPrice=" + pPrice + "]";
	}
	
}
public class ListIterartor {

	public static void main(String[] args) {
		 List<Product> l1=new ArrayList<Product>();
		 Product p1=new Product();
		 p1.setId(101);
		 p1.setpName("KADAR");
		 p1.setpPrice(12000);
		 Product p2=new Product(121,"Vinit", 6000);
		 l1.add(p1);
		 l1.add(p2);
		Iterator<Product> itr=l1.listIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}

	}

}
