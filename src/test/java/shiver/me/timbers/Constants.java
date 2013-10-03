package shiver.me.timbers;

/**
 * Test values.
 *
 * @author Karl Bennett
 */
public class Constants {

    Constants() {
    }

    public static final byte[][][] BYTES_3D = {
            {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            },
            {
                    {10, 11, 12},
                    {13, 14, 15},
                    {16, 17, 18}
            },
            {
                    {19, 20, 21},
                    {22, 23, 24},
                    {25, 26, 27}
            }
    };

    public static final byte[][][] UNEVEN_BYTES_3D = {
            {
                    {BYTES_3D[0][0][0]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1]},
                    {BYTES_3D[2][2][0]}
            }
    };

    public static final byte[][] BYTES_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final byte[][] UNEVEN_BYTES_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1]}
    };

    public static final byte[] BYTES_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Byte[][][] BYTE_OBJECTS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final Byte[][][] UNEVEN_BYTE_OBJECTS_3D = {
            {
                    {BYTES_3D[0][0][0]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1]},
                    {BYTES_3D[2][2][0]}
            }
    };

    public static final Byte[][] BYTE_OBJECTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final Byte[][] UNEVEN_BYTE_OBJECTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1]}
    };

    public static final Byte[] BYTE_OBJECTS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final char[][][] CHARS_3D = {
            {
                    {'a', 'b', 'c'},
                    {'d', 'e', 'f'},
                    {'g', 'h', 'i'}
            },
            {
                    {'j', 'k', 'l'},
                    {'m', 'n', 'o'},
                    {'p', 'q', 'r'}
            },
            {
                    {'s', 't', 'u'},
                    {'v', 'w', 'x'},
                    {'y', 'z', '0'}
            }
    };

    public static final char[][] CHARS_2D = {
            {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]},
            {CHARS_3D[0][1][0], CHARS_3D[0][1][1], CHARS_3D[0][1][2]},
            {CHARS_3D[0][2][0], CHARS_3D[0][2][1], CHARS_3D[0][2][2]}
    };

    public static final char[] CHARS_1D = {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]};

    public static final Character[][][] CHARACTER_OBJECTS_3D = {
            {
                    {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]},
                    {CHARS_3D[0][1][0], CHARS_3D[0][1][1], CHARS_3D[0][1][2]},
                    {CHARS_3D[0][2][0], CHARS_3D[0][2][1], CHARS_3D[0][2][2]}
            },
            {
                    {CHARS_3D[1][0][0], CHARS_3D[1][0][1], CHARS_3D[1][0][2]},
                    {CHARS_3D[1][1][0], CHARS_3D[1][1][1], CHARS_3D[1][1][2]},
                    {CHARS_3D[1][2][0], CHARS_3D[1][2][1], CHARS_3D[1][2][2]}
            },
            {
                    {CHARS_3D[2][0][0], CHARS_3D[2][0][1], CHARS_3D[2][0][2]},
                    {CHARS_3D[2][1][0], CHARS_3D[2][1][1], CHARS_3D[2][1][2]},
                    {CHARS_3D[2][2][0], CHARS_3D[2][2][1], CHARS_3D[2][2][2]}
            }
    };

    public static final Character[][] CHARACTER_OBJECTS_2D = {
            {CHARS_3D[0][0][0], CHARS_3D[0][0][1],CHARS_3D[0][0][2]},
            {CHARS_3D[0][1][0], CHARS_3D[0][1][1],CHARS_3D[0][1][2]},
            {CHARS_3D[0][2][0], CHARS_3D[0][2][1],CHARS_3D[0][2][2]}
    };

    public static final Character[] CHARACTER_OBJECTS_1D = {CHARS_3D[0][0][0], CHARS_3D[0][0][1], CHARS_3D[0][0][2]};

    public static final short[][][] SHORTS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final short[][] SHORTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final short[] SHORTS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Short[][][] SHORT_OBJECTS_3D = {
            {
                    {SHORTS_3D[0][0][0], SHORTS_3D[0][0][1], SHORTS_3D[0][0][2]},
                    {SHORTS_3D[0][1][0], SHORTS_3D[0][1][1], SHORTS_3D[0][1][2]},
                    {SHORTS_3D[0][2][0], SHORTS_3D[0][2][1], SHORTS_3D[0][2][2]}
            },
            {
                    {SHORTS_3D[1][0][0], SHORTS_3D[1][0][1], SHORTS_3D[1][0][2]},
                    {SHORTS_3D[1][1][0], SHORTS_3D[1][1][1], SHORTS_3D[1][1][2]},
                    {SHORTS_3D[1][2][0], SHORTS_3D[1][2][1], SHORTS_3D[1][2][2]}
            },
            {
                    {SHORTS_3D[2][0][0], SHORTS_3D[2][0][1], SHORTS_3D[2][0][2]},
                    {SHORTS_3D[2][1][0], SHORTS_3D[2][1][1], SHORTS_3D[2][1][2]},
                    {SHORTS_3D[2][2][0], SHORTS_3D[2][2][1], SHORTS_3D[2][2][2]}
            }
    };

    public static final Short[][] SHORT_OBJECTS_2D = {
            {SHORTS_3D[0][0][0], SHORTS_3D[0][0][1], SHORTS_3D[0][0][2]},
            {SHORTS_3D[0][1][0], SHORTS_3D[0][1][1], SHORTS_3D[0][1][2]},
            {SHORTS_3D[0][2][0], SHORTS_3D[0][2][1], SHORTS_3D[0][2][2]}
    };

    public static final Short[] SHORT_OBJECTS_1D = {SHORTS_3D[0][0][0], SHORTS_3D[0][0][1], SHORTS_3D[0][0][2]};

    public static final int[][][] INTS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final int[][] INTS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final int[] INTS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Integer[][][] INTEGER_OBJECTS_3D = {
            {
                    {INTS_3D[0][0][0], INTS_3D[0][0][1], INTS_3D[0][0][2]},
                    {INTS_3D[0][1][0], INTS_3D[0][1][1], INTS_3D[0][1][2]},
                    {INTS_3D[0][2][0], INTS_3D[0][2][1], INTS_3D[0][2][2]}
            },
            {
                    {INTS_3D[1][0][0], INTS_3D[1][0][1], INTS_3D[1][0][2]},
                    {INTS_3D[1][1][0], INTS_3D[1][1][1], INTS_3D[1][1][2]},
                    {INTS_3D[1][2][0], INTS_3D[1][2][1], INTS_3D[1][2][2]}
            },
            {
                    {INTS_3D[2][0][0], INTS_3D[2][0][1], INTS_3D[2][0][2]},
                    {INTS_3D[2][1][0], INTS_3D[2][1][1], INTS_3D[2][1][2]},
                    {INTS_3D[2][2][0], INTS_3D[2][2][1], INTS_3D[2][2][2]}
            }
    };

    public static final Integer[][] INTEGER_OBJECTS_2D = {
            {INTS_3D[0][0][0], INTS_3D[0][0][1], INTS_3D[0][0][2]},
            {INTS_3D[0][1][0], INTS_3D[0][1][1], INTS_3D[0][1][2]},
            {INTS_3D[0][2][0], INTS_3D[0][2][1], INTS_3D[0][2][2]}
    };

    public static final Integer[] INTEGER_OBJECTS_1D = {INTS_3D[0][0][0], INTS_3D[0][0][1], INTS_3D[0][0][2]};

    public static final long[][][] LONGS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final long[][] LONGS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final long[] LONGS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Long[][][] LONG_OBJECTS_3D = {
            {
                    {LONGS_3D[0][0][0], LONGS_3D[0][0][1], LONGS_3D[0][0][2]},
                    {LONGS_3D[0][1][0], LONGS_3D[0][1][1], LONGS_3D[0][1][2]},
                    {LONGS_3D[0][2][0], LONGS_3D[0][2][1], LONGS_3D[0][2][2]}
            },
            {
                    {LONGS_3D[1][0][0], LONGS_3D[1][0][1], LONGS_3D[1][0][2]},
                    {LONGS_3D[1][1][0], LONGS_3D[1][1][1], LONGS_3D[1][1][2]},
                    {LONGS_3D[1][2][0], LONGS_3D[1][2][1], LONGS_3D[1][2][2]}
            },
            {
                    {LONGS_3D[2][0][0], LONGS_3D[2][0][1], LONGS_3D[2][0][2]},
                    {LONGS_3D[2][1][0], LONGS_3D[2][1][1], LONGS_3D[2][1][2]},
                    {LONGS_3D[2][2][0], LONGS_3D[2][2][1], LONGS_3D[2][2][2]}
            }
    };

    public static final Long[][] LONG_OBJECTS_2D = {
            {LONGS_3D[0][0][0], LONGS_3D[0][0][1], LONGS_3D[0][0][2]},
            {LONGS_3D[0][1][0], LONGS_3D[0][1][1], LONGS_3D[0][1][2]},
            {LONGS_3D[0][2][0], LONGS_3D[0][2][1], LONGS_3D[0][2][2]}
    };

    public static final Long[] LONG_OBJECTS_1D = {LONGS_3D[0][0][0], LONGS_3D[0][0][1], LONGS_3D[0][0][2]};

    public static final float[][][] FLOATS_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final float[][] FLOATS_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final float[] FLOATS_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Float[][][] FLOAT_OBJECTS_3D = {
            {
                    {FLOATS_3D[0][0][0], FLOATS_3D[0][0][1], FLOATS_3D[0][0][2]},
                    {FLOATS_3D[0][1][0], FLOATS_3D[0][1][1], FLOATS_3D[0][1][2]},
                    {FLOATS_3D[0][2][0], FLOATS_3D[0][2][1], FLOATS_3D[0][2][2]}
            },
            {
                    {FLOATS_3D[1][0][0], FLOATS_3D[1][0][1], FLOATS_3D[1][0][2]},
                    {FLOATS_3D[1][1][0], FLOATS_3D[1][1][1], FLOATS_3D[1][1][2]},
                    {FLOATS_3D[1][2][0], FLOATS_3D[1][2][1], FLOATS_3D[1][2][2]}
            },
            {
                    {FLOATS_3D[2][0][0], FLOATS_3D[2][0][1], FLOATS_3D[2][0][2]},
                    {FLOATS_3D[2][1][0], FLOATS_3D[2][1][1], FLOATS_3D[2][1][2]},
                    {FLOATS_3D[2][2][0], FLOATS_3D[2][2][1], FLOATS_3D[2][2][2]}
            }
    };

    public static final Float[][] FLOAT_OBJECTS_2D = {
            {FLOATS_3D[0][0][0], FLOATS_3D[0][0][1], FLOATS_3D[0][0][2]},
            {FLOATS_3D[0][1][0], FLOATS_3D[0][1][1], FLOATS_3D[0][1][2]},
            {FLOATS_3D[0][2][0], FLOATS_3D[0][2][1], FLOATS_3D[0][2][2]}
    };

    public static final Float[] FLOAT_OBJECTS_1D = {FLOATS_3D[0][0][0], FLOATS_3D[0][0][1], FLOATS_3D[0][0][2]};

    public static final double[][][] DOUBLES_3D = {
            {
                    {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
                    {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
                    {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
            },
            {
                    {BYTES_3D[1][0][0], BYTES_3D[1][0][1], BYTES_3D[1][0][2]},
                    {BYTES_3D[1][1][0], BYTES_3D[1][1][1], BYTES_3D[1][1][2]},
                    {BYTES_3D[1][2][0], BYTES_3D[1][2][1], BYTES_3D[1][2][2]}
            },
            {
                    {BYTES_3D[2][0][0], BYTES_3D[2][0][1], BYTES_3D[2][0][2]},
                    {BYTES_3D[2][1][0], BYTES_3D[2][1][1], BYTES_3D[2][1][2]},
                    {BYTES_3D[2][2][0], BYTES_3D[2][2][1], BYTES_3D[2][2][2]}
            }
    };

    public static final double[][] DOUBLES_2D = {
            {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]},
            {BYTES_3D[0][1][0], BYTES_3D[0][1][1], BYTES_3D[0][1][2]},
            {BYTES_3D[0][2][0], BYTES_3D[0][2][1], BYTES_3D[0][2][2]}
    };

    public static final double[] DOUBLES_1D = {BYTES_3D[0][0][0], BYTES_3D[0][0][1], BYTES_3D[0][0][2]};

    public static final Double[][][] DOUBLE_OBJECTS_3D = {
            {
                    {DOUBLES_3D[0][0][0], DOUBLES_3D[0][0][1], DOUBLES_3D[0][0][2]},
                    {DOUBLES_3D[0][1][0], DOUBLES_3D[0][1][1], DOUBLES_3D[0][1][2]},
                    {DOUBLES_3D[0][2][0], DOUBLES_3D[0][2][1], DOUBLES_3D[0][2][2]}
            },
            {
                    {DOUBLES_3D[1][0][0], DOUBLES_3D[1][0][1], DOUBLES_3D[1][0][2]},
                    {DOUBLES_3D[1][1][0], DOUBLES_3D[1][1][1], DOUBLES_3D[1][1][2]},
                    {DOUBLES_3D[1][2][0], DOUBLES_3D[1][2][1], DOUBLES_3D[1][2][2]}
            },
            {
                    {DOUBLES_3D[2][0][0], DOUBLES_3D[2][0][1], DOUBLES_3D[2][0][2]},
                    {DOUBLES_3D[2][1][0], DOUBLES_3D[2][1][1], DOUBLES_3D[2][1][2]},
                    {DOUBLES_3D[2][2][0], DOUBLES_3D[2][2][1], DOUBLES_3D[2][2][2]}
            }
    };

    public static final Double[][] DOUBLE_OBJECTS_2D = {
            {DOUBLES_3D[0][0][0], DOUBLES_3D[0][0][1], DOUBLES_3D[0][0][2]},
            {DOUBLES_3D[0][1][0], DOUBLES_3D[0][1][1], DOUBLES_3D[0][1][2]},
            {DOUBLES_3D[0][2][0], DOUBLES_3D[0][2][1], DOUBLES_3D[0][2][2]}
    };

    public static final Double[] DOUBLE_OBJECTS_1D = {DOUBLES_3D[0][0][0], DOUBLES_3D[0][0][1], DOUBLES_3D[0][0][2]};
}
