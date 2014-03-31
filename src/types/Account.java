package types;

/**
 * @desc:   The Abstract Account class is used to hold all attributes
 *          and methods of the Account object
 * @author  Chazz Young 
 */
public abstract class Account
{
    /*
    Instructor==4
    TA/TM==5
    AcAdmin==2
    AssAdmin==3
    SysAdmin==1
    */
    public enum Type {
	INSTRUCTOR,
	TATMMARKER,
	ACADEMICADMIN,
	ASSISTANTADMIN,
	SYSTEMADMIN
    }
    
    private static final int MAX_FAILS = 5;
	
    protected String first_name, last_name;
    protected Type accountType;
    protected String username;
    private String password;
    protected boolean blocked;
    protected int empID;
    private int bad_logins;
    
    public Account(String fn, String ln, int empID, String un, String pass, Type ut) {
        first_name = fn;
        last_name = ln;
        this.empID = empID;
        username = un;
        password = pass;
        //if(ut < 1 || ut > 5){}
        setAccountType(ut);
        blocked = false;
    }
    
    public void setBlocked(boolean blocked) {
    	this.blocked = blocked;
    }
    
    public String getFirstName() {
        return first_name;
    }
    
    public String getLastName() {
        return last_name;
    }
    
    public String getUsername() {
        return username;
    }
    
    public int getEmpID() {
        return empID;
    }
    
    public Type getAccountType() {
    	return accountType;
    }
    
    public boolean isBlocked() {
    	return blocked;
    }
    
    public String getPassword() {
    	return password;
    }
    
    /**
     * @desc:   Returns the string representation of the account type.
     * @author  Chazz Young 
     */
    public String getAccountTypeString()
    {
        String toReturn = null;
        if(accountType == Type.SYSTEMADMIN) {
            toReturn = "System Administrator";
        } else if(accountType == Type.ACADEMICADMIN) {
            toReturn = "Academic Administrator";
        } else if(accountType == Type.ASSISTANTADMIN) {
            toReturn = "Assistant Academic Administrator";
        } else if(accountType == Type.INSTRUCTOR) {
            toReturn = "Instructor";
        } else if(accountType == Type.TATMMARKER) {
            toReturn = "TA/TM Marker"; 
        } else {
            toReturn = "Error: invalid account type";
        }
        return toReturn;
    }
    
    /**
     * @desc:   Tests to see if the inputted password is correct.
     * @author  Chazz Young  
     */
    public boolean checkPassword(String pass) {
        boolean toReturn = false;
        if(password.matches(pass)) {
            bad_logins = 0;
            toReturn = true;
        } else {
            bad_logins++;
            if(bad_logins >= MAX_FAILS){
                System.out.println("This account has been blocked due to the repeated number of failed logins.");
                blocked = true;
            }
            toReturn = false;
        }
        return toReturn;
    }
    
    public void setUsername(String name) {
        username = name;
    }
    
    /**
     * @desc    Sets the new password.
     * @author  Chazz Young 
     */
    public void setPassword(String new_pass) {
	password = new_pass;
    }
    
    /**
     * @desc:   Although the dropdown menu to select the account type will
     *          be represented by strings, the dropdown menu will actually
     *          pass an integer value.
     */
    public void setAccountType(Type type) {
        accountType = type;
    }
    
    public int getAccountTypeAsInt() {
        int typeInt;
        if (accountType==Type.INSTRUCTOR) {
            typeInt = 4;
        }
        else if (accountType==Type.TATMMARKER) {
            typeInt = 5;
        }
        else if (accountType==Type.ACADEMICADMIN) {
            typeInt = 2;
        }
        else if (accountType==Type.ASSISTANTADMIN) {
            typeInt = 3;
        }
        else if (accountType==Type.SYSTEMADMIN) {
            typeInt = 1;
        }
        else{
            System.out.println("Invalid account type");
            typeInt = 0;
        }
        return typeInt;
    }
    
    public void unblock() {
        blocked = false;
    }
}
