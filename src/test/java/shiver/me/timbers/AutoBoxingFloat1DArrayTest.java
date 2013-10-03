package shiver.me.timbers;

import static shiver.me.timbers.Constants.FLOATS_1D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingFloat1DArrayTest extends AbstractAutoBoxingTest<Float, float[]> {

    public AutoBoxingFloat1DArrayTest() {
        super(FLOAT_OBJECTS_1D, FLOATS_1D);
    }
}
