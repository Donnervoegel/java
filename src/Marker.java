
/**
 * @desc:   The Marker class is used to model the System Administrator account.
 * 
 * @author (Chazz Young (0.0) 
 * @version 0.0 - 03/16/2014 --getters/setters
 */
public abstract class Marker extends Account
{

    public Marker(String fn, String ln, int empID, String un, String pass, int type)
    
    {
        super(fn, ln, empID, un, pass, type);
    }

    
}
