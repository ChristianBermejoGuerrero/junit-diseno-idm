package union;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

import union.Union;

public class UnionTest
{
	private Vector a;
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
}