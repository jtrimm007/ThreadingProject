import java.util.LinkedList;
import java.util.Queue;
import java.util.TimerTask;

public class CustomerNumber extends TimerTask
{


	Queue<String> line = new LinkedList<>();

	public CustomerNumber(Queue<String> line)
	{
		super();
		this.line = line;
	}
	
	public CustomerNumber(CustomerNumber customerNumber)
	{
		this.line = customerNumber.line;
	}



	public Queue<String> getLine()
	{
		return line;
	}

	public void setLine(Queue<String> line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		if(line.size() > 0)
		{
			System.out.println("Customer Number " + line.remove() + " got in line.");
		}

	}
	
}
