package union;

import java.util.*;
import java.lang.NullPointerException;

public class Union {
	
	
	/**
	 * @return	New object (different from a and b) of class Vector that
	 *			contains the union set (NO elements can be repeated) of a and b
	 * @param	a Vector containing elements, including null. It is not a set,
	 *			so it can have repeated elements, and they can be of different
	 *			classes / types
	 * @param	b Vector containing elements, including null. It is not a set,
	 *			so it can have repeated elements, and they can be of different
	 *			classes / types
	 * @throws	NullPointerException If a or b is null
	 */
	
	public static Vector union (Vector a, Vector b){
		if (a == null || b == null) {
			throw new NullPointerException();
		}
		Vector v1 = new Vector();
		
		for(Object e : a) {
			if (!v1.contains(e)){
				v1.add(e);
			}
		}
		for(Object e : b) {
			if (!v1.contains(e)){
				v1.add(e);
			}
		}
		return v1;
	}
	
	// UNIONSET
	
	public static Set unionSet (Set a, Set b) {
		if (a == null || b == null) {
			throw new NullPointerException();
		}
		Set s1 = new HashSet();
		for(Object e : a) {
			s1.add(e);
		}
		for(Object e : b) {
			s1.add(e);
		}
		return s1;
	}
}