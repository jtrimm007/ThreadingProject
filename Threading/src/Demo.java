/**
 * -------------------------------------------------
 * File name: Demo.java
 * Project name: Threading
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Apr 25, 2018
 * -------------------------------------------------
 */

/**
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Apr 25, 2018
 * <hr>
 * @author Joshua Trimm
 */

class MyClass extends Thread {

	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}
	}
	
}

public class Demo {
	
	public static void main(String[] args)
	{
		MyClass myClass = new MyClass();
		myClass.start();
		MyClass myClass2 = new MyClass();
		myClass2.start();
	}

}
