package customers;

public  class Customers 
{ 
    public static void main (String args[])
    {
        Customer firstCustomer = new Customer();
        firstCustomer.name = "Mike";
        firstCustomer.address = "High street";
        firstCustomer.phoneNo = 12345;
        


        System.out.println (firstCustomer.name);  // prints only name
        firstCustomer.print_all();
        
        Customer secondCustomer = new Customer();
        secondCustomer.name = "Jack";
        secondCustomer.address = "Hendon";
        secondCustomer.phoneNo = 00000;

        System.out.println (secondCustomer.name);  // prints only name
        secondCustomer.print_all();
        
        Customer  thirdCustomer = new Customer();
        thirdCustomer.name = "Leo";
        thirdCustomer.address = "Ealing";
        thirdCustomer.phoneNo = 0400;

        System.out.println (thirdCustomer.name);  // prints only name
        thirdCustomer.print_all();
    }// end of main method
} // end of program class CustomerExercise

class Customer 
{
    String name;
    String address;
    int phoneNo;

    public Customer () 
    {     //a default constructor
        name = " ";
        address = " ";
        phoneNo = 0;
    }
 
    public Customer (String n, String ad, int ph) {     //2nd constructor
        name = n;
        address = ad;
        phoneNo = ph;
    }

    public void print_all(){  // method inside the class
        System.out.println( name + " " + address  + " " + phoneNo);
    }  //  end method print_all
}  // end class Customer




