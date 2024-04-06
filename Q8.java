import java.util.HashMap;
public class Q8 {
	public static boolean areAnagrams(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		HashMap<Character,Integer>cfm=new HashMap<>();
		for(char c:s1.toCharArray()) {
			cfm.put(c, cfm.getOrDefault(c, 0)+1);
		}
		for(char c:s2.toCharArray()) {
			if(!cfm.containsKey(c)) {
				return false;
			}
			cfm.put(c, cfm.get(c)-1);
			if(cfm.get(c)==0) {
				cfm.remove(c);
			}
		}
		return cfm.isEmpty();
	}
	public static void main(String[] args) {
		String s1="listen";
		String s2="silent";
		if(areAnagrams(s1,s2)) {
			System.out.println("ANAGRAMS");
		}
		else {
			System.out.println("NOT ANAGRAMS");
		}
	}

}
