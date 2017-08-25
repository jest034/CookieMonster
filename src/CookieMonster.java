import java.util.ArrayDeque;

/* YOU ARE ALLOWED (AND EXPECTED) TO USE THE JAVA ARRAYDEQUE CLASS */

public class CookieMonster {

	private int [][] cookieGrid;
	private int numRows;
	private int numCols;
	private int optimalPath = -1;
	private int maxCallStackDepth = 0; // Used only in recursiveOptimalPath

	public CookieMonster(int [][] cookieGrid) {
		this.cookieGrid = cookieGrid;
		this.numRows    = cookieGrid.length;
		this.numCols    = cookieGrid[0].length;
	}

	/* Return the calculated optimal path */
	public int getOptimalPath() {
		return optimalPath;
	}

	private boolean goodPoint(int row, int col) {
		return (row >= 0 && row < numRows && col >= 0 && col < numCols && cookieGrid[row][col] >= 0);
	}


	/* RECURSIVELY calculates the route which grants the most cookies, and 
	 * returns the maximum depth the call stack reached during the operation. */
	public int maxCallStackDepth() {
		this.optimalPath = recursiveOptimalPath(0, 0, 1);
		return maxCallStackDepth;
	}	

	/* Helper function for the above, which returns the maximum number of cookies edible starting at coordinate (row, col). */
	/* From any given position, always check right before checking down */
	/* Also, updates the maxCallStackDepth variable, to find out how deep the recursion call stack got during the operation. 
	 * I've implemented this part already (you should add 1 to the depth when it calls itself). */ 

	private int recursiveOptimalPath(int row, int col, int depth) {
		if (depth > this.maxCallStackDepth)
			this.maxCallStackDepth = depth;

	
		if (goodPoint (row, col) == false)
		{
			return 0;
		}

		return cookieGrid[row][col] + Math.max(recursiveOptimalPath(row , col+1 , depth +1), recursiveOptimalPath(row+1, col, depth +1));
		
	
		
		/* -- YOU IMPLEMENT THIS -- */
	}
	/* Calculate the route which grants the most cookies, and return the maximum queue size during the operation. */
	/* From any given position, always check right before checking down */
	/* Set this.optimalPath before returning */
	public int maxQueueSize() {
		ArrayDeque<PathMarker> queue = new ArrayDeque<PathMarker>();
		int maxQueueSize = 0;
		int bestPath = -1;
		queue.addFirst(new PathMarker(0, 0, cookieGrid[0][0]));
		
		while (!queue.isEmpty())
		{
			PathMarker rw = queue.removeLast();
			int row = rw.row;
			int col = rw.col; 
			int total = rw.total;
			if (goodPoint(row, (col +1)))
			{
				PathMarker temp = (new PathMarker (row, col +1, total + cookieGrid[row][col+1]));
				queue.addFirst(temp);
				if (queue.size() > maxQueueSize )
				{
					maxQueueSize = queue.size();
				}
				if(temp.total > bestPath )
				{
					bestPath =temp.total;
				}
			}
			if (goodPoint((row +1), col))
			{
				PathMarker temp = (new PathMarker (row+1, col, total + cookieGrid[row+1][col]));
				queue.addFirst(temp);
				if (queue.size() > maxQueueSize )
				{
					maxQueueSize = queue.size();
				}
				if(temp.total > bestPath )
				{
					bestPath = temp.total;
				}
			}
				
		}
		this.optimalPath = bestPath;
		return maxQueueSize; 
		/* -- YOU IMPLEMENT THIS -- */
	}
	public int maxPQSize()
	{
		HeapPQ<PathMarker> pq = new HeapPQ<PathMarker>();
		int maxPQSize = 0;
		int bestPath = -1;
		pq.add(new PathMarker(0, 0, cookieGrid[0][0]));
		while (!pq.isEmpty())
		{
			PathMarker rw = pq.removeMin();
			int row = rw.row;
			int col = rw.col; 
			int total = rw.total;
			if (goodPoint(row, (col +1)))
			{
				PathMarker temp = (new PathMarker (row, col +1, total + cookieGrid[row][col+1]));
				pq.add(temp);
				if (pq.size() > maxPQSize )
				{
					maxPQSize = pq.size();
				}
				if(temp.total > bestPath )
				{
					bestPath =temp.total;
				}
			}
			if (goodPoint((row +1), col))
			{
				PathMarker temp = (new PathMarker (row+1, col, total + cookieGrid[row+1][col]));
				pq.add(temp);
				if (pq.size() > maxPQSize )
				{
					maxPQSize = pq.size();
				}
				if(temp.total > bestPath )
				{
					bestPath = temp.total;
				}
			}
			
		// YOUR CODE HERE
		}
		this.optimalPath = bestPath;
		return maxPQSize;
		
		}


	/* Calculate the route which grants the most cookies, and return the maximum stack size during the operation. */
	/* From any given position, always check right before checking down */
	/* Set this.optimalPath before returning */
	public int maxStackSize() {
		ArrayDeque<PathMarker> stack = new ArrayDeque<PathMarker>();
		int maxStackSize = 0;
		int bestPath = -1;
		stack.addFirst(new PathMarker(0, 0, cookieGrid[0][0]));
		/* -- YOU IMPLEMENT THIS -- */
		while (!stack.isEmpty())
		{
			PathMarker rw = stack.removeFirst();
			int row = rw.row;
			int col = rw.col; 
			int total=rw.total;
			if (goodPoint(row, (col +1)))
			{
				PathMarker temp = (new PathMarker (row, col +1, total + cookieGrid[row][col+1]));
				stack.addFirst(temp);
				if (stack.size() > maxStackSize )
				{
					maxStackSize = stack.size();
				}
				if(temp.total > bestPath )
				{
					bestPath =temp.total;
				}
			}
			if (goodPoint((row +1), col))
			{
				PathMarker temp = (new PathMarker (row+1, col, total + cookieGrid[row+1][col]));
				stack.addFirst(temp);
				if (stack.size() > maxStackSize )
				{
					maxStackSize = stack.size();
				}
				if(temp.total > bestPath )
				{
					bestPath = temp.total;
				}
			}
				
		}
		this.optimalPath = bestPath;
		return maxStackSize; 			

	}

}