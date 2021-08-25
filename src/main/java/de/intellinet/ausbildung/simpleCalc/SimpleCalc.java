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
public class SimpleCalc {

    private int x;
    private int y;

    public SimpleCalc() {
        this.x = 0;
        this.y = 0;
        return;
    }

    public SimpleCalc(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public int add() {
        return this.x + this.y;

    }

    public int sub() {
        return this.x - this.y;
    }

    public void setx(int a) {
        this.x = a;
    }

    public void sety(int a) {
        this.x = a;
    }

    public int getx() {
        return this.x;
    }

    public int gety() {
        return this.y;
    }

}
