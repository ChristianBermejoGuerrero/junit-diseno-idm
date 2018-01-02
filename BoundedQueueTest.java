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
	
	@Test 
	public void testC4()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue("foo");
		queue.enQueue("bar");
		queue.deQueue();
	}
	
	@Test(expected=IllegalStateException.class)
	public void testC5()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.deQueue();
	}
	
	@Test()
	public void testC6()
	{
		BoundedQueue queue = new BoundedQueue(1);
		assertTrue(queue.isEmpty());
	}
	
	@Test()
	public void testC7()
	{
		BoundedQueue queue = new BoundedQueue(2);
		queue.enQueue("foo");
		queue.enQueue("bar");
		assertTrue(queue.isFull());
	}
}
