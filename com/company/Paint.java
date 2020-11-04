package com.company;

import java.util.ArrayList;

public class Paint {

private ArrayList<Circle> circles;
private ArrayList<Triangle>triangles;
private ArrayList<Rectangle>rectangles;

    /**
     * take memory for arrays
     */
    public Paint(){
         circles = new ArrayList<>();
         triangles =new ArrayList<>();
         rectangles = new ArrayList<>();
     }
    /**
     * add  a triangle to the list of triangles
     * @param triangle the given triangle
     */

    public void addTriangle(Triangle triangle){
        triangles.add(triangle);

    }

    /**
     * add  a rectangle to the list of rectangles
     * @param rectangle the given triangles
     */

    public void addRectangle(Rectangle rectangle){
        rectangles.add(rectangle);

    }

    /**
     * add a circle to the array circles
     * @param circle the given circle
     */
    public void addCircle(Circle circle){
            circles.add(circle);
    }

    /**
     * Draw circles and rectangles and triangles
     */
    public void drawAll(){
         for (int i=0 ; i<circles.size();i++)
             circles.get(i).draw();

         for(int i = 0 ; i<triangles.size();i++)
             triangles.get(i).draw();

         for (int i=0 ; i<rectangles.size();i++)
             rectangles.get(i).draw();
    }
    /**
     * print all the circles and triangles and rectangles
     */
    public void  printAll(){

        for (int i = 0; i < circles.size(); i++)
            System.out.println(circles.get(i).toString());
        for(int i = 0; i < triangles.size(); i++)
            System.out.println(triangles.get(i).toString());
        for (int i = 0; i < rectangles.size(); i++)
            System.out.println(rectangles.get(i).toString());
    }
}

