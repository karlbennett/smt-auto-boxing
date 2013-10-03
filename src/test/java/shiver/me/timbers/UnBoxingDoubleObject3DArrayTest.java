package shiver.me.timbers;

import static shiver.me.timbers.Constants.DOUBLES_3D;
import static shiver.me.timbers.Constants.DOUBLE_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingDoubleObject3DArrayTest extends AbstractUnBoxingTest<double[][][], Double[][]> {

    public UnBoxingDoubleObject3DArrayTest() {
        super(DOUBLES_3D, DOUBLE_OBJECTS_3D);
    }
}
