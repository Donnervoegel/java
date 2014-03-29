package types;

import java.util.*;
/**
 * The CodeActivity is used to hold the required info for a programming activity.
 */
public class CodeActivity extends Activity
{
    private HashSet<ProgrammingTest> tests;
    private int num_of_tests;
    
    public CodeActivity(String n, String sol, String lang, boolean p, boolean g)
    {
        super(n, sol, lang, true, g);
        tests = new HashSet<ProgrammingTest>();
    }
    
    public void addTest(String test, String console, String solution, String desc)
    {
        ProgrammingTest p = new ProgrammingTest(test, console, solution, desc);
        addTest(p);
    }
    
    public void addTest(ProgrammingTest p)
    {
        tests.add(p);
        num_of_tests = tests.size();
    }
    
    public void addMultipleTests(Collection<ProgrammingTest> t)
    {
        tests.addAll(t);
        num_of_tests = tests.size();
    }
    
    public HashSet<ProgrammingTest> getTests()
    {
        return tests;
    }
}
