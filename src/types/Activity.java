package types;

import java.util.ArrayList;
/**
 * Write a description of class Activity here.
 * 
 * @author Chazz Young
 * @version 0.1
 */
public class Activity
{
    private String name, path_solutions, due_date, activityDesc, language;
    private int num_of_tests, num_of_files;
    //isGroup has been included, but it will be empty as this was discontinued
    //in the prioritization meeting 
    private boolean isProgramming, isGroup;
    
    private ArrayList<ProgrammingTest> tests;
    
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
        tests = new ArrayList<ProgrammingTest>();
        //update Database     
    }
    
    //Getters
    
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
    
    public ArrayList<ProgrammingTest> getTests()
    {
        return tests;
    }
    
    //Setters
    
    public void setDueDate(String date)
    {
        due_date = date;
    }
    
    public void addProgrammingTest(String test, String console, String solution, String desc)
    {
        ProgrammingTest p = new ProgrammingTest(test, console, solution, desc);
        tests.add(p);
        isProgramming = true;
    }
    
    public void addMultipleTests(ArrayList<ProgrammingTest> t)
    {
        for(ProgrammingTest p : t){
            if(tests.contains(p)){
                //do nothing
            }else{
             tests.add(p);
            }
        }
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
