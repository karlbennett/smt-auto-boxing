package shiver.me.timbers;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static shiver.me.timbers.AutoBoxing.deepAutoBox;
import static shiver.me.timbers.Constants.*;

/**
 * @author Karl Bennett
 */
public class UnevenByteArrayTest {


    @Test
    @SuppressWarnings("unchecked")
    public void testAutoBoxWithUneven2DByteArrayArray() {

        assertArrayEquals("uneven 2D byte object array should be correct", UNEVEN_BYTE_OBJECTS_2D,
                deepAutoBox(UNEVEN_BYTE_OBJECTS_2D.getClass(), UNEVEN_BYTES_2D));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testAutoBoxWithUneven3DByteArrayArray() {

        assertArrayEquals("uneven 3D byte object array should be correct", UNEVEN_BYTE_OBJECTS_3D,
                deepAutoBox(UNEVEN_BYTE_OBJECTS_3D.getClass(), UNEVEN_BYTES_3D));
    }
}
