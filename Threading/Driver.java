import java.util.LinkedList;
import java.util.Queue;
import java.util.TimerTask;
import java.util.Timer;

public class Driver
{


	public static void main(String[] args) throws InterruptedException
	{
			//State the number of customers
			int[] numberOfCustomers = new int[5];
			
			//Have them start lining up in the first line
			Queue<String> customerInLine = new LinkedList<>();

			//Start handing out numbers to customers as they come in
			int customerNumber = 1;

			//While loop to run through the customers
			for(int customer : numberOfCustomers)
			{

				//For each new customer in line add the to the queue
				customerInLine.add(Integer.toString(customerNumber));

				//Set a run time interval to run through the customer line. 
				TimerTask interval = new CustomerNumber(customerInLine);

				//Define a new timer.
				Timer timer1 = new Timer();
				
				//Instantiate the timer to run through the interval
				timer1.schedule(interval, 1000, 5000);
				//System.out.println(customerInLine);

				//while there are customers in line
				while(customerInLine.size() > 0)
				{
					Thread.sleep(100);
				}
				interval.cancel();
				timer1.cancel();
				timer1.purge();
				
				

			
				customerNumber++;
			}
		
	}
	
	public static void TellerOne(Queue<String> passCustomerToTeller)
	{
		String tellerOneID = "1";
		
		Queue<Teller> tellerOne = new LinkedList<>();
		
		//String lineSize = tellerOne.size();
		
		//tellerOne.add(passCustomerToTeller, Integer.parseInt(lineSize), tellerOneID);
	}


}
