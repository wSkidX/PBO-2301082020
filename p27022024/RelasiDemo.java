/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p27022024;

/**
 *
 * @author Administrator
 */
public class RelasiDemo 
{
    public static void main(String[] args){
        // a few numbers
        int i = 37;
        int j = 42;
        int k = 42;
        System.out.println("Variable values...");
        System.out.println(" i=" + i);
        System.out.println(" j=" + j);
        System.out.println(" k=" + k);
        
        // greater than
        System.out.println("Greater than...");
        System.out.println("  i > j = " + (i > j)); // false
        System.out.println("  j > i = " + (j > i)); // true
        System.out.println("  k > j = " + (k > j)); // false
        
        // greater than or equal to
        System.out.println("Greater than or equal to..");
        System.out.println("    i >= j = " + (i >= j)); // false
        System.out.println("    j >= i = " + (j >= i)); // true
        System.out.println("    k >= j = " + (k >= j)); // true
    
        // less than
        System.out.println("Less than..");
        System.out.println("  i < j = " + (i < j)); // true
        System.out.println("  j < i = " + (j < i)); // false
        System.out.println("  k < j = " + (k < j)); // false
   
        // less than or equal to
        System.out.println("less than or equal to");
        System.out.println("  i <= j = " + (i <= j)); // true
        System.out.println("  j <= i = " + (j <= i)); // false
        System.out.println("  k <= j = " + (k <= j)); // true
        
        // equal to
        System.out.println("  i == j = " + (i == j)); // false
        System.out.println("  j == i = " + (j == i)); // false
        System.out.println("  k == i = " + (k == i)); // true
    }
}

