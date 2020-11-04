package com.company;

import java.util.ArrayList;

public class Rectangle {
    private ArrayList<Double> sides;

    /**
     * Create a triangle
     * @param side1 the first side
     * @param side2 the second side
     * @param side3 the third side
     * @param side4 the 4th side
     */
    public Rectangle(double side1 , double side2 ,double side3 , double side4){
        sides = new ArrayList<>();
        sides.add(side1);
        sides.add(side2);
        sides.add(side3);
        sides.add(side4);
    }

    /**
     * Get the sides of the rectangle
     * @return ArrayList of sides
     */
    public ArrayList<Double> getSides() {
        return sides;
    }

    /**
     * check if the rectangle is a square or not
     * @return true if it is square
     */
    public boolean isSquare(){
        if (sides.get(0).equals(sides.get(1)))
            return true;
        return false;
    }
    /**
     * Calculate the perimeter of the rectangle
     * @return double perimeter
     */
    public double calculatePerimeter(){
        return sides.get(0) + sides.get(1) + sides.get(2) + sides.get(3);
    }
    /**
     * Calculate the area of the rectangle
     * @return double area
     */
    public double calculateArea(){
        return sides.get(0) * sides.get(1);
    }

    /**
     * print the rectangle's area and perimeter
     */
    public void draw(){
        System.out.println(this.getClass().getName() + "    Perimeter: " + calculatePerimeter() + "   Area: " +
                calculateArea());
    }
    /**
     * check if two rectangles are equals or not
     * @param rectangle the given rectangle
     * @return boolean true if they are the same
     */
    public boolean equals(Rectangle rectangle){
        if ( (sides.get(0) == rectangle.getSides().get(0))
                && ((sides.get(1) == rectangle.getSides().get(1))))
            return true;
        return  false;
    }
    /**
     * Return the specification of the rectangle in a string
     * @return
     */
    public  String toString(){

        String str = sides.get(0).toString()
                + sides.get(1).toString();
        return  getClass().getName().concat(str);
    }
}
