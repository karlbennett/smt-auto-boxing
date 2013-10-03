package shiver.me.timbers;

import static shiver.me.timbers.Constants.FLOATS_2D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingFloat2DArrayTest extends AbstractAutoBoxingTest<Float[], float[][]> {

    public AutoBoxingFloat2DArrayTest() {
        super(FLOAT_OBJECTS_2D, FLOATS_2D);
    }
}
