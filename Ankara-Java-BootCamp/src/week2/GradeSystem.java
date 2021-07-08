/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.Scanner;

/**
 *
 * @author EHAB-
 */
public class GradeSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yor Midterm grade");
        float midGrade = scan.nextFloat();
        System.out.println("Enter yor Final grade");
        float finalGrade = scan.nextFloat();
        float result = midGrade *0.4f + finalGrade*0.6f;
        System .out.printf("Your result is : %.2f %% ",result);
        System.out.println(letter(result));
    }

    private static String letter(float result) {
        if(result < 20)
            return "FF";
        else if(result >=20 && result<50)
            return "CB";
        else if(result >=50 && result<70)
            return "BB";
        else return "AA";  
    }
}
