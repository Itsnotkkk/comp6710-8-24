import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/*
 * Copyright (c) 2025, Henghuan Li
 * All rights reserved.
 *
 * This code is written for COMP6710 Functional Java practices.
 * Redistribution or use without permission is prohibited.
 */


/**
 * Removes the first occurrence of the specified string {@code s} from the given ConsList<String>.
 * <p>
 * If {@code s} is not found in the list, the original list is returned unchanged.
 * The relative order of the remaining elements is preserved.
 *
 * Examples:
 *  given: removeFirstStringofList(["Alice", "Bob", "Charlie"], "Bob")
 *  expects: ["Alice", "Charlie"]
 *
 *  given: removeFirstStringofList(["x", "y", "x", "z"], "x")
 *  expects: ["y", "x", "z"]
 *
 *  given: removeFirstStringofList(["a", "b", "c"], "d")
 *  expects: ["a", "b", "c"]
 *
 *  given: removeFirstStringofList([], "test")
 *  expects: []
 *
 * @param conslist the list of strings to search in
 * @param s the string to remove (first occurrence only)
 * @return a new list with the first occurrence of {@code s} removed, or the same list if not found
 */
ConsList<String> removeFirstStringofList(ConsList<String> conslist, String s) {
    // TODO implement

}



void main(){
    test();
}



// removeFirstStringofListTests

/**
 * ["Alice", "Bob", "Charlie"], remove "Bob"
 * Expected: ["Alice", "Charlie"]
 */
void removeFirstStringofListTest1() {
    testEqual(
        MakeList("Alice", "Charlie"),
        removeFirstStringofList(MakeList("Alice", "Bob", "Charlie"), "Bob")
    );
}

/**
 * ["x", "y", "x", "z"], remove "x"
 * Expected: ["y", "x", "z"]
 */
void removeFirstStringofListTest2() {
    testEqual(
        MakeList("y", "x", "z"),
        removeFirstStringofList(MakeList("x", "y", "x", "z"), "x")
    );
}

/**
 * ["a", "b", "c"], remove "d"
 * Expected: ["a", "b", "c"]
 */
void removeFirstStringofListTest3() {
    testEqual(
        MakeList("a", "b", "c"),
        removeFirstStringofList(MakeList("a", "b", "c"), "d")
    );
}

/**
 * [], remove "test"
 * Expected: []
 */
void removeFirstStringofListTest4() {
    testEqual(
        MakeList(),
        removeFirstStringofList(MakeList(), "test")
    );
}

void test() {
    println("removeFirstStringofListTests Start");
    runAsTest(this::removeFirstStringofListTest1);
    runAsTest(this::removeFirstStringofListTest2);
    runAsTest(this::removeFirstStringofListTest3);
    runAsTest(this::removeFirstStringofListTest4);
    println("removeFirstStringofListTests End");
}
