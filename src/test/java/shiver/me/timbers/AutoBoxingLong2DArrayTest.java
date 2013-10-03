package shiver.me.timbers;

import static shiver.me.timbers.Constants.LONGS_2D;
import static shiver.me.timbers.Constants.LONG_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingLong2DArrayTest extends AbstractAutoBoxingTest<Long[], long[][]> {

    public AutoBoxingLong2DArrayTest() {
        super(LONG_OBJECTS_2D, LONGS_2D);
    }
}
