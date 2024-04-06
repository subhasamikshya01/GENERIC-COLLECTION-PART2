import java.util.Hashtable;
import java.util.Scanner;
public class q10 {

	public static void main(String[] args) {
		Hashtable<String,Integer>h=new Hashtable<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence/paragraph:- ");
		String s=sc.next();
		String[]w=s.split("\\s+");
		for(String k:w) {
			if(h.containsKey(k)){
				h.put(k, h.get(k)+1);
			}
			else {
				h.put(k,1);
			}
		}
		int mf=0;
		for(int k:h.values()) {
			if(k>mf) {
				mf=k;
			}
		}
		
	}

}
