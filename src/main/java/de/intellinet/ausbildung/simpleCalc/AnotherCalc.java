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
public class AnotherCalc extends SimpleCalc {

    public AnotherCalc() {
        super();
    }

    public AnotherCalc(int a, int b) {
        super(a, b);
    }

    public int mul() {
        return this.getx() * this.gety();
    }

    public int div() {

        int y = this.gety();
        if (y == 0)
            return 0;
        return this.getx() / y;

    }
}
