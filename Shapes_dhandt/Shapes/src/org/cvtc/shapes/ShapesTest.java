package org.cvtc.shapes;

public class ShapesTest {

    public static void main(String[] args) {
//Create one of each shape (with hard-coded measurement for simplicity)
        Cuboid cuboid = new Cuboid(10, 15, 5);
        Cylinder cylinder = new Cylinder(10, 5);
        Sphere sphere = new Sphere(5);
//Call render method on each to show all attributes in separate dialog boxes
        cuboid.render();
        cylinder.render();
        sphere.render();
    }

}
