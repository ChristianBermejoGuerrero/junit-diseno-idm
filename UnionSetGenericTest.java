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
	
	@Test
    public void testJustOnceEachElement()
    {
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(1);
        b.add(2);

        Set c = new HashSet<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);

        assertTrue("Mismo elemento en dos sets distintos", c.equals(Union.unionSetGeneric(a, b)));
    }
    
	@Test (expected = NullPointerException.class)
	public void testListNull() {
		a = null;
		b.add(null);
		Union.unionSetGeneric(a, b);
	}
		
	@Test
	public void testDoubleElement() {
		a.add(1);
		b.add(2);
		
	    Set c = new HashSet<Integer>();
		c.add(1);
		c.add(2);
		assertTrue("Double Element Vector", c.equals(Union.unionSetGeneric(a, b)));
	}
	
	
}
