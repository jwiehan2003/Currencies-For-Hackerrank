/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency1;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;  
public class Currency1 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your input: ");
        double payment = scanner.nextDouble();
        scanner.close();
        
        String Britan = NumberFormat.getCurrencyInstance(Locale.UK).format(payment);
        
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);


        String China = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);

       
       
       Locale IND = new Locale("en","IN");
       String india = NumberFormat.getCurrencyInstance(IND).format(payment);

     
        System.out.println("UK: "+Britan);
        
        System.out.println("US: " + us);
        
        System.out.println("France: " + france);
        
        System.out.println("China: " + China);
        
        System.out.println("India: " + india);

    }
}
