import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;


/**
 * Checks whether the given integer is divisible by 2.
 * <p>
 * If divisible, returns Something containing the string form of the number.
 * Otherwise, returns Nothing.
 *
 * Examples:
 *  given: DividedBytwo(4)
 *  expects: Something("4")
 *
 *  given: DividedBytwo(9)
 *  expects: Nothing()
 *
 *  given: DividedBytwo(0)
 *  expects: Something("0")
 *
 * @param number the integer to check
 * @return Something(ToString(number)) if divisible by 2, otherwise Nothing
 */
Maybe<String> DividedBytwo(int number){
    return (number%2==0) ? new Something<>(ToString(number)):new Nothing<>();
}



void main(){
    test();
}

// DividedBytwoTests

/**
 * 4 → divisible → Something("4")
 */
void DividedBytwoTest1() {
    testEqual(new Something<>("4"), DividedBytwo(4));
}

/**
 * 9 → not divisible → Nothing
 */
void DividedBytwoTest2() {
    testEqual(new Nothing<>(), DividedBytwo(9));
}

/**
 * 0 → divisible → Something("0")
 */
void DividedBytwoTest3() {
    testEqual(new Something<>("0"), DividedBytwo(0));
}

/**
 * -6 → divisible → Something("-6")
 */
void DividedBytwoTest4() {
    testEqual(new Something<>("-6"), DividedBytwo(-6));
}

void test() {
    println("DividedBytwoTests Start");
    runAsTest(this::DividedBytwoTest1);
    runAsTest(this::DividedBytwoTest2);
    runAsTest(this::DividedBytwoTest3);
    runAsTest(this::DividedBytwoTest4);
    println("DividedBytwoTests End");
}
