import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;
void main(){
    test();
}
/*
 * Copyright (c) 2025, Henghuan Li
 * All rights reserved.
 *
 * This code is written for COMP6710 Functional Java practices.
 * Redistribution or use without permission is prohibited.
 */
/**
 * Filters the given ConsList<Integer>, keeping only the odd numbers.
 *
 * Examples:
 *  given: FilterGetOdd([1, 2, 3, 4, 5])
 *  expects: [1, 3, 5]
 *
 *  given: FilterGetOdd([2, 4, 6])
 *  expects: []
 *
 *  given: FilterGetOdd([])
 *  expects: []
 *
 *  given: FilterGetOdd([-3, -2, -1, 0, 1])
 *  expects: [-3, -1, 1]
 *
 * @param conslist the list of integers to filter
 * @return a new ConsList<Integer> containing only the odd numbers from {@code conslist}
 */

ConsList<Integer> FilterGetOdd( ConsList<Integer> conslist){
    
}

// FilterGetOddTests

/**
 * [1, 2, 3, 4, 5] → [1, 3, 5]
 */
void FilterGetOddTest1() {
    testEqual(
        MakeList(1, 3, 5),
        FilterGetOdd(MakeList(1, 2, 3, 4, 5))
    );
}

/**
 * [2, 4, 6] → []
 */
void FilterGetOddTest2() {
    testEqual(
        MakeList(),
        FilterGetOdd(MakeList(2, 4, 6))
    );
}

/**
 * [] → []
 */
void FilterGetOddTest3() {
    testEqual(
        MakeList(),
        FilterGetOdd(MakeList())
    );
}

/**
 * [-3, -2, -1, 0, 1] → [-3, -1, 1]
 */
void FilterGetOddTest4() {
    testEqual(
        MakeList(-3, -1, 1),
        FilterGetOdd(MakeList(-3, -2, -1, 0, 1))
    );
}

void test() {
    println("FilterGetOddTests Start");
    runAsTest(this::FilterGetOddTest1);
    runAsTest(this::FilterGetOddTest2);
    runAsTest(this::FilterGetOddTest3);
    runAsTest(this::FilterGetOddTest4);
    println("FilterGetOddTests End");
}


