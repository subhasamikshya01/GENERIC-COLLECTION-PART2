import java.util.HashSet;
public class Q9 {
	public static void findrn(int []a) {
		HashSet<Integer>h=new HashSet<>();
		HashSet<Integer>hr=new HashSet<>();
		for(int n:a) {
			if(!h.add(n)) {
				hr.add(n);
			}
		}
		System.out.println("Repeating integres are:- ");
		for(int n:hr) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		int[]a= {4,2,4,5,2,3,1,3};
		findrn(a);
	}

}
