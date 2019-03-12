package question2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountCharacter {

	public static final Map<String,Integer> listOfString = new HashMap<String,Integer>();
	/**
	 * count the character which is not present in the list
	 * @param name
	 * @return count of character
	 */
	public int countUniqueCharactar(String name) {
		Set<Character> uniqueChar = new HashSet<Character>();
		for(int i = 0;i<name.length();i++) {
			if(uniqueChar.contains(name.charAt(i)))
				uniqueChar.remove(name.charAt(i));
			else
				uniqueChar.add(name.charAt(i));      
		}
		listOfString.put(name, uniqueChar.size());
		return uniqueChar.size();

	}
	/**
	 * count the character on the basis of pre information stored in map
	 * @param u
	 * @return
	 */

	public int countChar(String u) {
		int result = 0;
		String name = u;
		if(listOfString.get(name) != null) {
			return listOfString.get(name); }
		else {
			for(String value1 : listOfString.keySet()) {
				CharSequence value=value1;
				if(name.contains(value)) {
					result=result+listOfString.get(value1);
					name=name.replace(value1,"");
				}
			}
		}
		return result+countUniqueCharactar(name);

	}
}
