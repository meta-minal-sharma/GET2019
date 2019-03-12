package question3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compounds {
	public static Map<Character,Integer> mass = new HashMap<Character,Integer>();
	/**
	 * add the element with the mass
	 */
	public void addValue( ) {
		mass.put('C',12);
		mass.put('H', 1);
		mass.put('O',16);
	}
	/**
	 * calculate the mass of the compounds
	 * @param compound
	 * @return
	 */
	public int calculateMass(String compound) {
		int result=0;
		addValue();
		Map<Character,Integer> count=characterCount(compound);
		for(char s : count.keySet()) {
			result=result+(count.get(s)*mass.get(s));
		}     
		return result;
	}
	/**
	 * calculate the count of each character
	 * @param inputString
	 * @return map
	 */
	public HashMap<Character, Integer> characterCount(String inputString) { 
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
		char[] strArray = inputString.toCharArray(); 


		for (char c : strArray) { 
			if (charCountMap.containsKey(c)) { 
				charCountMap.put(c, charCountMap.get(c) + 1); 
			} 
			else { 
				charCountMap.put(c, 1); 
			} 
		}
		return charCountMap;
	} 
}
