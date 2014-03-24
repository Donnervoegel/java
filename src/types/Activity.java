package types;


/**
 * Write a description of class Activity here.
 * 
 * @author Chazz Young
 * @version 0.1
 */
public class Activity
{
    private static String name, path_solutions, language, due_date;
    private static int id;
    private int num_of_tests, num_of_files;
    //isGroup has been included, but it wil lbe empty as this was discontinued
    //in the prioritization meeting 
    private boolean isProgramming, isGroup;
    
    private Rubric rubric;
    
    public Activity(String n, int act_id, String sol, String lang, boolean p, boolean g)
    {
        name = n;
        id = act_id;
        path_solutions = sol;
        language = lang;
        isProgramming = p;
        isGroup = g;
        num_of_tests = 0;
        isProgramming = false;
        isGroup = false;
        //update Database
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getLanguage()
    {
        return language;
    }
    
    public String getDueDate()
    {
        return due_date;
    }
    
    public boolean isProgramming()
    {
        return isProgramming;
    }
    
    public boolean isGroup()
    {
        return isGroup;
    }
    
    public int getID()
    {
        return id;
    }

    public int getNumOfTests()
    {
        return num_of_tests;
    }
    
    public static void setDueDate(String date)
    {
        due_date = date;
    }
    
    public void setIsProgramming(boolean b)
    {
        isProgramming = b;
    }
    
    public void setIsGroup(boolean b)
    {
        isGroup = b;
    }
    
    /**
     * @desc:   Creates a rubric depending on teh flag isPassFail
     * @author: Chazz Young
     */
    public void addRubric(boolean isPassFail)
    {
        Rubric r;
        if(isPassFail == true){
            r = new Rubric(isPassFail);
        }else{
            String path = (path_solutions + "/Rubric.txt");
            r = new Rubric(path);
        }
    }
}
