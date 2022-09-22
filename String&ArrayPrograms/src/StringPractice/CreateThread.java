package StringPractice;

public class CreateThread extends Thread {
	
	public void run()
	 {
	   System.out.println("Thread is running.....");
     }

	public static void main(String[] args) {
		CreateThread t1= new CreateThread();
		t1.run();
	  }
	}
