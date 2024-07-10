/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p270424;

/**
 *
 * @author Administrator
 */
public abstract class LivingThing {
    public void breath(){
        System.out.println("Living Thing Breathing...");
    }
    
    public void eat(){
        System.out.println("Living thing Eating...");
    }
    
    public abstract void walk();
}
