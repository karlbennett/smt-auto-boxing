package shiver.me.timbers;

import static shiver.me.timbers.Constants.CHARACTER_OBJECTS_3D;
import static shiver.me.timbers.Constants.CHARS_3D;

/**
 * @author Karl Bennett
 */
public class UnBoxingCharacterObject3DArrayTest extends AbstractUnBoxingTest<char[][][], Character[][]> {

    public UnBoxingCharacterObject3DArrayTest() {
        super(CHARS_3D, CHARACTER_OBJECTS_3D);
    }
}
