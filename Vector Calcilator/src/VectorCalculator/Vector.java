package VectorCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) {
        lenght(x, y, z);
        scalarProduct(x, y, z);
        int[] vector = {x, y, z};
        int[] doubleVector = {5, 6, 10};
        int cosinuse = ((vector[0] * doubleVector[0]) + (vector[1] * doubleVector[1]) + ((vector[2] * doubleVector[2]))/2);
        System.out.println("Векторное произведение " + cosinuse);

    }

    public Vector(int x, int y) {
        lenght(x, y, z);
        scalarProduct(x, y, z);
        int[] vector = {x, y, z};
        int[] doubleVector = {5, 6,};
        int cosinuse = ((vector[0] * doubleVector[0]) + (vector[1] * doubleVector[1])/2);
        System.out.println("Векторное произведение " + cosinuse);
    }

    public static void lenght(int x, int y, int z) {
        int lenght = (int) Math.sqrt((x * x) + (y * y) + (z * z));
        System.out.println("Длина вектора " + lenght);
    }

    public static void scalarProduct(int x, int y, int z) {
        int doubleX = 5;
        int doubleY = 6;
        int doubleZ = 10;
        System.out.println("Скалярное произведение: " + (x * doubleX) + (y * doubleY) + (z * doubleZ));
    }

    public static void vectorProduct(int x, int y, int z) {

    }
}