/**
 * @name        Arctangent of an angle in degrees
 * @package     calculator.operators
 * @file        TanOperator.java
 * @description 
 */

package calculator.operators;

/**
 *
 * @author jorge
 */
public class AtanOperator implements UnaryOperator{
    @Override
    public Double execute(Double num) {
        return Math.toDegrees(Math.atan(num));
    }
}
