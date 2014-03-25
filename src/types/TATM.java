package types;


/**
 * @desc:   The TATM class is used to model the TA/TM Marker account.
 * 
 * @author (Chazz Young (0.0) 
 * @version 0.0 - 03/16/2014 --getters/setters
 */
public class TATM extends Marker
{

    public TATM(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, Type.TATMMARKER);
    }

    
}
