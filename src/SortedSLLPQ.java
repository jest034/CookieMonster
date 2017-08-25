
public class SortedSLLPQ<E extends Comparable<E>> implements MyPriorityQueue<E> 
{

	private ListNode queueHead;
	private int objectCount;

	public SortedSLLPQ()
	{
		queueHead = null;
		objectCount = 0;
	}

	public void add(E obj)
	{
		if (queueHead==null)
		{
			queueHead= new ListNode(obj);
			objectCount++;
		}
		else if(((Comparable)(queueHead.getValue())).compareTo(obj)>0)
		{
			ListNode temp= new ListNode (obj,queueHead);
			queueHead=temp;
			objectCount++;
		}
		else
		{
			for (ListNode list = queueHead; list!=null; list=list.getNext())
			{
				if (list.getNext()==null)
				{
		    		list.setNext(new ListNode (obj));
					objectCount++;
					break;
				}
				else if (((Comparable)(list.getNext().getValue())).compareTo(obj)>0)
				{
						list.setNext(new ListNode (obj, list.getNext()));
						objectCount++;
						break;
				}
			}
		}
	}




	public E removeMin()
	{
		ListNode temp= queueHead;
		queueHead=queueHead.getNext();
		return ((E)temp.getValue());
	}

	public E peek()
	{
		return (E)queueHead;
	}

	public boolean isEmpty()
	{
		return (queueHead==null);
	}

	public int size()
	{
		if (isEmpty())
		{
			return 0;
		}
		else
		{
			int count=0;
			for (ListNode list = queueHead; list!=null; list=list.getNext())
			{
				count++;
			}
			return count;
		}
	}

	public String toString()
	{
		StringBuffer stringbuf = new StringBuffer ("[ ");
		for (ListNode node = queueHead; node != null; node = node.getNext()) 
		{
			stringbuf.append(node.getValue()+" ");
		}
		stringbuf.append("]");
		return stringbuf.toString();
	}
}