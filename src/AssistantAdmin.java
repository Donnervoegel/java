
/**
 * @desc:   The AssistantAdmin class is used to model the Academic Admin Assistant account.
 * 
 * @author (Chazz Young (0.0) 
 * @version 0.0 - 03/16/2014 --getters/setters
 */
public class AssistantAdmin extends Account
{

    public AssistantAdmin(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, 3);
    }

    
}