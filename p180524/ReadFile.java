/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p180524;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
/**
 *
 * @author Administrator
 */
public class ReadFile {
    public static void main(String args[]) throws IOException {
        System.out.println("What is the name of the file to read from?");
        String filename;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        filename = br.readLine();
        System.out.println("Now reading from "+filename+"...");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        try {
            char data;
            int temp;
            do {
                temp =fis.read();
                data = (char)((char)temp^25);
            if (temp != -1){
                System.out.print(data);
                   
            }
            }while (temp != -1);
        }catch (IOException ex){
            System.out.println("Problem is reading from the file.");
        }
        
    }
}
