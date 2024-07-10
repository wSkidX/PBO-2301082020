/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p230424;

/**
 *
 * @author Administrator
 */
public class Person {
    protected String name;
    protected String address;
    
    public Person() {
        System.out.println("Person Constructor");
        name="";
        address="";
    }
    
    public Person (String name,String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        System.out.println("Parent:getName");
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
}
