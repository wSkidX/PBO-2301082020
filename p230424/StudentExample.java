/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p230424;
/**
 *
 * @author Administrator
 */
public class StudentExample {
    
        public static void printInformation( Person p){
        if(p instanceof Student){
                System.out.println("Nama Siswa  :"+p.getName());
                System.out.println("Alamat  :"+p.getAddress());
        }
        if(p instanceof Employee){
                System.out.println("Nama Karyawan  :"+p.getName());
                System.out.println("Alamat  :"+p.getAddress());
        }
}
        
        public static void main(String[] args){
        Person ref;
        Student ali = new Student();
        ali.setName("Ali");
        ali.setAddress("Padang");
        Employee budi = new Employee();
        budi.setName("Budi");
        budi.setAddress("Bukit tinggi");
        
        ref =  ali;
        System.out.println("Nama     :"+ref.getName());
        System.out.println("Alamat    :"+ref.getAddress());
        
        ref =  budi;
        System.out.println("Nama     :"+ref.getName());
        System.out.println("Alamat    :"+ref.getAddress());
        
        printInformation(ali);
        printInformation(budi);
    }
}
