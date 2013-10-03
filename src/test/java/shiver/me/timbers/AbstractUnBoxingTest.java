package shiver.me.timbers;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;

import static java.lang.reflect.Array.newInstance;
import static org.junit.Assert.assertNull;
import static shiver.me.timbers.AutoBoxing.deepAutoBox;

/**
 * An abstract class that can be implemented to run tests against the {@link AutoBoxing#deepAutoBox(Class, Object)}
 * method with arrays of different primitive types.
 *
 * @author Karl Bennett
 */
public abstract class AbstractUnBoxingTest<P, T> {

    private static Object[] objectToArray(Object object) {

        final int length = Array.getLength(object);

        final Object[] array = new Object[length];

        for (int i = 0; i < length; i++) {

            array[i] = Array.get(object, i);
        }

        return array;
    }

    private static void assertArrayEquals(String message, Object expected, Object actual) {

        Assert.assertArrayEquals(message, objectToArray(expected), objectToArray(actual));
    }

    private final P primitiveArray;

    private final T[] objectArray;

    /**
     * Create a new {@code AbstractAutoBoxingTest} that will test with the supplied values.
     *
     * @param primitiveArray the one dimensional primitive array that will be used as a test value, it should be the
     *                       primitive type of the supplied one dimensional Object array.
     * @param objectArray    the one dimensional Object array that should be produced from an array of it's related
     *                       primitive type.
     */
    protected AbstractUnBoxingTest(P primitiveArray, T[] objectArray) {

        this.objectArray = objectArray;
        this.primitiveArray = primitiveArray;
    }

    @Test
    public void testCreate() {

        new AutoBoxing();
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testAutoBoxWithArray() {

        assertArrayEquals("primitive array should be correct", primitiveArray,
                deepAutoBox((Class<Object[]>) primitiveArray.getClass(), objectArray));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testAutoBoxWithEmptyArray() {

        assertArrayEquals("empty primitive array should be correct", newInstance(primitiveArray.getClass(), 0),
                deepAutoBox((Class<Object[]>) primitiveArray.getClass(), newInstance(objectArray.getClass(), 0)));
    }

    @Test
    public void testAutoBoxWithNullArray() {

        assertNull("null 1D array should be null", deepAutoBox(objectArray.getClass(), null));
    }
}
