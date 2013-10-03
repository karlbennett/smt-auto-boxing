package shiver.me.timbers;

import static shiver.me.timbers.Constants.DOUBLES_1D;
import static shiver.me.timbers.Constants.DOUBLE_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingDouble1DArrayTest extends AbstractAutoBoxingTest<Double, double[]> {

    public AutoBoxingDouble1DArrayTest() {
        super(DOUBLE_OBJECTS_1D, DOUBLES_1D);
    }
}
