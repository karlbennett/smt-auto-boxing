package shiver.me.timbers;

import static shiver.me.timbers.Constants.DOUBLES_3D;
import static shiver.me.timbers.Constants.DOUBLE_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingDouble3DArrayTest extends AbstractAutoBoxingTest<Double[][], double[][][]> {

    public AutoBoxingDouble3DArrayTest() {
        super(DOUBLE_OBJECTS_3D, DOUBLES_3D);
    }
}
