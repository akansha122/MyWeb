package day4.UserDefinedExceptions;

public class InvalidNameException extends Exception{
	
	 public InvalidNameException()
	 {
		 super("Invalid Name");
	 }

	 public InvalidNameException(String msg)
	 {
		super(msg);
	 }
}
