import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Produces a ConsList<Integer> where each element is the sum of one inner list
 * from the given ConsList<ConsList<Integer>>.
 *
 * Examples:
 *  given: ListOfSumOfList([[1, 2, 3], [10]])
 *  expects: [6, 10]
 *
 *  given: ListOfSumOfList([[], [4, 4, 4]])
 *  expects: [0, 12]
 *
 *  given: ListOfSumOfList([])
 *  expects: []
 *
 * @param conslist a list of integer lists; inner lists may be empty (Nil) or non-empty (Cons)
 * @return a list of integers where each value is the sum of the corresponding inner list
 */

ConsList<Integer>  ListOfSumOfList(ConsList<ConsList<Integer>> conslist){

}

void main(){
    println(ListOfSumOfList(
        MakeList(
            MakeList(1,2,3,4),
            MakeList(),
            MakeList(0,0,0,0)
        )
    ));
}