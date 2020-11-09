package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        // float and double are more precise numbers
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f; //if you leave "f" out it will be recognized as a double
        // Adding "float" will convert the number to a float which is "casting". The original
        // example has the values of: int=5, float=5.25, double=5.25d
        // Example 2: The values used are int=5/2, float=5f/2f, double=5d/2d
        // As a result you will see that the int will say because it cannot handle decimals

        double myDoubleValue = 5.000 / 3.00; // You can also add decimals as an alternative to adding "d"
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);
        // Double is used a lot in code because it's more precise and processes faster in modern chips today


        // Challenge: Convert a given number of pounds to kilograms
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        // BigDecimal is better than floating and double numbers when it comes to
        // required precise calculations. It's not a Java limitation
        // but how the numbers are stored.


    }
}
