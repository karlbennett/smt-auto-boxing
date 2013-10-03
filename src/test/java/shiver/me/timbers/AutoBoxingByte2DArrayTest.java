package shiver.me.timbers;

import static shiver.me.timbers.Constants.BYTES_2D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingByte2DArrayTest extends AbstractAutoBoxingTest<Byte[], byte[][]> {

    public AutoBoxingByte2DArrayTest() {
        super(BYTE_OBJECTS_2D, BYTES_2D);
    }
}
