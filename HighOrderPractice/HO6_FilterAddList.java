import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

void main(){
    test();
}
/**
 * Computes the sum of each inner ConsList<Integer> in the given outer list and
 * returns a new ConsList<Integer> containing these per-list sums.
 *
 * Examples:
 *  given: FilterAddList([[1, 2], [3, 4, 5], []])
 *  expects: [3, 12, 0]
 *
 *  given: FilterAddList([[10]])
 *  expects: [10]
 *
 *  given: FilterAddList([])
 *  expects: []
 *
 * @param conslist a list of integer lists; inner lists may be empty (Nil) or non-empty (Cons)
 * @return a list of integers where each element is the sum of the corresponding inner list
 */
ConsList<Integer> FilterAddList(ConsList<ConsList<Integer>> conslist){
    
}

// FilterAddListTests

/**
 * [[1, 2], [3, 4, 5], []] → [3, 12, 0]
 */
void FilterAddListTest1() {
    testEqual(
        MakeList(3, 12, 0),
        FilterAddList(
            MakeList(
                MakeList(1, 2),
                MakeList(3, 4, 5),
                MakeList()
            )
        )
    );
}

/**
 * [[10]] → [10]
 */
void FilterAddListTest2() {
    testEqual(
        MakeList(10),
        FilterAddList(
            MakeList(
                MakeList(10)
            )
        )
    );
}

/**
 * [] → []
 */
void FilterAddListTest3() {
    testEqual(
        MakeList(),
        FilterAddList(MakeList())
    );
}

/**
 * [[-1, 1, 5], [0, 0], [7]] → [5, 0, 7]
 */
void FilterAddListTest4() {
    testEqual(
        MakeList(5, 0, 7),
        FilterAddList(
            MakeList(
                MakeList(-1, 1, 5),
                MakeList(0, 0),
                MakeList(7)
            )
        )
    );
}

void test() {
    println("FilterAddListTests Start");
    runAsTest(this::FilterAddListTest1);
    runAsTest(this::FilterAddListTest2);
    runAsTest(this::FilterAddListTest3);
    runAsTest(this::FilterAddListTest4);
    println("FilterAddListTests End");
}
