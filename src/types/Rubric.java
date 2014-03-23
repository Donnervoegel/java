package types;

import java.util.*;
import java.io.*;
/**
 * The class Rubric is used to model the Rubric option. It requires a csv file
 * to create and populate the items
 * 
 * @author Chazz Young(0.1) 
 */
public class Rubric
{
    private ArrayList<RubricItem> items;
    
    /**
     * General constructor
     */
    public Rubric(String file)
    {
        items = new ArrayList<RubricItem>();
        populateRubric(file);
    }
    
    /**
     * Special case where the rubric is a pass/fail rubric
     */
    public Rubric(boolean pass, int max)
    {
        items = new ArrayList<RubricItem>(1);
        items.add(new RubricItem("This assignment is pass/fail", 1));
    }
    
    private void populateRubric(String filepath)
    {
        //Input is coming soon...
    }
}

/**
 * This helper class is used to represent one item in the rubric. As it is only 
 * used by the Rubric class, its fields are public
 */
class RubricItem
{
    public String description;
    public int max_grade;
    
    public RubricItem(String desc, int max)
    {
        description = desc;
        max_grade = max;
    }
}