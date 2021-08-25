/*
 * Intellinet Beratung und Technologie GmbH
 */

package de.intellinet.ausbildung.simpleCalc;

/**
 * [TODO Insert description here.]
 * 
 * @author ahmalk
 *
 * @since 19.09.2019
 */
public class Main {

    /**
     * TODO Comment
     * 
     * @param args
     */
    public static void main(String[] args) {

        AnotherCalc calc = new AnotherCalc(4, 2);

        int result = calc.add();
        System.out.println(result);

        calc.setx(2);
        calc.sety(8);

        result = calc.mul();
        System.out.println("mul " + result);

        result = calc.div();
        System.out.println("div " + result);

        result = calc.sub();
        System.out.println("sub " + result);

        result = calc.add();
        System.out.println("add " + result);
        System.out.println("---------------------------- ");

        double result4 = A.add(10.5, 5.6);
        System.out.println("add " + result4);
        float result5 = A.add(16.9f, 5.6f);
        System.out.println("add " + result5);
        int result2 = A.sub(10, 5);
        System.out.println("sub " + result2);
        result2 = A.div(10, 5);
        System.out.println("div " + result2);
        result2 = A.mul(10, 5);
        System.out.println("mul " + result2);

        A.getY();
        System.out.println(A.getY());
        A.setY(22);
        System.out.println(A.getY());
        System.out.println("---------------------------- ");

        MOver mo = new MOver();

        int r1 = mo.add(10, 5);
        int r2 = mo.add(75);

        System.out.println(r1);
        System.out.println(r2);

    }
}
