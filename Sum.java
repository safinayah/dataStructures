/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Scanner;

/**
 *
 * @author ayah
 */
public class Sum {
 public static void main (String[] args){
    
    
     System.out.println("Enter a number");
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
 
    
     System.out.println("sum is "+ sum(n)+"\n");
     
 }
 //finds sum of n numbers
 private static int sum(int n) {
     if(n==0){
         return n; 
     }
     else{
         return n+sum(n-1);
     }
     
 }

    
 }
 

 
 
 
 

