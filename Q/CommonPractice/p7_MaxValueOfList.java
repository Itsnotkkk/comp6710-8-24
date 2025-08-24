import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/*
 * Copyright (c) 2025, Henghuan Li
 * All rights reserved.
 *
 * This code is written for COMP6710 Functional Java practices.
 * Redistribution or use without permission is prohibited.
 */


/**
 * Finds the maximum integer value in the given ConsList<Integer>.
 * <p>
 * If the list is empty, this method should throw an IllegalArgumentException.
 *
 * Examples:
 *  given: MaxValueOfList([1, 5, 3, 2])
 *  expects: 5
 *
 *  given: MaxValueOfList([-10, -5, -20])
 *  expects: -5
 *
 *  given: MaxValueOfList([42])
 *  expects: 42
 *
 * @param conslist the list of integers; must be non-empty
 * @return the maximum integer value contained in the list
 */

int MaxValueOfList(ConsList<Integer> conslist){


}



void main(){
    test();
}
// MaxValueOfListTests

/**
 * List: [1, 5, 3, 2]
 * Expected: 5
 */
void MaxValueOfListTest1() {
    testEqual(5, MaxValueOfList(MakeList(1, 5, 3, 2)));
}

/**
 * List: [-10, -5, -20]
 * Expected: -5
 */
void MaxValueOfListTest2() {
    testEqual(-5, MaxValueOfList(MakeList(-10, -5, -20)));
}

/**
 * List: [42]
 * Expected: 42
 */
void MaxValueOfListTest3() {
    testEqual(42, MaxValueOfList(MakeList(42)));
}



void test() {
    println("MaxValueOfListTests Start");
    runAsTest(this::MaxValueOfListTest1);
    runAsTest(this::MaxValueOfListTest2);
    runAsTest(this::MaxValueOfListTest3);
    println("MaxValueOfListTests End");
}
