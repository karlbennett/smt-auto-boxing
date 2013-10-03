package shiver.me.timbers;

import static shiver.me.timbers.Constants.INTEGER_OBJECTS_3D;
import static shiver.me.timbers.Constants.INTS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingIntegerObject3DArrayTest extends AbstractUnBoxingTest<int[][][], Integer[][]> {

    public UnBoxingIntegerObject3DArrayTest() {
        super(INTS_3D, INTEGER_OBJECTS_3D);
    }
}
