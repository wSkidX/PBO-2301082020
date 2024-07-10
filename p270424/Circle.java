/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_2301082020.p270424;

/**
 *
 * @author Administrator
 */

class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    // Method tambahan untuk mendapatkan diameter
    public float getDiameter() {
        return 2 * radius;
    }
}