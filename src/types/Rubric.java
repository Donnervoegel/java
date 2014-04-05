package types;

import java.util.*;
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
    }
    
    /**
     * Special case where the rubric is a pass/fail rubric
     */
    public Rubric(boolean pass)
    {
        items = new ArrayList<RubricItem>(1);
        items.add(new RubricItem("This assignment is pass/fail", 1));
    }
    
    public void addItem(String desc, int max)
    {
        RubricItem r = new RubricItem(desc, max);
        items.add(r);
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