/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p270424;

/**
 *
 * @author Administrator
 */
class Square extends Shape {
    private float side;

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public String getName() {
        return "Square";
    }

    @Override
    public float getArea() {
        return side * side;
    }

    // Method tambahan untuk mendapatkan keliling
    public float getPerimeter() {
        return 4 * side;
    }
}
