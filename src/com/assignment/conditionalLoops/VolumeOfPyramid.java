package com.assignment.conditionalLoops;

import java.util.Scanner;

public class VolumeOfPyramid {
    private static double volume;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter base");
        double base = in.nextDouble();
        System.out.println("Enter height");
        double height = in.nextDouble();
        double volume = ((double) 1 / 3) * (base * height);
        System.out.println(volume);
    }
}
