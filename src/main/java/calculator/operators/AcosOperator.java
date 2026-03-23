/**
 * @name        Arccosine of an angle in Degrees
 * @package     calculator.operators
 * @file        AcosOperator.java
 * @description 
 */

package calculator.operators;

import static java.lang.Double.NaN;

public class AcosOperator implements UnaryOperator{
    @Override
    public Double execute(Double num) {
        if (Math.abs(num) > 1 ) {
            return NaN;
        }
        return Math.toDegrees(Math.acos(num));
    }
}
