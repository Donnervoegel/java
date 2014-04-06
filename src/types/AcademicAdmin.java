package types;

/**
 * @author: Chazz
 */
public class AcademicAdmin extends Marker
{
    
    
    public AcademicAdmin(String fn, String ln, int empID, String un, String pass)
    
    {
        super(fn, ln, empID, un, pass, Type.ACADEMICADMIN);
    }
}
