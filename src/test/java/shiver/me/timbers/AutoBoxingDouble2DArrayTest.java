package shiver.me.timbers;

import static shiver.me.timbers.Constants.DOUBLES_2D;
import static shiver.me.timbers.Constants.DOUBLE_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingDouble2DArrayTest extends AbstractAutoBoxingTest<Double[], double[][]> {

    public AutoBoxingDouble2DArrayTest() {
        super(DOUBLE_OBJECTS_2D, DOUBLES_2D);
    }
}
