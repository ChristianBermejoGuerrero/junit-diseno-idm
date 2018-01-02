package boundedqueue;

import static org.junit.Assert.*;
import org.junit.*;

public class BoundedQueueTest {
	
	@Test 
	public void testC1()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue("foo");
	}

	@Test(expected=NullPointerException.class)
	public void testC2()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue(null);
	}
	
	@Test(expected=IllegalStateException.class)
	public void testC3()
	{
		BoundedQueue queue = new BoundedQueue(1);
		queue.enQueue("foo");
		queue.enQueue("bar");
	}
}
