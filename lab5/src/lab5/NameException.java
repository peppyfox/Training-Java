package lab5;

@SuppressWarnings("serial")
public class NameException extends Exception
{

	public NameException()
	{
		super("No name has been entered");
	}

	public NameException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NameException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public NameException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
