package data_structures_in_Java.Hashmaps;

import java.util.HashMap;

public class UniqueCharacters {
	public static String uniqueChar(String str){
		HashMap<Character,Integer> map = new HashMap<>();
		String unistr ="";
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				unistr =unistr+c;
				map.put(c, 1);
			}
		}
		return unistr;
	}

}
