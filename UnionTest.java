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
}