package grades;

import javax.swing.JOptionPane;

public class Grades 
{
    public static void main(String[] args)
    {
        String grades = JOptionPane.showInputDialog("insert the mark");
        int pass_grade = Integer.parseInt(grades);
        
        if(pass_grade>=80)
        {
            System.out.println("You have got grade A");
        }
        
        else if(pass_grade>=60)
        {
            System.out.println("You have got grade B");
        }
        
        else if(pass_grade>=40)
        {
            System.out.println("You have got grade C");
        }
        
        else 
        {
            System.out.println("You have failed");
        } 
        
        Student Bob = new Student(pass_grade);
        
    }// end of main method 
}// end of class Grades

class Student 
{
    int grades;
    
    public Student()// default constructor
    {
        grades = 0;
    }
    
    public Student(int pass_grade)// second constructor
    {
        grades = pass_grade;
    }
}


