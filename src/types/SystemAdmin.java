package types;


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
        super(fn, ln, empID, un, pass, Type.SYSTEMADMIN);
    }

    /**
     * @desc:   Creates the Account Object and uplaods to database
     * @author: Chazz Young
     */
    public void createAccount(String fn, String ln, int empID, String un, String pass, int type)
    {
        Account a;
        if(type == 1){
            a = new SystemAdmin(fn, ln, empID, un, pass);
        }else if(type == 2){
            a = new AcademicAdmin(fn, ln, empID, un, pass);
        }else if(type == 3){
            a = new AssistantAdmin(fn, ln, empID, un, pass);
        }else if(type == 4){
            a = new Instructor(fn, ln, empID, un, pass);
        }else if(type == 5){
            a = new TATM(fn, ln, empID, un, pass);
        }
        //Update database...
    }
}
