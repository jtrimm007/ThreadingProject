import java.util.LinkedList;
import java.util.Queue;
import java.util.TimerTask;


public class Teller
{

	private Queue<String> tellerLine;
	private int numberOfCustomersInTellerLine;
	private String tellerID;
	
	public Teller(Queue<String> tellerLine, int numberOfCustomersInTellerLine, String tellerID)
	{
		super();
		this.tellerLine = tellerLine;
		this.numberOfCustomersInTellerLine = numberOfCustomersInTellerLine;
		this.tellerID = tellerID;
		
	}
	
	public Teller(Teller teller)
	{
		this.tellerLine = teller.getTellerLine();
		this.numberOfCustomersInTellerLine = teller.getNumberOfCustomersInTellerLine();
		this.tellerID = teller.getTellerID();
	}

	public Queue<String> getTellerLine()
	{
		return tellerLine;
	}

	public void setTellerLine(Queue<String> tellerLine)
	{
		this.tellerLine = tellerLine;
	}

	public int getNumberOfCustomersInTellerLine()
	{
		return numberOfCustomersInTellerLine;
	}

	public void setNumberOfCustomersInTellerLine(int numberOfCustomersInTellerLine)
	{
		this.numberOfCustomersInTellerLine = numberOfCustomersInTellerLine;
	}

	public String getTellerID()
	{
		return tellerID;
	}

	public void setTellerID(String tellerID)
	{
		this.tellerID = tellerID;
	}
	

}
