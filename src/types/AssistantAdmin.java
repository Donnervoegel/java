package types;


/**
 * @desc:   The AssistantAdmin class is used to model the Academic Admin Assistant account.
 * 
 * @author Chazz Young
 */
public class AssistantAdmin extends Account
{

    public AssistantAdmin(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, Type.ASSISTANTADMIN);
    }

    public void createCourse(String name, String id, Instructor inst, String start, String end)
    {
        Course c = new Course(name, id, inst, start, end);
        inst.addCourse(c);
    }
}