import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Parses two strings as integers and returns their sum.
 * <p>
 * If either string is not a valid integer, this method should throw
 * a NumberFormatException.
 *
 * Examples:
 *  given: AddIntofString("10", "20")
 *  expects: 30
 *
 *  given: AddIntofString("-5", "15")
 *  expects: 10
 *
 *  given: AddIntofString("0", "0")
 *  expects: 0
 *
 *
 * @param s1 the first string representing an integer
 * @param s2 the second string representing an integer
 * @return the sum of the integer values of {@code s1} and {@code s2}
 */

int AddIntofString(String s1,String s2){
    //TODO

}

// AddIntofStringTests

/**
 * "10" + "20" → 30
 */
void AddIntofStringTest1() {
    testEqual(30, AddIntofString("10", "20"));
}

/**
 * "-5" + "15" → 10
 */
void AddIntofStringTest2() {
    testEqual(10, AddIntofString("-5", "15"));
}

/**
 * "0" + "0" → 0
 */
void AddIntofStringTest3() {
    testEqual(0, AddIntofString("0", "0"));
}



void test() {
    println("AddIntofStringTests Start");
    runAsTest(this::AddIntofStringTest1);
    runAsTest(this::AddIntofStringTest2);
    runAsTest(this::AddIntofStringTest3);
    println("AddIntofStringTests End");
}

void main(){
    test();
}