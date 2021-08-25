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
public class MOver {

    private int x, y;

    public int add(int a, int b) {
        this.x = a;
        this.y = b;
        return this.x + this.y;

    }

    public int add(int a) {
        this.x = a;
        return this.x + this.x;
    }
}
