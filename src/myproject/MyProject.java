package myproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyProject{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BankingSystem myBankingSystems[] = new BankingSystem[2];
        
        int choice = 0;
        while (choice != 5) {
        System.out.println("Press 1 to add client details\nPress 2 to search"
                + "\nPress 3 to update details\nPress 4 to print");
        
        choice = scan.nextInt();
        
            if(choice == 1){
                AddBankingSystem(scan, myBankingSystems);
            }// end first if
        
            if(choice == 2){
                SearchBankingSystem(scan, myBankingSystems);
            }// end second if
        
            if(choice == 3){
                UpdateBankingSystem(scan, myBankingSystems);
            }// end third if
        
            if(choice == 4){
                PrintBankingSystem(scan, myBankingSystems);
            }// end fourth if
        
            else{
                System.out.println("Invalid entry");
            }// end else
        }// end while
    }// end of main method
    
    //=======================

class BankingSystem { // instance variables
    String name;
    int age;
    int accountNo;
    double balance;
    
    
    // default constructor
    
    public BankingSystem(){

        name = " ";
        age = 0;
        accountNo = 0;
        balance = 0.0;
    }// end 
    
    // constructor where user can change values 
    
    public BankingSystem(String nam, int a, int acc, double ba )
    {
        name = nam;
        age = a;
        accountNo = acc;
        balance = ba;
    }// end 
    
    public void printing (){ // this is the print method in the BankingSystem class 
    
        System.out.println(name + " \nName of the client " + age + " \nage of the client " 
                + accountNo + " \nthe account number of the client\n " + balance + " balance of the client ");
    }
    
    public String getName(){
        System.out.println( name + " is in the database\n");
        return name;
    }// end getName
  
    public void setName(String n){
        name = n;
    }// end setName

}  //====end BankingSystem=================
