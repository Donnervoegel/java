package types;


/**
 * @The Marker class is used to simulate the Marker account. It is abstract to give all privileges
 * to each type of account that is a subclass of Marker.
 * 
 * @author (Chazz Young 
 */
public abstract class Marker extends Account
{

    public Marker(String fn, String ln, int empID, String un, String pass, Type type)
    
    {
        super(fn, ln, empID, un, pass, type);
    }

    
}
