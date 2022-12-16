package org.example;

import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {

        Scanner getLength, getWidth, getHeight;
        double length, width, height;
        double gallonsNeeded;
        double gallon = 350;
        double surfaceArea;
        double numberOfBuckets;

        getLength = new Scanner(System.in);
        System.out.println("Enter the Length of the room");
        length = getLength.nextDouble();
        getWidth = new Scanner(System.in);
        System.out.println("Enter the width of the room");
        width = getWidth.nextDouble();
        getHeight = new Scanner(System.in);
        System.out.println("Enter the height of the room");
        height = getHeight.nextDouble();

        surfaceArea = Calculate.calculateSurfaceArea(length, width, height);
        gallonsNeeded = Calculate.calculateGallons(gallon, surfaceArea);
        gallonsNeeded = Double.parseDouble(String.format("%.2f", gallonsNeeded));
        System.out.println("Your surface area is: " + surfaceArea + " meters");
        Calculate.calculateBucketsAndPrice(gallonsNeeded);




    }
}