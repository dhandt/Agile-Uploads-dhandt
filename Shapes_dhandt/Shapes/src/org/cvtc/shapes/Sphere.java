package org.cvtc.shapes;

import javax.swing.*;

public class Sphere extends Shape {
//Instantiate variables
    private float radius = 0.0f;
    private float height = 0.0f;
//getter and setter for Radius
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
//Create generic Sphere when called
    public Sphere(float radius) {
        setRadius(radius);
    }
//Stuff from Shape Class
    @Override
    public float surfaceArea() {
        return (float) (4*Math.PI*(radius*radius));
    }

    @Override
    public float volume() {
        return (float) (Math.PI * (Math.pow(radius, 3)) * (4.0/3.0));
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null, "SPHERE\n" + "Radius = " + radius + "\nSurface Area = " + surfaceArea() + "\nVolume = " + volume());
    }
}
