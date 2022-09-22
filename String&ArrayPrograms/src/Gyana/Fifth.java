package Gyana;

import java.util.PriorityQueue;
public class Fifth {

	public static void main(String[] args) {
		PriorityQueue<Object> q1=new PriorityQueue<>();
		q1.add("Rama");
		q1.add("Hari");
		q1.add("Shyama");
		q1.add("Jadu");
		System.out.println("Priority Queue are:"+q1);
		System.out.println(q1.peek());
		System.out.println(q1.poll());
	}

}
