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
public class ManavKasa {
    public static void main(String[] args){
        int amount;
        float result=0;
        final float armut = 2.14f;
        final float elma = 3.67f;
        final float domates = 1.11f;
        final float muz = 0.95f;
        final float patlıcan = 5f;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ? :");
        amount = s.nextInt();
        result += amount*armut;
        System.out.println("Elma Kaç Kilo ? :");
        amount = s.nextInt();
        result += amount*elma;
        System.out.println("Domates Kaç Kilo ? :");
        amount = s.nextInt();
        result += amount*domates ;
        System.out.println("Muz Kaç Kilo ? :");
        amount = s.nextInt();
        result += amount*muz;
        System.out.println("Patlıcan Kaç Kilo ? :");
        amount = s.nextInt();
        result += amount*patlıcan ;
        System.out.printf("Toplam Tutar : %.2f TL\n",result);
    }
}
