import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

void main(){
    println("ggogo");
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
 * Sorts the given ConsList<T> in descending order (largest elements first).
 * <p>
 * Requires that T implements Comparable<T>.
 *
 * Examples:
 *  given: SortBeginBig([3, 1, 4, 2])
 *  expects: [4, 3, 2, 1]

 *  given: SortBeginBig([])
 *  expects: []
 *
 * @param  the type of elements,
 * @param conslist the list to sort
 * @return a new ConsList<T> sorted in descending order
 */
ConsList<Integer> conslist SortBeginBig(ConsList<Integer> conslist){

    return Sort(conslist,(x,y) -> -Compare(x,y));

}

// SortBeginBigTests

/**
 * [3, 1, 4, 2] → [4, 3, 2, 1]
 */
void SortBeginBigTest1() {
    testEqual(
        MakeList(4, 3, 2, 1),
        SortBeginBig(MakeList(3, 1, 4, 2))
    );
}



/**
 * [] → []
 */
void SortBeginBigTest3() {
    testEqual(
        MakeList(),
        SortBeginBig(MakeList())
    );
}

/**
 * [5] → [5]
 */
void SortBeginBigTest4() {
    testEqual(
        MakeList(5),
        SortBeginBig(MakeList(5))
    );
}

void test() {
    println("SortBeginBigTests Start");
    runAsTest(this::SortBeginBigTest1);
    runAsTest(this::SortBeginBigTest2);

    runAsTest(this::SortBeginBigTest4);
    println("SortBeginBigTests End");
}
