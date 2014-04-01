package types;


/**
 * @desc:   This class is implemented by the Activity class to hold the 
 *          paths needed for programming tests
 * @author: Chazz Young
 */
public class ProgrammingTest
{
    private String test_path, console_input_path, solution_path, description;

    public ProgrammingTest(String test) {
    	test_path = test;
    }
    
    public ProgrammingTest(String test, String console, String solution, String desc)
    {
        test_path = test;
        console_input_path = console;
        solution_path = solution;
        description = desc;
    }

    public String getTestPath()
    {
        return test_path;
    }
    
    public String getConsolenputPath()
    {
        return console_input_path;
    }
    
    public String getSolutionPath()
    {
        return solution_path;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setTestPath(String t)
    {
        test_path = t;
    }
    
    public void setConsolenputPath(String t)
    {
        console_input_path = t;
    }
    
    public void set(String t)
    {
        solution_path = t;
    }
    
    public void setDescription(String t)
    {
        description = t;
    }
}
