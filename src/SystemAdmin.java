
/**
 * @desc:   The SystemAdmin class is used to model the System Administrator account.
 * 
 * @author (Chazz Young (0.0) 
 * @version 0.0 - 03/16/2014 --getters/setters
 */
public class SystemAdmin extends Account
{

    public SystemAdmin(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, 1);
    }

    
}
