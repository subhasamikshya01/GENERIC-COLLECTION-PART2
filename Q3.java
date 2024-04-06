import java.util.ArrayList;
import java.util.Collections;
class Car implements Comparable<Car>{
	private static final String Modalno = null;
	private int ModalNo,stock;
	private String name;
	@Override
	public int compareTo(Car o) {
		return Integer.compare(this.stock, o.stock);
	}
	public Car(int modalNo, int stock, String name) {
		super();
		ModalNo = modalNo;
		this.stock = stock;
		this.name = name;
	}
	public int getModalNo() {
		return ModalNo;
	}
	public void setModalNo(int modalNo) {
		ModalNo = modalNo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString(){
		return ModalNo+" "+name+" "+stock;
	}
}
public class Q3 {

	public static void main(String[] args) {
		ArrayList<Car>c=new ArrayList<>();
		c.add(new Car(2018,20,"kia"));
		c.add(new Car(2013,10,"creta"));
		c.add(new Car(2017,45,"audi"));
		c.add(new Car(2015,55,"bmw"));
		c.add(new Car(2020,13,"mg"));
		Collections.sort(c);
		System.out.println("Sorted car objects:- ");
		for(Car i:c) {
			System.out.println(i);
		}
	}

}
