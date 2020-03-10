/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author Tonny Kamau
 */
public class grade {
    public static void main(String args[])
    {
        int marks;
        Scanner grade=new Scanner(System.in);
        System.out.println("Enter the student marks");
        marks=grade.nextInt();
        while(marks<0 || marks>100)
        {
      System.out.println("Enter a valid number");
      marks=grade.nextInt();
        }
        
        
        
        switch(marks/10)
        {
        case 10:case 9: case 8: case 7:
                System.out.println("A");
                break;
        case 6:
                System.out.println("B");
                break;
        case 5:
                System.out.println("C");
                break;
        case 4:
                System.out.println("D");
                break;
        default:
                System.out.println("F");
                break;
        
        
        
        }
    
    
    }
    
}
