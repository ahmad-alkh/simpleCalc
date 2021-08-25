/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.simpleCalc;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 20.09.2019
 */
public class A {

    public int x;
    private static int y = 10;

    public static int add(int a, int b) {

        return a + b;

    }

    public static double add(double a, double b) {

        return a + b;

    }

    public static float add(float a, float b) {

        return a + b;
    }
    // OverLading

    public static float sub(float a, float b) {
        return a - b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static float mul(float a, float b) {
        return a * b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0)
            return 0;
        return a / b;
    }

    public static double div(double a, double b) {
        if (b == 0)
            return 0;
        return a / b;
    }

    public static float div(float a, float b) {
        if (b == 0)
            return 0;
        return a / b;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        A.y = y;
    }

}
