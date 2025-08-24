import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;


void main(){
    test();
}
/**
 * Computes the average (integer division) of all integers in the given ConsList<Integer>.
 * <p>
 * The average is defined as the sum of all elements divided by the number of elements.
 * If the list is empty, this method should throw an IllegalArgumentException.
 *
 * Examples:
 *  given: AverageOfSumofInt([1, 2, 3, 4])
 *  expects: 2   (sum=10, length=4, 10/4 = 2)
 *
 *  given: AverageOfSumofInt([5, 5, 5])
 *  expects: 5   (sum=15, length=3, 15/3 = 5)
 *
 *  given: AverageOfSumofInt([10])
 *  expects: 10
 *
 *  given: AverageOfSumofInt([])
 *  expects: 0
 *
 * @param conslist the list of integers; must be non-empty
 * @return the average value (integer division) of the list elements

 */

int AverageOfSumofInt(ConsList<Integer> conslist){

}


// AverageOfSumofIntTests

/**
 * [1, 2, 3, 4] → 2
 */
void AverageOfSumofIntTest1() {
    testEqual(2, AverageOfSumofInt(MakeList(1, 2, 3, 4)));
}

/**
 * [5, 5, 5] → 5
 */
void AverageOfSumofIntTest2() {
    testEqual(5, AverageOfSumofInt(MakeList(5, 5, 5)));
}

/**
 * [10] → 10
 */
void AverageOfSumofIntTest3() {
    testEqual(10, AverageOfSumofInt(MakeList(10)));
}

/**
 * [] → IllegalArgumentException
 */
void AverageOfSumofIntTest4() {
testEqual(0, AverageOfSumofInt(MakeList()));
}
