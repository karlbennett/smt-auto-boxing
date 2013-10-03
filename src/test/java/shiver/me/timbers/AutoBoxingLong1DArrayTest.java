package shiver.me.timbers;

import static shiver.me.timbers.Constants.LONGS_1D;
import static shiver.me.timbers.Constants.LONG_OBJECTS_1D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingLong1DArrayTest extends AbstractAutoBoxingTest<Long, long[]> {

    public AutoBoxingLong1DArrayTest() {
        super(LONG_OBJECTS_1D, LONGS_1D);
    }
}
