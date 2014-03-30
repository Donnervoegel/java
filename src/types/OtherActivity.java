package types;


/**
 * @desc:   OtherActivity is used to hold the information needed for an 
 *          activity that is not a programming assignment
 * @author: Chazz Young
 */
public class OtherActivity extends Activity
{
    private String solution_path;
    public OtherActivity(String n, String sol, String lang, boolean g, String solution)
    {
        super(n, sol, lang, false, g);
        solution_path = sol;
    }
}
