package io;

import domain.Rectangle;

public class Output {
    public void printSquareFeetAndSquareMeter(Rectangle rectangle) {
        System.out.println("You entered dimensions of " + rectangle.getLength() + "feet by" + rectangle.getWidth());
        System.out.println("The area is");
        System.out.println(rectangle.squareFeetCalculator() + " square feet");
        System.out.println(convertTo2ndDecimalPoint(rectangle.squareMeterCalculator()) + " square meters");
    }
    private double convertTo2ndDecimalPoint(double pureSquareMeter) {
        return Math.round(pureSquareMeter*10000)/1000.0;
    }
}
