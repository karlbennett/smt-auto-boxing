package shiver.me.timbers;

import static shiver.me.timbers.Constants.BYTES_3D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingByteObject3DArrayTest extends AbstractUnBoxingTest<byte[][][], Byte[][]> {

    public UnBoxingByteObject3DArrayTest() {
        super(BYTES_3D, BYTE_OBJECTS_3D);
    }
}
