package shiver.me.timbers;

import static shiver.me.timbers.Constants.SHORTS_3D;
import static shiver.me.timbers.Constants.SHORT_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingShort3DArrayTest extends AbstractAutoBoxingTest<Short[][], short[][][]> {

    public AutoBoxingShort3DArrayTest() {
        super(SHORT_OBJECTS_3D, SHORTS_3D);
    }
}
