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
 * Sums all integers in the given ConsList<Integer> and returns the result as a Double.
 *
 * Examples:
 *  given: DoubleSumofInt([1, 2, 3, 4])
 *  expects: 10.0
 *
 *  given: DoubleSumofInt([])
 *  expects: 0.0
 *
 *  given: DoubleSumofInt([-5, 5, 10])
 *  expects: 10.0
 *
 *  given: DoubleSumofInt([100])
 *  expects: 100.0
 *
 * @param conslist the list of integers to sum; may be empty
 * @return a Double representing the total sum of all integers
 */
Double DoubleSumofInt(ConsList<Integer> conslist){

}

// DoubleSumofIntTests

/**
 * [1, 2, 3, 4] → 10.0
 */
void DoubleSumofIntTest1() {
    testEqual(10.0, DoubleSumofInt(MakeList(1, 2, 3, 4)));
}

/**
 * [] → 0.0
 */
void DoubleSumofIntTest2() {
    testEqual(0.0, DoubleSumofInt(MakeList()));
}

/**
 * [-5, 5, 10] → 10.0
 */
void DoubleSumofIntTest3() {
    testEqual(10.0, DoubleSumofInt(MakeList(-5, 5, 10)));
}

/**
 * [100] → 100.0
 */
void DoubleSumofIntTest4() {
    testEqual(100.0, DoubleSumofInt(MakeList(100)));
}

void test() {
    println("DoubleSumofIntTests Start");
    runAsTest(this::DoubleSumofIntTest1);
    runAsTest(this::DoubleSumofIntTest2);
    runAsTest(this::DoubleSumofIntTest3);
    runAsTest(this::DoubleSumofIntTest4);
    println("DoubleSumofIntTests End");
}
