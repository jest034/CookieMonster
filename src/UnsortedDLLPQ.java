public class UnsortedDLLPQ<E extends Comparable<E>> implements MyPriorityQueue<E> {
	
	private ListNode2 queueHead;
	private int objectCount;
	
	public UnsortedDLLPQ()
	{
		queueHead = null;
		objectCount = 0;
	}
	
	public void add(E obj)
	{
		
	}
	
	public E removeMin()
	{
		
	}
	
	public E peek()
	{
		
	}
	
	public boolean isEmpty()
	{
		
	}
	
	public int size()
	{
		
	}
	
	public String toString()
	{
		StringBuffer stringbuf = new StringBuffer ("[ ");
		for (ListNode2 node = queueHead; node != null; node = node.getNext()) 
		{
			stringbuf.append(node.getValue()+" ");

		}
		stringbuf.append("]");
		return stringbuf.toString();
	}
}