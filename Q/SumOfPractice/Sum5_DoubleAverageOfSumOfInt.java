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
 * Computes the average of all integers in the given ConsList<Integer> as a double.
 * <p>
 * The average is defined as the sum of all elements divided by the number of elements,
 * with floating-point division.
 * If the list is empty, this method should throw an IllegalArgumentException.
 *
 * Examples:
 *  given: DoubleAverageOfSumOfInt([1, 2, 3, 4])
 *  expects: 2.5   (sum=10, length=4, 10/4.0 = 2.5)
 *
 *  given: DoubleAverageOfSumOfInt([5, 5, 5])
 *  expects: 5.0   (sum=15, length=3, 15/3.0 = 5.0)
 *
 *  given: DoubleAverageOfSumOfInt([10])
 *  expects: 10.0
 *
 *  given: DoubleAverageOfSumOfInt([])
 *  expects: 0.0
 *
 * @param conslis the list of integers; must be non-empty
 * @return the average value of the list elements as a double
 */

double DoubleAverageOfSumOfInt(ConsList<Integer> conslis){

}


// DoubleAverageOfSumOfIntTests

/**
 * [1, 2, 3, 4] → 2.5
 */
void DoubleAverageOfSumOfIntTest1() {
    testEqual(2.5, DoubleAverageOfSumOfInt(MakeList(1, 2, 3, 4)));
}

/**
 * [5, 5, 5] → 5.0
 */
void DoubleAverageOfSumOfIntTest2() {
    testEqual(5.0, DoubleAverageOfSumOfInt(MakeList(5, 5, 5)));
}

/**
 * [10] → 10.0
 */
void DoubleAverageOfSumOfIntTest3() {
    testEqual(10.0, DoubleAverageOfSumOfInt(MakeList(10)));
}

/**
 * [] → IllegalArgumentException
 */
void DoubleAverageOfSumOfIntTest4() {
testEqual(0.0, DoubleAverageOfSumOfInt(MakeList()));
}
