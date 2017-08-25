
public class HeapPQ<E extends Comparable<E>> implements MyPriorityQueue<E> {

	private E[] heap;
	private int objectCount;
	
	public HeapPQ()
    {
        this.heap = (E[])new Comparable[3];
        this.objectCount = 0;
    }

	//Adds obj to the Priority Queue
	public void add(E obj)
	{
		if (objectCount+1>=heap.length)
			increaseCapacity();
		heap[objectCount+1]=obj;
		if (isEmpty())
		{
		}
		else
		{
			bubbleUp(objectCount+1);
		}
		objectCount++;
		
	}
	
	//Removes and returns the MINIMUM element from the Priority Queue
	public E removeMin()
	{
		E temp = heap[1];
		swap(1, objectCount);
		heap[objectCount]=null;
		if (objectCount==1)
		{
			objectCount--;
			return temp;
		}
		bubbleDown(1);
		objectCount--;
		return temp;
	}
	
	//Returns the MINIMUM element from the Priority Queue without removing it
	public E peek()
	{
		return heap[1];
	}
	
	// Returns true if the priority queue is empty
	public boolean isEmpty()
	{
		return  (objectCount==0);
	}
	
	//Returns the number of elements in the priority queue
	public int size()
	{
		return objectCount;
	}
	
	public String toString()
	{
		StringBuffer stringbuf = new StringBuffer("[");
		for (int i = 0; i < objectCount; i++)
		{
			stringbuf.append(heap[i+1]);
			if (i < objectCount - 1)
				stringbuf.append(", ");
		}
		stringbuf.append("]\nor alternatively,\n");

		for(int rowLength = 1, j = 0; j < objectCount; rowLength *= 2)
		{
			for (int i = 0; i < rowLength && j < objectCount; i++, j++)
			{
				stringbuf.append(heap[j+1] + " ");
			}
			stringbuf.append("\n");
			if (j < objectCount)
			{
				for (int i = 0; i < Math.min(objectCount - j, rowLength*2); i++)
				{
					if (i%2 == 0)
						stringbuf.append("/");
					else
						stringbuf.append("\\ ");
				}
				stringbuf.append("\n");
			}
		}
		return stringbuf.toString();
	}
	
	//Doubles the size of the heap array
	private void increaseCapacity()
	{
		E [] temp = (E[])new Comparable[heap.length*2];
		for (int x = 0;x<heap.length;x++)
		{
			temp[x]=heap[x];
		}
		heap=temp;
		
	}

	//Returns the index of the "parent" of index i
	private int parent(int i)
	{
		return i/2;
	}
	//Returns the index of the *smaller child* of index i
	private int smallerChild(int i)
	{
		try
		{
			E n=heap[2*i];
		}
		catch (IndexOutOfBoundsException e)
		{
			increaseCapacity();
		}
		if (heap[2*i]==null)
		{
			return 1;
		}
		if (heap[2*i+1]==null)
		{
			return 2*i;
		}
		if (heap[i*2].compareTo(heap[2*i+1])>0)
			return 2*i+1;
		return 2*i;
	}
	//Swaps the contents of the heap array indices i and j
	private void swap(int i, int j)
	{
		E temp =heap[i];
		heap[i]=heap[j];
		heap[j]=temp;
	}

	// Bubbles the element at index i upwards until the heap properties hold again.
	private void bubbleUp(int i)
	{
		while (heap[i].compareTo(heap[i/2])<0)
		{
						
			swap(i,i/2);
			if (i/4>0)
			{
				i=i/2;
			}
			else
				break;
					
		}
	}
	
	// Bubbles the element at index i downwards until the heap properties hold again.
	private void bubbleDown(int i)
	{
			
			if (isEmpty())
			{
				return;
			}
			while (heap[i].compareTo(heap[smallerChild(i)])>0)
			{
				
				if (smallerChild(i)==1)
					break;
				int n=smallerChild(i);
				swap(i,smallerChild(i));
				i=n;
				if (smallerChild(i)==1)
					break;
				
					
			}
		}
	}

