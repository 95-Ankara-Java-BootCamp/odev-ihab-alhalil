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
public class sellTicket {
    //set the ticket price with by costumer information
    private static void setPriece(float ticketPrice, int age, String type) {
        float discount = 0;
        if(age < 18)
            discount=0.1f;
        else if(age <= 25)
            discount = 0.05f;
        try{
            filmType.valueOf(type);
        }catch(Exception e){
            System.out.println("your film type entry is not valied !!");
            System.out.println("Please Enter a valied Type ;) !!!");
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            setPriece(ticketPrice,age,s);
            return;
        }
        if(filmType.valueOf(type).equals(filmType.Horror))
            discount += 0.1f;
        System.out.printf("Ticket price is : %.2f TL with discount it becomes : %.2f Tl\n",ticketPrice,ticketPrice*(1-discount));
    }
    //types of exists films
    enum filmType {Horror,Comedy,Drama,Thrill,Mystery};
    public static void main(String[] args){
        final float ticketPrice = (float) (Math.random() * 100);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = scan.nextInt();
        System.out.println("Enter the type of movie you want to watch :\n1.\tHorror\n2.\tComedy\n3.\tDrama\n4.\tThrill\n5.\tMystery\n");
        String Type = scan.next();
        setPriece(ticketPrice,age,Type);
    }
}
