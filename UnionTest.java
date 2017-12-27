package union;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

import union.Union;

public class UnionTest
{
	private Vector a; //growable array of objects
	private Vector b;

	@Before // Set up - Called before every test method
	public void setUp(){
		a = new Vector();
		b = new Vector();
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
		
		Vector c = new Vector();
		c.add(null);
		c.add(1);
		assertTrue("Contiene null", c.equals(Union.union(a, b)));
	}
	
	@Test
	public void testJustOnceEachElement()
	{
		a.addElement(1);
		a.addElement(2);
		a.addElement(3);
		b.addElement(1);
		b.addElement(2);

		Vector c = new Vector();
		c.addElement(1);
		c.addElement(2);
		c.addElement(3);

		assertTrue("Mismo elemento en dos vectores distintos", c.equals(Union.union(a, b)));
	}
    
	@Test (expected = NullPointerException.class)
	public void testListNull() {
		a = null;
		b.addElement(null);
		Union.union(a, b);
	}
	
	@Test
	public void testDifferentTypes() {
		a.add(1);
		a.add(2);
		a.add('a');
		b.add('b');
		
        Vector c = new Vector();
		c.add(1);
		c.add(2);
		c.add('a');
		c.add('b');
		assertTrue("Distintos tipos de elementos en vectores", c.equals(Union.union(a, b)));
	}
	
	@Test
	public void testDoubleElement() {
		a.add(1);
		b.add(2);
		
	    Vector c = new Vector();
		c.add(1);
		c.add(2);
		assertTrue("Double Element Vector", c.equals(Union.union(a, b)));
	}
}
