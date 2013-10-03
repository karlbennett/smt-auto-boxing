package shiver.me.timbers;

import static shiver.me.timbers.Constants.INTEGER_OBJECTS_3D;
import static shiver.me.timbers.Constants.INTS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingInt3DArrayTest extends AbstractAutoBoxingTest<Integer[][], int[][][]> {

    public AutoBoxingInt3DArrayTest() {
        super(INTEGER_OBJECTS_3D, INTS_3D);
    }
}
