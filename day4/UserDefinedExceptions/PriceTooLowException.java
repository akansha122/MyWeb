package day4.UserDefinedExceptions;

public class PriceTooLowException extends Exception{

	public PriceTooLowException()
	{
		super("Price cannot be zero or negative");
	}
	
	public PriceTooLowException(String msg)
	{
		super(msg);
	}
}
