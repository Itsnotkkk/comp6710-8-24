import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

void main(){
    test();
}

/**
 * Returns a new ConsList<Integer> where each element of the given list
 * is increased by the specified value 
 *
 * Examples:
 *  given: MapAdd([1, 2, 3], 5)
 *  expects: [6, 7, 8]
 *
 *  given: MapAdd([], 10)
 *  expects: []
 *
 *  given: MapAdd([-1, 0, 1], 2)
 *  expects: [1, 2, 3]
 *
 * @param conslist the list of integers to transform
 * @param adder the value to add to each element
 * @return a new ConsList<Integer> with each element increased by 
 */


ConsList<Integer>  MapAdd(ConsList<Integer> conslist,int adder){
    
}


// MapAddTests

/**
 * [1, 2, 3], adder=5 → [6, 7, 8]
 */
void MapAddTest1() {
    testEqual(
        MakeList(6, 7, 8),
        MapAdd(MakeList(1, 2, 3), 5)
    );
}

/**
 * [], adder=10 → []
 */
void MapAddTest2() {
    testEqual(
        MakeList(),
        MapAdd(MakeList(), 10)
    );
}

/**
 * [-1, 0, 1], adder=2 → [1, 2, 3]
 */
void MapAddTest3() {
    testEqual(
        MakeList(1, 2, 3),
        MapAdd(MakeList(-1, 0, 1), 2)
    );
}

void test() {
    println("MapAddTests Start");
    runAsTest(this::MapAddTest1);
    runAsTest(this::MapAddTest2);
    runAsTest(this::MapAddTest3);
    println("MapAddTests End");
}


