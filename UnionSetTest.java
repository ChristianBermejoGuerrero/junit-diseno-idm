package union;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UnionSetTest {

	private Set a;
	private Set b;
	
	@Before // Set up - Called before every test method
	public void setUp(){
		a = new HashSet();
		b = new HashSet();
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
		
		Set c = new HashSet();
		c.add(null);
		c.add(1);
		assertTrue("Set contiene null", c.equals(Union.unionSet(a, b)));
	}
	
    @Test
    public void testJustOnceEachElement()
    {
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(1);
        b.add(2);

        Set c = new HashSet();
        c.add(1);
        c.add(2);
        c.add(3);

        assertTrue("Mismo elemento en dos vectores distintos", c.equals(Union.unionSet(a, b)));
    }
	
}
