package shiver.me.timbers;

import static shiver.me.timbers.Constants.BYTES_3D;
import static shiver.me.timbers.Constants.BYTE_OBJECTS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingByte3DArrayTest extends AbstractAutoBoxingTest<Byte[][], byte[][][]> {

    public AutoBoxingByte3DArrayTest() {
        super(BYTE_OBJECTS_3D, BYTES_3D);
    }
}
