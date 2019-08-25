package students;

public  class Students
{ 
    public static void main (String args[])
    {
        Student firstStudent = new Student("Mike","Hendon", 001234);
        System.out.println (firstStudent.name);  // prints only name
        firstStudent.print_all();
        
        Student secondStudent = new Student("Jack","Ealing", 00000);
        System.out.println (secondStudent.name);  // prints only name
        secondStudent.print_all();
        
        Student thirdStudent = new Student("Leo","Uxbridge", 04000);
        System.out.println (thirdStudent.name);  // prints only name
        thirdStudent.print_all();
        
    }// end of main method
} // end of program class CustomerExercise

class Student
{
    String name;
    String address;
    int phoneNo;

    public Student () 
    {     //a default constructor
        name = " ";
        address = " ";
        phoneNo = 0;
    }
 
    public Student (String n, String ad, int ph) 
    {     //2nd constructor
        name = n;
        address = ad;
        phoneNo = ph;
    }

    public void print_all()
    {  // method inside the class
        System.out.println( name + " " + address  + " " + phoneNo);
    }  //  end method print_all
}  // end class Customer



