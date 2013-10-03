package shiver.me.timbers;

import org.junit.Test;

import static java.lang.reflect.Array.newInstance;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNull;
import static shiver.me.timbers.AutoBoxing.deepAutoBox;

/**
 * An abstract class that can be implemented to run tests against the {@link shiver.me.timbers.AutoBoxing#deepAutoBox(Class, Object)}
 * method with arrays of different primitive types.
 *
 * @author Karl Bennett
 */
public abstract class AbstractAutoBoxingTest<T, P> {

    private final T[] objectArray;

    private final P primitiveArray;

    /**
     * Create a new {@code AbstractAutoBoxingTest} that will test with the supplied values.
     *
     * @param objectArray    the one dimensional Object array that should be produced from an array of it's related
     *                       primitive type.
     * @param primitiveArray the one dimensional primitive array that will be used as a test value, it should be the
     *                       primitive type of the supplied one dimensional Object array.
     */
    protected AbstractAutoBoxingTest(T[] objectArray, P primitiveArray) {

        this.objectArray = objectArray;
        this.primitiveArray = primitiveArray;
    }

    @Test
    public void testCreate() {

        new AutoBoxing();
    }

    @Test
    public void testAutoBoxWithArray() {

        assertArrayEquals("object array should be correct", objectArray,
                deepAutoBox(objectArray.getClass(), primitiveArray));
    }

    @Test
    @SuppressWarnings("unchecked")
    public void testAutoBoxWithEmptyArray() {

        assertArrayEquals("empty object array should be correct", (T[]) newInstance(objectArray.getClass(), 0),
                deepAutoBox((Class<T[]>) objectArray.getClass(), newInstance(primitiveArray.getClass(), 0)));
    }

    @Test(expected = NullPointerException.class)
    public void testAutoBoxWithNullClass() {

        assertNull("null 1D array should be null", deepAutoBox(null, primitiveArray));
    }

    @Test
    public void testAutoBoxWithNullArray() {

        assertNull("null 1D array should be null", deepAutoBox(objectArray.getClass(), null));
    }
}
