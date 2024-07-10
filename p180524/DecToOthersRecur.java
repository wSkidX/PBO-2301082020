/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p180524;

/**
 *
 * @author Administrator
 */
public class DecToOthersRecur {
    static void printBase(int num,int base){
        String digits = "0123456789abcdef";
        if (num >= base) {
            printBase(num/base, base);
        }
        System.out.print(digits.charAt(num%base));
    }
    public static void main (String args[]){
        int num = Integer.parseInt(args[0]);
        int base = Integer.parseInt(args[1]);
        printBase(num, base);
    }    
}
