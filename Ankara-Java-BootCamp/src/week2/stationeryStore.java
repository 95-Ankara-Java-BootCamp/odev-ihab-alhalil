/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.*;
/**
 *
 * @author EHAB-
 */
public class stationeryStore {
    
    private static int numberOfItems;
    private static HashMap <String,Integer> map = new HashMap<String,Integer>() ;
    public static void main(String[] args){
        getOrders();
        printOrders();
    }
    //get customer order list 
    private static void getOrders() {
        Scanner scan = new Scanner(System.in);
        String itemName;
        Integer amount;
        //get every order and enter it to hash map to be saved with its amount
        while(true){
            System.out.println("Enter item name and amount or enter end to exit :");
            itemName = scan.next();
            if(itemName.equals("end"))
                break;
            amount = scan.nextInt();
            numberOfItems += amount;
            if(map.get(itemName)!= null)
                amount += map.get(itemName);
            map.put(itemName,amount);
        }
    }
    //print the list of orders
    private static void printOrders() {
        for(String i: map.keySet())
            System.out.println(i+"\t"+map.get(i));
        System.out.println("----------");
        System.out.println("Total number of items:"+numberOfItems);
    }
}
