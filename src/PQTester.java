
public class PQTester {

	public static void main(String[] args) {

//		System.out.println("Unsorted ArrayList Priority Queue:");
//        ArrayListPQ<Integer> myQ = new ArrayListPQ<Integer>();
//
//        myQ.add(5);
//        myQ.add(6);
//        myQ.add(1);
//        myQ.add(7);
//        myQ.add(10);
//        myQ.add(8);
//        myQ.add(3);
//        myQ.add(4);
//
//        System.out.println("queue:   " + myQ);
//
//        System.out.print("Removing: ");
//        while (!myQ.isEmpty()) {
//            Integer i = myQ.removeMin();
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//
//        myQ.add(4);
//        myQ.add(6);
//        myQ.add(6);
//        myQ.add(8);
//        myQ.add(30);
//        myQ.add(122);
//        myQ.add(1);
//        myQ.add(2);
//        myQ.add(13);
//        myQ.add(22);
//        myQ.add(13);
//        myQ.add(26);
//
//        System.out.println("queue:   " + myQ);
//
//        System.out.print("Removing: ");
//        while (!myQ.isEmpty()) {
//            Integer i = myQ.removeMin();
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//        
//		System.out.println("Sorted Singly Linked List Priority Queue:");
//        SortedSLLPQ<Integer> myQ2 = new SortedSLLPQ<Integer>();
//
//        myQ2.add(5);
//        myQ2.add(6);
//        myQ2.add(1);
//        myQ2.add(7);
//        myQ2.add(10);
//        myQ2.add(8);
//        myQ2.add(3);
//        myQ2.add(4);
//
//        System.out.println("queue:   " + myQ2);
//
//        System.out.print("Removing: ");
//        while (!myQ2.isEmpty()) {
//            Integer i = myQ2.removeMin();
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//
//        myQ2.add(4);
//        myQ2.add(6);
//        myQ2.add(6);
//        myQ2.add(8);
//        myQ2.add(30);
//        myQ2.add(122);
//        myQ2.add(1);
//        myQ2.add(2);
//        myQ2.add(13);
//        myQ2.add(22);
//        myQ2.add(13);
//        myQ2.add(26);
//
//        System.out.println("queue:   " + myQ2);
//
//        System.out.print("Removing: ");
//        while (!myQ2.isEmpty()) {
//            Integer i = myQ2.removeMin();
//            System.out.print(i + " ");
//        }
//        System.out.println("");
        
//		System.out.println("Unsorted Doubly Linked List Priority Queue:");
//        UnsortedDLLPQ<Integer> myQ3 = new UnsortedDLLPQ<Integer>();
//
//        myQ3.add(5);
//        myQ3.add(6);
//        myQ3.add(1);
//        myQ3.add(7);
//        myQ3.add(10);
//        myQ3.add(8);
//        myQ3.add(3);
//        myQ3.add(4);
//
//        System.out.println("queue:   " + myQ3);
//
//        System.out.print("Removing: ");
//        while (!myQ3.isEmpty()) {
//            Integer i = myQ3.removeMin();
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//
//        myQ3.add(4);
//        myQ3.add(6);
//        myQ3.add(6);
//        myQ3.add(8);
//        myQ3.add(30);
//        myQ3.add(122);
//        myQ3.add(1);
//        myQ3.add(2);
//        myQ3.add(13);
//        myQ3.add(22);
//        myQ3.add(13);
//        myQ3.add(26);
//
//        System.out.println("queue:   " + myQ3);
//
//        System.out.print("Removing: ");
//        while (!myQ3.isEmpty()) {
//            Integer i = myQ3.removeMin();
//            System.out.print(i + " ");
//        }
//        System.out.println("");
//        
		System.out.println("Heap Priority Queue???!?");
        HeapPQ<Integer> myQ4 = new HeapPQ<Integer>();
        myQ4.add(5);
        myQ4.add(6);
        myQ4.add(1);
        myQ4.add(7);
        myQ4.add(10);
        myQ4.add(8);
        myQ4.add(3);
        myQ4.add(4);
       
        System.out.println("queue:   " + myQ4);

        System.out.print("Removing: ");
        while (!myQ4.isEmpty()) {
            Integer i = myQ4.removeMin();
            System.out.print(i + " ");
        }
        System.out.println("");

        myQ4.add(4);
        myQ4.add(6);
        myQ4.add(6);
        myQ4.add(8);
        myQ4.add(30);
        myQ4.add(122);
        myQ4.add(1);
        myQ4.add(2);
        myQ4.add(13);
        myQ4.add(22);
        myQ4.add(13);
        myQ4.add(26);

        System.out.println("queue:   " + myQ4);

        System.out.print("Removing: ");
        while (!myQ4.isEmpty()) {
            Integer i = myQ4.removeMin();
            System.out.print(i + " ");
        }        System.out.println("");
    }

}
