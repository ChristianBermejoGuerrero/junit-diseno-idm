package union;

import static org.junit.Assert.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetGenericTest {

	/** Ten en cuenta los cambios que implica usar Set<E> en lugar de Set
	* respecto a la clase de los elementos que pueden almacenarse en a y b.
	* Piensa en particular en si pueden almacenarse elementos de diversas clases,
	* si pueden almacenarse tipos primitivos (Integer).
	*/
	
	private Set<Integer> a;
	private Set<Integer> b;
	
	@Before // Set up - Called before every test method
	public void setUp(){
		a = new HashSet<Integer>();
		b = new HashSet<Integer>();
	}

	@After // Tead down - Called after every test method
	public void tearDown(){
		a = null;
		b = null;
	}
	
	@Test
	public void testListWithNull() {
		a.add(null);
		b.add(1);
		
		Set c = new HashSet<Integer>();
		c.add(null);
		c.add(1);
		assertTrue("Set contiene null", c.equals(Union.unionSetGeneric(a, b)));
	}
	
}
