package org.example;

public class Calculate {

    public static double calculateSurfaceArea(double length, double width, double height) {
        double surfaceArea;

        surfaceArea = 2 * ((length * width) + (height * width) + (length * height));
        return surfaceArea;
    }
    public static double calculateGallons(double gallon, double surfaceArea) {

        return surfaceArea / gallon;
    }
    public static void calculateBucketsAndPrice(double gallonsNeeded) {

        int gallon = 350;
        int gallonBuckets;
        int quarterGallonBuckets;
        double gallonBucketPrice = 29.99;
        double quarterGallonBucketPrice = 9.99;
        double price;
       gallonBuckets = (int) (gallonsNeeded);
       quarterGallonBuckets = (int) Math.ceil(gallonsNeeded % gallon);
       System.out.println("you need " + gallonBuckets + " gallon buckets and " + quarterGallonBuckets + " quarter gallon buckets");
       price = (gallonBucketPrice * gallonBuckets) + (quarterGallonBucketPrice + quarterGallonBuckets);
       System.out.println("The price is £" + price);

    }


}


