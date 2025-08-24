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
void main(){
    test();
}
/**
 * Creates a new ConsList<Integer> where each element is the sum of the corresponding
 * elements from the two given lists have the same Length.

 * Both input lists must have the same length.
 *
 * Examples:
 *  given: MapSum([1, 2, 3], [4, 5, 6])
 *  expects: [5, 7, 9]
 *
 *  given: MapSum([10], [20])
 *  expects: [30]
 *
 *  given: MapSum([], [])
 *  expects: []
 *
 * @param conslist1 the first list of integers; must have the same length as conslist2
 * @param conslist2 the second list of integers; must have the same length as conslist1
 * @return a new ConsList<Integer> containing the element-wise sums
 */
ConsList<Integer> MapSum(ConsList<Integer> conslist1, ConsList<Integer> conslist2) {
    // TODO implement
}


// MapSumTests

/**
 * [1, 2, 3] + [4, 5, 6] → [5, 7, 9]
 */
void MapSumTest1() {
    testEqual(
        MakeList(5, 7, 9),
        MapSum(MakeList(1, 2, 3), MakeList(4, 5, 6))
    );
}

/**
 * [10] + [20] → [30]
 */
void MapSumTest2() {
    testEqual(
        MakeList(30),
        MapSum(MakeList(10), MakeList(20))
    );
}

/**
 * [] + [] → []
 */
void MapSumTest3() {
    testEqual(
        MakeList(),
        MapSum(MakeList(), MakeList())
    );
}



void test() {
    println("MapSumTests Start");
    runAsTest(this::MapSumTest1);
    runAsTest(this::MapSumTest2);
    runAsTest(this::MapSumTest3);
    println("MapSumTests End");
}
