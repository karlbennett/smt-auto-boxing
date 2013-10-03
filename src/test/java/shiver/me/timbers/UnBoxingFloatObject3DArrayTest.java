package shiver.me.timbers;

import static shiver.me.timbers.Constants.FLOATS_3D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingFloatObject3DArrayTest extends AbstractUnBoxingTest<float[][][], Float[][]> {

    public UnBoxingFloatObject3DArrayTest() {
        super(FLOATS_3D, FLOAT_OBJECTS_3D);
    }
}
