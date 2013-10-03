package shiver.me.timbers;

import static shiver.me.timbers.Constants.LONGS_3D;
import static shiver.me.timbers.Constants.LONG_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingLongObject3DArrayTest extends AbstractUnBoxingTest<long[][][], Long[][]> {

    public UnBoxingLongObject3DArrayTest() {
        super(LONGS_3D, LONG_OBJECTS_3D);
    }
}
