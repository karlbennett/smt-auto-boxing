package shiver.me.timbers;

import static shiver.me.timbers.Constants.FLOATS_3D;
import static shiver.me.timbers.Constants.FLOAT_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingFloat3DArrayTest extends AbstractAutoBoxingTest<Float[][], float[][][]> {

    public AutoBoxingFloat3DArrayTest() {
        super(FLOAT_OBJECTS_3D, FLOATS_3D);
    }
}
