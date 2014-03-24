package types;


/**
 * @The Marker class is used to simulate the Marker class. It is abstract to give all privileges
 * to each type of account that is a subclass of Marker.
 * 
 * @author (Chazz Young 
 */
public abstract class Marker extends Account
{

    public Marker(String fn, String ln, int empID, String un, String pass, int type)
    
    {
        super(fn, ln, empID, un, pass, type);
    }

    
}
