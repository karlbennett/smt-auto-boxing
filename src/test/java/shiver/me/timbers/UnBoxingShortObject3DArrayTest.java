package shiver.me.timbers;

import static shiver.me.timbers.Constants.SHORTS_3D;
import static shiver.me.timbers.Constants.SHORT_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingShortObject3DArrayTest extends AbstractUnBoxingTest<short[][][], Short[][]> {

    public UnBoxingShortObject3DArrayTest() {
        super(SHORTS_3D, SHORT_OBJECTS_3D);
    }
}
