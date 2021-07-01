/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Scanner;

/**
 *
 * @author EHAB-
 */
public class LetterGrade {
     public static void main(String[] args){
         System.out.println("Enter your grade:");
         int grade = new Scanner(System.in).nextInt();
         if(grade<=100&&grade>=90)
             System.out.println("Your Letter is : A");
         else if(grade<=89&&grade>=85)
             System.out.println("Your Letter is : B1");
         else if(grade<=84&&grade>=80)
             System.out.println("Your Letter is : B2");
         else if(grade<=79&&grade>=75)
             System.out.println("Your Letter is : B3");
         else if(grade<=74&&grade>=70)
             System.out.println("Your Letter is : C1");
         else if(grade<=69&&grade>=65)
             System.out.println("Your Letter is : C2");
         else if(grade<=64&&grade>=60)
             System.out.println("Your Letter is : C3");
         else if(grade<60)
             System.out.println("Your Letter is : F");
     }
}
