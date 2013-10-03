package shiver.me.timbers;

import static java.lang.reflect.Array.get;
import static java.lang.reflect.Array.getLength;
import static java.lang.reflect.Array.newInstance;
import static java.lang.reflect.Array.set;

/**
 * A utility class that contains helper methods for boxing and unboxing arrays and collections.
 *
 * @author Karl Bennett
 */
public class AutoBoxing {

    AutoBoxing() {
    }

    /**
     * Check that the supplied object is an array.
     *
     * @param object the object to check.
     * @return {@code true} if the object is an array, otherwise {@code false}.
     */
    private static boolean isArray(Object object) {

        return null != object && object.getClass().isArray();
    }

    /**
     * This private method contains the dimension inspection logic.
     *
     * @param array the array to check.
     * @return the number of dimensions in the supplied array.
     */
    private static int getDimensionNumber(Object array) {

        if (null == array || !array.getClass().isArray()) return 0;

        return array.getClass().getName().split("\\[").length - 1;
    }

    /**
     * The recursive deep autobox method that is initialised in the {@link #deepAutoBox(Class, Object)} method.
     *
     * @param type           the base type of the array to convert into e.g. {@code Byte.class}, {@code Char.class},
     *                       {@code Long.class}...
     * @param array          the array to autobox.
     * @param autoBoxedArray the array that will hold the autoboxed values.
     * @param index          the index of the current element that is being autoboxed.
     * @param <T>            the generic array type.
     * @return the new array containing the autoboxed values.
     */
    @SuppressWarnings("unchecked")
    private static <T> T deepAutoBox(Class type, Object array, T autoBoxedArray, int index) {

        if (index >= getLength(array)) return autoBoxedArray;

        Object element = get(array, index);

        if (isArray(element)) {

            int[] dimensions = new int[getDimensionNumber(element)];
            dimensions[0] = getLength(element);

            set(
                    autoBoxedArray,
                    index,
                    deepAutoBox(type, element, (T) newInstance(type, dimensions), 0)
            );

        } else {

            set(autoBoxedArray, index, element);
        }

        return deepAutoBox(type, array, autoBoxedArray, ++index);
    }

    /**
     * Autobox a primitive array into an equivalent array of the primitives wrapper objects. This method works on arrays
     * with any number of dimensions.
     *
     * @param arrayType the type of the array to convert into. This should be the array type, that is for a 3D
     *                  {@link Byte} array the value should be {@code Byte[][][].class}.
     * @param array     the array to autobox.
     * @param <T>       the generic array type.
     * @return the new array containing the autoboxed values.
     */
    @SuppressWarnings("unchecked")
    public static <T> T deepAutoBox(Class<T> arrayType, Object array) {

        if (null == array) return null;

        int length = getLength(array);

        Class type = arrayType;

        // Get the base type of the array.
        while (type.isArray()) {

            type = type.getComponentType();
        }

        T autoBoxedArray = (T) newInstance(arrayType.getComponentType(), length);

        if (0 >= length) return autoBoxedArray;

        return deepAutoBox(type, array, autoBoxedArray, 0);
    }
}
