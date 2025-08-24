import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

void main(){
    test();
}
/**
 * Computes the sum of all integers in the given ConsList<Integer>.
 *
 * Examples:
 *  given: FoldSum1([1, 2, 3, 4])
 *  expects: 10
 *
 *  given: FoldSum1([])
 *  expects: 0
 *
 *  given: FoldSum1([-5, 5, 10])
 *  expects: 10
 *
 * @param conslist the list of integers to sum
 * @return the total sum of all integers in the list
 */

int FoldSum1(ConsList<Integer> conslist){

}

// FoldSum1Tests

/**
 * [1, 2, 3, 4] → 10
 */
void FoldSum1Test1() {
    testEqual(10, FoldSum1(MakeList(1, 2, 3, 4)));
}

/**
 * [] → 0
 */
void FoldSum1Test2() {
    testEqual(0, FoldSum1(MakeList()));
}

/**
 * [-5, 5, 10] → 10
 */
void FoldSum1Test3() {
    testEqual(10, FoldSum1(MakeList(-5, 5, 10)));
}

/**
 * [100] → 100
 */
void FoldSum1Test4() {
    testEqual(100, FoldSum1(MakeList(100)));
}

void test() {
    println("FoldSum1Tests Start");
    runAsTest(this::FoldSum1Test1);
    runAsTest(this::FoldSum1Test2);
    runAsTest(this::FoldSum1Test3);
    runAsTest(this::FoldSum1Test4);
    println("FoldSum1Tests End");
}
