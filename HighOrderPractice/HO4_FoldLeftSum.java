import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

void main(){
    test();
}
/**
 * Concatenates all strings in the given ConsList<String> into a single string,
 * but in reverse order (folding from the left).
 *
 * Examples:
 *  given: FoldLeftSum(["a", "b", "c"])
 *  expects: "cba"
 *
 *  given: FoldLeftSum([])
 *  expects: ""
 *
 *  given: FoldLeftSum(["Hello", " ", "World"])
 *  expects: "World Hello"
 *
 * @param conslist the list of strings to concatenate in reverse order
 * @return a single string formed by concatenating all elements in reverse order
 */
String FoldLeftSum(ConsList<String> conslist) {
    // TODO implement
}

String FoldLeftSum(ConsList<String> conslist){

}

// FoldLeftSumTests

/**
 * ["a", "b", "c"] → "cba"
 */
void FoldLeftSumTest1() {
    testEqual("cba", FoldLeftSum(MakeList("a", "b", "c")));
}

/**
 * [] → ""
 */
void FoldLeftSumTest2() {
    testEqual("", FoldLeftSum(MakeList()));
}

/**
 * ["Hello", " ", "World"] → "World Hello"
 */
void FoldLeftSumTest3() {
    testEqual("World Hello", FoldLeftSum(MakeList("Hello", " ", "World")));
}

/**
 * ["x"] → "x"
 */
void FoldLeftSumTest4() {
    testEqual("x", FoldLeftSum(MakeList("x")));
}

void test() {
    println("FoldLeftSumTests Start");
    runAsTest(this::FoldLeftSumTest1);
    runAsTest(this::FoldLeftSumTest2);
    runAsTest(this::FoldLeftSumTest3);
    runAsTest(this::FoldLeftSumTest4);
    println("FoldLeftSumTests End");
}
