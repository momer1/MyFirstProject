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