/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package keyinput;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class KeyInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyInput = new Scanner (System.in);
        int num1,num2,sum;
        String name;
        System.out.println("Enter the first number");
        num1 = keyInput.nextInt();
        System.out.println("Enter the second number");
        num2 = keyInput.nextInt();
        System.out.println("Enter your name"); 
        name = keyInput.nextLine();
        System.out.println("Your name is " + name);
        sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
    
}
