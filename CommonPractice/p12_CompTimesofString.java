import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;
/**
 * Counts how many times each unique string occurs in the given ConsList<String>,
 * and returns a ConsList of Pair<String, Integer> representing the results.
 * <p>
 * Each pair consists of (string, count). The order of pairs follows the first
 * appearance of each string in the input list.
 *
 * Examples:
 *  given: CompTimesofString(["a", "b", "a", "c", "b", "a"])
 *  expects: [(a, 3), (b, 2), (c, 1)]
 *
 *  given: CompTimesofString(["x", "x", "x"])
 *  expects: [(x, 3)]
 *
 *  given: CompTimesofString([])
 *  expects: []
 *
 * @param conslist the list of strings to analyze
 * @return a ConsList of Pair<String, Integer> containing each unique string with its occurrence count
 */

ConsList<Pair<String,Integer>> CompTimesofString(ConsList<String> conslist){
     // TODO imple
    ConsList<Pair<String,Integer>> result =MakeList();
    for(int i =0;i<Length(conslist);i++){
        String key = Nth(conslist, i);
        Maybe<Integer> m = Get(result, key); 
        result = switch (m) {
            case Nothing<Integer> n -> Put(result, key, 1);
            case Something<Integer>(var val) -> Put(result, key, val + 1);
        };

    }
    return result;
}

void main(){

    test();
}
    
    
    // CompTimesofStringTests

/**
 * ["a", "b", "a", "c", "b", "a"] → [(a,3), (b,2), (c,1)]
 */
void CompTimesofStringTest1() {
    testEqual(
        MakeList(new Pair<>("a", 3), new Pair<>("b", 2), new Pair<>("c", 1)),
        CompTimesofString(MakeList("a", "b", "a", "c", "b", "a"))
    );
}

/**
 * ["x", "x", "x"] → [(x,3)]
 */
void CompTimesofStringTest2() {
    testEqual(
        MakeList(new Pair<>("x", 3)),
        CompTimesofString(MakeList("x", "x", "x"))
    );
}

/**
 * [] → []
 */
void CompTimesofStringTest3() {
    testEqual(
        MakeList(),
        CompTimesofString(MakeList())
    );
}

/**
 * ["Alice", "Bob", "Alice", "Charlie"] → [(Alice,2), (Bob,1), (Charlie,1)]
 */
void CompTimesofStringTest4() {
    testEqual(
        MakeList(new Pair<>("Alice", 2), new Pair<>("Bob", 1), new Pair<>("Charlie", 1)),
        CompTimesofString(MakeList("Alice", "Bob", "Alice", "Charlie"))
    );
}

void test() {
    println("CompTimesofStringTests Start");
    runAsTest(this::CompTimesofStringTest1);
    runAsTest(this::CompTimesofStringTest2);
    runAsTest(this::CompTimesofStringTest3);
    runAsTest(this::CompTimesofStringTest4);
    println("CompTimesofStringTests End");
}
