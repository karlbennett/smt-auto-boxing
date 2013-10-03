package shiver.me.timbers;

import static shiver.me.timbers.Constants.CHARACTER_OBJECTS_3D;
import static shiver.me.timbers.Constants.CHARS_3D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingChar3DArrayTest extends AbstractAutoBoxingTest<Character[][], char[][][]> {

    public AutoBoxingChar3DArrayTest() {
        super(CHARACTER_OBJECTS_3D, CHARS_3D);
    }
}
