package myproject;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MyProject{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BankingSystem myBankingSystems[] = new BankingSystem[2];
        

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