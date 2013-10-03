package shiver.me.timbers;

import static shiver.me.timbers.Constants.INTEGER_OBJECTS_1D;
import static shiver.me.timbers.Constants.INTS_1D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingInt1DArrayTest extends AbstractAutoBoxingTest<Integer, int[]> {

    public AutoBoxingInt1DArrayTest() {
        super(INTEGER_OBJECTS_1D, INTS_1D);
    }
}
