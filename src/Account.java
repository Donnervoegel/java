
/**
 * @desc:   The Abstract Account class is used to hold all atributes and methods of the Account object
 * 
 * @author  Chazz Young (0.0)
 * @version 0.0 - 03/15/2014 -- getters/setters
 */
public abstract class Account
{
    protected static String first_name, last_name;
    protected String username;
    private String password;
    protected static int id;
    protected int user_type;
    
    public Account(String fn, String ln, int empID, String un, String pass, int ut)
    {
        first_name = fn;
        last_name = ln;
        id = empID;
        username = un;
        password = pass;
        user_type = ut;
    }
    
    /**
     * @version 0.0 - 03/15/2014
     */
    public static String getFirstName()
    {
        return first_name;
    }
    
    /**
     * @version 0.0 - 03/15/2014
     */
    public static String getLastName()
    {
        return last_name;
    }
    
    /**
     * @version 0.0 - 03/15/2014
     */
    public String getUsername()
    {
        return username;
    }
    
    /**
     * @version 0.0 - 03/15/2014
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * @desc:   Returns the string representation of the account type.
     * @author  Chazz Young (0.0)          
     * @version 0.0 - 03/16/2014
     */
    public String getAccountType()
    {
        String toReturn = null;
        if(id == 1){
            toReturn = "System Administrator";
        }else if(id == 2){
            toReturn = "Academic Administrator";
        }else if(id == 3){
            toReturn = "Assistant Academic Administrator";
        }else if(id == 4){
            toReturn = "TA/TM Marker"; 
        }else{
            toReturn = "Error: invalid account type";
        }
        return toReturn;
    }
    
    /**
     * @version 0.0 - 03/16/2014
     */
    public void setUsername(String name)
    {
        username = name;
    }
    
    /**
     * @desc: Although the dropdown menu to select the account type will be represented by strings,
     * the dropdown menu will actually pass an inteer value.
     * @version 0.0 - 03/16/2014
     */
    public void setAccountType(int type)
    {
        if(type < 1 || type > 4){
            user_type = type;
        }else{
            System.out.println("Error: invalid account type");
        }
    }
    
}
