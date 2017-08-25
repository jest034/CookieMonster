import java.util.ArrayList;

public class ArrayListPQ<E extends Comparable<E>> implements MyPriorityQueue<E> {

	private ArrayList<E> queue;
	
	public ArrayListPQ()
	{
		queue = new ArrayList<E>();
	}
	
	public void add(E obj)
	{
		queue.add(obj);
		  
	}
	
	public E removeMin()
	{
		E mine=queue.get(0);
		for (int x= 0; x<queue.size();x++)
		{
			if (queue.get(x).compareTo(mine)<0)
			{
				mine=queue.get(x);
			}
		}
		queue.remove(mine);
		return mine;
	}
	
	public E peek()
	{
		E mine=queue.get(0);
		for (int x= 0; x<queue.size();x++)
		{
			if (queue.get(x).compareTo(mine)>0)
			{
				mine=queue.get(x);
			}
		}
		return mine;

	}
	
	public boolean isEmpty()
	{
		return (queue.isEmpty());
	}
	
	public int size()
	{
		return queue.size();
	}
	
	public String toString()
	{
		StringBuffer stringbuf = new StringBuffer ("[ ");	
		for (int i = 0; i < queue.size(); i++)
		{
			stringbuf.append(queue.get(i)+" ");
		}
		stringbuf.append("]");
		return stringbuf.toString();
	}

}
