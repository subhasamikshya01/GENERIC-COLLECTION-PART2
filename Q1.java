package Q1;
class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public String toString() {
		return "key:- "+key+" value:- "+value;
	}
}
public class Q1 {

	public static void main(String[] args) {
		Pair<Integer,Integer> p1=new Pair<Integer,Integer>(2,3);
		Pair<Double,Double>p2=new Pair<Double,Double>(2.5,3.2);
		Pair<Double,Integer>p3=new Pair<Double,Integer>(2.5,5);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
