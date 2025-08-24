import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Checks whether the string {@code s1} contains the substring {@code s2}.
 * 
 * If {@code s2} is found within {@code s1}, returns a Maybe containing {@code s2};
 * otherwise returns Nothing.
 *
 * Examples:
 *  given: ContainsString("HelloWorld", "World")
 *  expects: Something("World")
 *
 *  given: ContainsString("HelloWorld", "Java")
 *  expects: Nothing
 *
 *  given: ContainsString("abcabc", "a")
 *  expects: Something("a")
 *
 *  given: ContainsString("", "test")
 *  expects: Nothing
 *
 * @param s1 the string to search in
 * @param s2 the substring to search for
 * @return a Maybe containing {@code s2} if found, or Nothing if not found
 */

Maybe<String> ContainsString(String s1,String s2){

/**
 * Notes:
 * check the Functions of Strings in Standard Library in Fava
 */


    // TODO



}

// ContainsStringTests

/**
 * "HelloWorld" contains "World"
 * Expected: Just("World")
 */
void ContainsStringTest1() {
    testEqual(new Something<>("World"), ContainsString("HelloWorld", "World"));
}

/**
 * "HelloWorld" does not contain "Java"
 * Expected: Nothing
 */
void ContainsStringTest2() {
    testEqual(new Nothing<>(), ContainsString("HelloWorld", "Java"));
}

/**
 * "abcabc" contains "a"
 * Expected: Just("a")
 */
void ContainsStringTest3() {
    testEqual(new Something<>("a"), ContainsString("abcabc", "a"));
}

/**
 * "" does not contain "test"
 * Expected: Nothing
 */
void ContainsStringTest4() {
    testEqual(new Nothing<>(), ContainsString("", "test"));
}

void test() {
    println("ContainsStringTests Start");
    runAsTest(this::ContainsStringTest1);
    runAsTest(this::ContainsStringTest2);
    runAsTest(this::ContainsStringTest3);
    runAsTest(this::ContainsStringTest4);
    println("ContainsStringTests End");
}

void main(){
    test();
}