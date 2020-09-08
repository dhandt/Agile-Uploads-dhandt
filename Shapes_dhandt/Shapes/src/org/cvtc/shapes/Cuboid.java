package org.cvtc.shapes;

import javax.swing.*;

public class Cuboid extends Shape {
// Instantiate variables
    private float width = 0.0f;
    private float height = 0.0f;
    private float depth = 0.0f;
//Create getters and setters for Width Depth and Height
    public float getWidth() {
        return width;
    }
    private  void setWidth(float width){
        this.width = width;
    }

    public float getHeight() {
        return height;
    }
    private  void setHeight(float height){
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }
    private  void setDepth(float depth){
        this.depth = depth;
    }
// make generic Cuboid when called
    public Cuboid(float width, float height, float depth) {
        setHeight(height);
        setWidth(width);
        setDepth(depth);
    }
//Stuff from Shape Class
    //@Override
    public float surfaceArea() {
        return (width*2 + height*2 + depth*2);
    }

    @Override
    public float volume() {
        return (width * depth * height);
    }

    @Override
    public void render() {
        JOptionPane.showMessageDialog(null,"CUBOID\n" + "Height = " + height + "\nWidth = " + width +
                                        "\nDepth = " + depth + "\nsurfaceArea = " + surfaceArea() + "\nvolume = " + volume() );
    }
}
