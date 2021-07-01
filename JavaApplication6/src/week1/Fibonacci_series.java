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
public class Fibonacci_series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int number;
       Scanner s = new Scanner(System.in);
       System.out.println("fibonacci serisinden olup olmadığını kontrol etmek istediğiniz sayıyı giriniz?");
       number = s.nextInt();
       if(fibonacci(number))
           System.out.println("Yes");
       else System.out.println("No");
       System.out.println("Fibonacci dizisinde bulmak istediğiniz terimi giriniz.");
       number = s.nextInt();
       System.out.println(findterm(number));
    }
    static boolean fibonacci(int n){
        int i=0,j=1,temp;
        while(i<n){
            temp=i;
            i+=j;
            j=temp;
        }
        return i==n;
    }

    private static int findterm(int number) {
        int i=1,x=1,temp,result=0;
        while(i<number){
            temp=result;
            result+=x;
            x=temp;
            i++;
        }
        return result;
    }
}
