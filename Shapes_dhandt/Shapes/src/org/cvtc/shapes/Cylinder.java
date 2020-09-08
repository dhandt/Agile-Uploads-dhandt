package org.cvtc.shapes;

import javax.swing.*;

public class Cylinder extends Shape {
//Instantiate variables
    private float radius = 0.0f;
    private float height = 0.0f;
// Getters and setters for Height and Radius
    public float getRadius() {
        return radius;
    }
    private void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }
    private void setHeight(float height) {
        this.height = height;
    }
//Mka generic Cylinder when called
    public Cylinder(float radius, float height){
        setHeight(height);
        setRadius(radius);
    }
//Stuff from Shape Class
    @Override
    public float surfaceArea() {
        return (float) ((2*Math.PI*radius*height) + (2 *Math.PI*(radius*radius)));
    }

    @Override
    public float volume() {
        return (float) (Math.PI * (radius * radius) * height);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null, "CYLINDER\n" + "Radius = " + radius + "\nHeight = "
                                        + height + "\nSurface Area = " + surfaceArea() + "\nVolume = " + volume());
    }
}
