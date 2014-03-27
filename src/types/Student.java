package types;

import java.util.*;

public class Student
{
    private String name;
    private int id;
    
    public Student(String n, int i)
    {
        name = n;
        id = i;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getID()
    {
        return id;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setID(int i)
    {
        id = i;
    }
}
