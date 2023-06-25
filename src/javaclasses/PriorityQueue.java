package javaclasses;

public class PriorityQueue {
public static void main(String[] args) {
	 java.util.PriorityQueue Q = new java.util.PriorityQueue<>();
	Q.add(10);
	Q.add(30);
	Q.add(40);
	System.out.println(Q.peek());    //no cut
	System.out.println(Q);
	System.out.println(Q.poll());    //cut the top one
	System.out.println(Q);
}
}
