/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p270424;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        Circle lingkaran = new Circle(5);
        System.out.println("Nama bentuk: " + lingkaran.getName());
        System.out.println("Radius: " + lingkaran.getRadius());
        System.out.println("Luas: " + lingkaran.getArea());
        System.out.println("Diameter: " + lingkaran.getDiameter());

        System.out.println();

        Square persegi = new Square(4);
        System.out.println("Nama bentuk: " + persegi.getName());
        System.out.println("Panjang sisi: " + persegi.getSide());
        System.out.println("Luas: " + persegi.getArea());
        System.out.println("Keliling: " + persegi.getPerimeter());
    }
}

