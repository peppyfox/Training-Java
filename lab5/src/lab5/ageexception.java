package lab5;
/** creating my own exception : age exception*/

@SuppressWarnings("serial")
public class ageexception extends Exception
{
    public ageexception()
    {     
        super("The Age  entered isn't valid");
    }
}
