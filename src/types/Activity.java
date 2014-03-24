package types;


/**
 * Write a description of class Activity here.
 * 
 * @author Chazz Young
 * @version 0.1
 */
public class Activity
{
    private String name, path_solutions, language, due_date, activityDesc;
    private int num_of_tests, num_of_files;
    //isGroup has been included, but it wil lbe empty as this was discontinued
    //in the prioritization meeting 
    private boolean isProgramming, isGroup;
    
    private Rubric rubric;
    
    public Activity(String n, String sol, String lang, boolean p, boolean g)
    {
        name = n;
        path_solutions = sol;
        language = lang;
        isProgramming = p;
        isGroup = g;
        num_of_tests = 0;
        isProgramming = false;
        isGroup = false;
        //update Database     
    }
    
    public String getActivityDesc() {
    	return activityDesc;
    }
    
    public String getSolnPath() {
    	return path_solutions;
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

    public int getNumOfTests()
    {
        return num_of_tests;
    }
    
    public void setDueDate(String date)
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
