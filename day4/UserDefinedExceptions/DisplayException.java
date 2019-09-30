package day4.UserDefinedExceptions;

public class DisplayException extends Exception{
	
	public DisplayException()
	{
	 super("Not Valid");
	}
	

	public DisplayException(String msg)
	{
	 super(msg);
	}
}
