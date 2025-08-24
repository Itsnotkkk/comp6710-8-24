import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;


/**
 * Computes the length of each string in the given ConsList<String>
 * and returns a new ConsList<Integer> containing these lengths.
 *
 * Examples:
 *  given: CompLenOfLists(["Alice", "Bob", "Charlie"])
 *  expects: [5, 3, 7]
 *
 *  given: CompLenOfLists(["", "hi", "test"])
 *  expects: [0, 2, 4]
 *
 *  given: CompLenOfLists([])
 *  expects: []
 *
 * @param conslist the list of strings to measure
 * @return a ConsList<Integer> where each element is the length of the corresponding string
 */
ConsList<Integer> CompLenOfLists(ConsList<String> conslist){

}



void main(){
    test();
}

// CompLenOfListsTests

/**
 * ["Alice", "Bob", "Charlie"] → [5, 3, 7]
 */
void CompLenOfListsTest1() {
    testEqual(
        MakeList(5, 3, 7),
        CompLenOfLists(MakeList("Alice", "Bob", "Charlie"))
    );
}

/**
 * ["", "hi", "test"] → [0, 2, 4]
 */
void CompLenOfListsTest2() {
    testEqual(
        MakeList(0, 2, 4),
        CompLenOfLists(MakeList("", "hi", "test"))
    );
}

/**
 * [] → []
 */
void CompLenOfListsTest3() {
    testEqual(
        MakeList(),
        CompLenOfLists(MakeList())
    );
}

void test() {
    println("CompLenOfListsTests Start");
    runAsTest(this::CompLenOfListsTest1);
    runAsTest(this::CompLenOfListsTest2);
    runAsTest(this::CompLenOfListsTest3);
    println("CompLenOfListsTests End");
}
