package shiver.me.timbers;

import static shiver.me.timbers.Constants.LONGS_3D;
import static shiver.me.timbers.Constants.LONG_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingLong3DArrayTest extends AbstractAutoBoxingTest<Long[][], long[][][]> {

    public AutoBoxingLong3DArrayTest() {
        super(LONG_OBJECTS_3D, LONGS_3D);
    }
}
