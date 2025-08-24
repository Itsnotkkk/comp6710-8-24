import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;


/**
 * Removes all occurrences of the specified string {@code sb} from the given ConsList<String>.
 * <p>
 * Iterates through the list, keeping only those elements that are not equal to {@code sb}.
 * The relative order of the remaining elements is preserved.
 *
 * Examples:
 *  given: removeStringofList(["Alice", "Bob", "Charlie"], "Bob")
 *  expects: ["Alice", "Charlie"]
 *
 *  given: removeStringofList(["x", "y", "x", "z"], "x")
 *  expects: ["y", "z"]
 *
 *  given: removeStringofList(["a", "b", "c"], "d")
 *  expects: ["a", "b", "c"]
 *
 *  given: removeStringofList([], "test")
 *  expects: []
 *
 * @param conslist the list of strings to filter; may be empty
 * @param sb the string to remove from the list
 * @return a new list containing all elements of {@code conslist} except those equal to {@code sb}
 */
ConsList<String> removeStringofList(ConsList<String> conslist, String sb){

}

void main(){
    test();
}


// removeStringofListTests

/**
 * List: ["Alice", "Bob", "Charlie"], remove "Bob"
 * Expected: ["Alice", "Charlie"]
 */
void removeStringofListTest1() {
    testEqual(
        MakeList("Alice", "Charlie"),
        removeStringofList(MakeList("Alice", "Bob", "Charlie"), "Bob")
    );
}

/**
 * List: ["x", "y", "x", "z"], remove "x"
 * Expected: ["y", "z"]
 */
void removeStringofListTest2() {
    testEqual(
        MakeList("y", "z"),
        removeStringofList(MakeList("x", "y", "x", "z"), "x")
    );
}

/**
 * List: ["a", "b", "c"], remove "d"
 * Expected: ["a", "b", "c"]
 */
void removeStringofListTest3() {
    testEqual(
        MakeList("a", "b", "c"),
        removeStringofList(MakeList("a", "b", "c"), "d")
    );
}

/**
 * List: [], remove "test"
 * Expected: []
 */
void removeStringofListTest4() {
    testEqual(
        MakeList(),
        removeStringofList(MakeList(), "test")
    );
}

void test() {
    println("removeStringofListTests Start");
    runAsTest(this::removeStringofListTest1);
    runAsTest(this::removeStringofListTest2);
    runAsTest(this::removeStringofListTest3);
    runAsTest(this::removeStringofListTest4);
    println("removeStringofListTests End");
}
