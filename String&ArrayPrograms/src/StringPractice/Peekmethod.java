package StringPractice;

import java.util.PriorityQueue;

public class Peekmethod {

	public static void main(String[] args) {
		// TODO Auto-geneObjectmethod stub
		PriorityQueue<Object> pq=new PriorityQueue<>();
		pq.add("Rama");
		pq.add("Shyama");
		pq.add("Hari");
		pq.add("Jadu");
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.contains("Hari"));


	}

}
