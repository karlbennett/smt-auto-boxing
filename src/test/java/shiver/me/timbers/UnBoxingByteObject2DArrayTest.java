package shiver.me.timbers;

import static shiver.me.timbers.Constants.BYTES_2D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_2D;

/**
 * @author Karl Bennett
 */
public class UnBoxingByteObject2DArrayTest extends AbstractUnBoxingTest<byte[][], Byte[]> {

    public UnBoxingByteObject2DArrayTest() {
        super(BYTES_2D, BYTE_OBJECTS_2D);
    }
}
