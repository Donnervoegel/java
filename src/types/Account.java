package types;


/**
 * @desc:   The Abstract Account class is used to hold all atributes
 *          and methods of the Account object
 * @author  Chazz Young (0.0) - 03/15/2014
 * @version 0.0  -- getters/setters
 */
public abstract class Account
{
    protected static String first_name, last_name;
    protected static int id;
    protected int user_type;
    protected String username;
    private String password;
    private int bad_logins;
    private static final int MAX_FAILS = 5;
    private static final int MAX_TYPES = 6;
    protected boolean blocked;
    
    
    public Account(String fn, String ln, int empID, String un, String pass, int ut)
    {
        first_name = fn;
        last_name = ln;
        id = empID;
        username = un;
        password = pass;
        //if(ut < 1 || ut > 5){}
        setAccountType(ut);
        blocked = false;
    }
    
    public static String getFirstName()
    {
        return first_name;
    }
    
    public static String getLastName()
    {
        return last_name;
    }
    
    public String getUsername()
    {
        return username;
    }
    
    public int getID()
    {
        return id;
    }
    
    /**
     * @desc:   Returns the string representation of the account type.
     * @author  Chazz Young 
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
            toReturn = "Instructor";
        }else if(id == 5){
            toReturn = "TA/TM Marker"; 
        }else{
            toReturn = "Error: invalid account type";
        }
        return toReturn;
    }
    
    /**
     * @desc:   Tests to see if the inputted password is correct.
     * @author  Chazz Young  
     */
    public boolean checkPassword(String pass)
    {
        boolean toReturn = false;
        if(password.matches(pass)){
            bad_logins = 0;
            toReturn = true;
        }else{
            bad_logins++;
            if(bad_logins >= MAX_FAILS){
                System.out.println("This account has been blocked due to the repeated number of failed logins.");
                blocked = true;
            }
            toReturn = false;
        }
        return toReturn;
    }
    
    public void setUsername(String name)
    {
        username = name;
    }
    
    /**
     * @desc    Validates the old password and sets the password to the specified new 
     *          password if true
     * @author  Chazz Young 
     */
    public void setPassword(String old_pass, String new_pass)
    {
        boolean can_set = checkPassword(old_pass);
        if(can_set == true){
            password = new_pass;
        }else{
            System.out.println("Error: the specified old password is invalid."); 
        }
    }
    
    /**
     * @desc:   Although the dropdown menu to select the account type will
     *          be represented by strings, the dropdown menu will actually
     *          pass an integer value.
     * @version 0.0 - 03/16/2014
     */
    public void setAccountType(int type)
    {
        if(type < 1 || type > MAX_TYPES){
            user_type = type;
        }else{
            System.out.println("Error: invalid account type");
        }
    }
    
    /**
     * @version 0.0 
     */
    public void unblock()
    {
        blocked = false;
    }
}
