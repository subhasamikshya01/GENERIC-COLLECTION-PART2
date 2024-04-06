import java.util.HashMap;
public class q11 {

	public static void main(String[] args) {
		int []a= {1,2,4,5,6,8,9,10};
		HashMap<Integer,Integer>h=new HashMap<>();
		for(int n:a) {
			h.put(n, 1);
		}
		System.out.println("Smallest +ve missing no.:- ");
		for(int i=1;i<=10;i++) {
			if(h.containsKey(i)==false) {
				System.out.println(i);
				break;
			}
		}
	}

}
