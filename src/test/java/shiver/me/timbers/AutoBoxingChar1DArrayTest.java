package shiver.me.timbers;

import static shiver.me.timbers.Constants.CHARACTER_OBJECTS_1D;
import static shiver.me.timbers.Constants.CHARS_1D;

/**
 * @author Karl Bennett
 */
public class AutoBoxingChar1DArrayTest extends AbstractAutoBoxingTest<Character, char[]> {

    public AutoBoxingChar1DArrayTest() {
        super(CHARACTER_OBJECTS_1D, CHARS_1D);
    }
}
