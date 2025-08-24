import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Sums all integers in the given ConsList<Integer> and returns the result as a String.
 *
 * Examples:
 *  given: SumofInt([1, 2, 3, 4])
 *  expects: "10"
 *
 *  given: SumofInt([])
 *  expects: "0"
 *
 *  given: SumofInt([-5, 5, 10])
 *  expects: "10"
 *
 * @param conslist the list of integers to sum; may be empty
 * @return a String representation of the total sum of all integers
 */

String SumofInt(ConsList<Integer> conslist){


}

void main(){
    test();
}


// SumofIntTests

/**
 * [1, 2, 3, 4] → "10"
 */
void SumofIntTest1() {
    testEqual("10", SumofInt(MakeList(1, 2, 3, 4)));
}

/**
 * [] → "0"
 */
void SumofIntTest2() {
    testEqual("0", SumofInt(MakeList()));
}

/**
 * [-5, 5, 10] → "10"
 */
void SumofIntTest3() {
    testEqual("10", SumofInt(MakeList(-5, 5, 10)));
}

/**
 * [100] → "100"
 */
void SumofIntTest4() {
    testEqual("100", SumofInt(MakeList(100)));
}

void test() {
    println("SumofIntTests Start");
    runAsTest(this::SumofIntTest1);
    runAsTest(this::SumofIntTest2);
    runAsTest(this::SumofIntTest3);
    runAsTest(this::SumofIntTest4);
    println("SumofIntTests End");
}
