/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p19032024;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class GanjilGenap {
    public static void main(String[] args){
        int a;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bukat:");
        a = input.nextInt();
        if(a%2==0)
            //a mod 2 =1
            System.out.println(a + "merupakan bilangan genap");
        else //a mod 2 = 1
            System.out.println(a + "erupakan bilangan ganjil");
    }
}
