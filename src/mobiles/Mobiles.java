package mobiles;

class Mobiles 
{
    String manufacturer;
    int price;
    int memory;
    int secondHand;
    
    // default constructor
    
    public Mobiles(){
        manufacturer = " ";
        price = 0;
        memory = 0;
        secondHand = 0;
    } // end 
    
    // constructor where user can change values 
    
    public Mobiles(String man, int pr, int mem, int a )
    {
        manufacturer = man;
        price = pr;
        memory = mem;
        secondHand = a;
    } // end   
    
} // End of class Mobiles  