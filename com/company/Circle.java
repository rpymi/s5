package com.company;

public class Circle {





    private double radius;


    /**
     * Create a circle with the amount of radius
     * @param radius radius of the circle
     */
    public Circle(double radius){
        this.radius  = radius;
    }

    /**
     * Get the radius of the circle
     * @return double radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Calculate the perimeter of the circle
     * @return double perimeter
     */
    public double calculatePerimeter(){
        return 2 * Math.PI*(getRadius());
    }

    /**
     * Calculate the area of the circle
     * @return double area
     */
    public  double calculateArea(){
        return Math.PI * Math.pow(getRadius(),2);
    }

    /**
     * Print circle's area & perimeter
     */


    public void draw(){
        System.out.println("Circle" + "    Perimeter:  "+calculatePerimeter() +
                "   Area:  " + calculateArea() );

    }


    /**
     * Check if two circles are equal or not
     * @param circle the given circle
     * @return boolean true if they are the same
     */
    public boolean equals(Circle circle){

        return getRadius() == circle.getRadius();
    }

    /**
     * Return the specification of the circle in a string
     * @return String
     */
    public String toString(){
        double r;
        r = radius;
        String rAsString = Double.toString(r);
        return getClass().getName().concat(rAsString);
    }


}
