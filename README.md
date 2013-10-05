smt-auto-boxing
===========

A library to help with boxing and unboxing Java arrays.

Usage:
```java
int[][] primativeArray = {
    {1, 2, 3},
    {4},
    {5, 6}
};

Integer[][] objectArray = AutoBoxing.deepAutoBox(Integer[][].class, primativeArray);

primativeArray = AutoBoxing.deepAutoBox(int[][].class, objectArray);
```
