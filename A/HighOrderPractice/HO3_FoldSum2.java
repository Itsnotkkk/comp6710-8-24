import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

void main(){
    test();
}
/**
 * Concatenates all strings in the given ConsList<String> into a single string.
 *
 * Examples:
 *  given: FoldSum2(["a", "b", "c"])
 *  expects: "abc"
 *
 *  given: FoldSum2([])
 *  expects: ""
 *
 *  given: FoldSum2(["Hello", " ", "World"])
 *  expects: "Hello World"
 *
 * @param conslist the list of strings to concatenate; may be empty
 * @return a single string formed by concatenating all elements of the list
 */
String FoldSum2(ConsList<String> conslist){

}

// FoldSum2Tests

/**
 * ["a", "b", "c"] → "abc"
 */
void FoldSum2Test1() {
    testEqual("abc", FoldSum2(MakeList("a", "b", "c")));
}

/**
 * [] → ""
 */
void FoldSum2Test2() {
    testEqual("", FoldSum2(MakeList()));
}

/**
 * ["Hello", " ", "World"] → "Hello World"
 */
void FoldSum2Test3() {
    testEqual("Hello World", FoldSum2(MakeList("Hello", " ", "World")));
}

/**
 * ["x"] → "x"
 */
void FoldSum2Test4() {
    testEqual("x", FoldSum2(MakeList("x")));
}

void test() {
    println("FoldSum2Tests Start");
    runAsTest(this::FoldSum2Test1);
    runAsTest(this::FoldSum2Test2);
    runAsTest(this::FoldSum2Test3);
    runAsTest(this::FoldSum2Test4);
    println("FoldSum2Tests End");
}
