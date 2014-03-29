package types;

import java.util.ArrayList;
/**
 * The abstract Activity class is used to hold teh information requred for an Activity
 * 
 * @author Chazz Young
 * @version 0.1
 */
public abstract class Activity
{
    private String name, due_date, activityDesc, language;
    
    //isGroup has been included, but it will be empty as this was discontinued
    //in the prioritization meeting 
    private boolean isProgramming, isGroup;
    
    private Rubric rubric;
    
    public Activity(String n, String sol, String lang, boolean p, boolean g)
    {
        name = n;

        language = lang;
        isProgramming = p;
        isGroup = g;
          
    }
    
    //Getters
    
    public String getActivityDesc() {
        return activityDesc;
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
    
    //Setters
    
    public void setDueDate(String date)
    {
        due_date = date;
    }
    
    public void setIsGroup(boolean b)
    {
        isGroup = b;
    }
    
}
