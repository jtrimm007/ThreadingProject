/**
 * -------------------------------------------------
 * File name: Testing.java
 * Project name: Threading
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Apr 24, 2018
 * -------------------------------------------------
 */

/**
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Apr 24, 2018
 * <hr>
 * @author Joshua Trimm
 */

public class Testing {
	
	public static void main(String[] args)
	{
		//System.out.println(fact(5));

	}
	
	public static int fact(int b)
	{
		if(b <= 1)
		{
			return 1;
		}
		else
			return b * fact(b - 1);
	}

}


