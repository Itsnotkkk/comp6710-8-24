import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Checks whether any string in the given list contains the specified substring.
 * Iterates through the ConsList<String>; if at least one element contains the
 * substring {@code sb}, then returns a Maybe containing {@code sb}.
 * Otherwise, returns Nothing.
 *
 * Examples:
 *  given: checkStringofLists(["Alice", "Bob", "Charlie"], "li")
 *  expects: Something("li")
 *
 *  given: checkStringofLists(["Dog", "Cat"], "at")
 *  expects: Something("at")
 *
 *  given: checkStringofLists(["Dog", "Cat"], "fox")
 *  expects: Nothing
 *
 *  given: checkStringofLists([], "test")
 *  expects: Nothing
 *
 * @param conslist the list of strings to search; may be empty (Nil) or non-empty (Cons)
 * @param sb the substring to look for within elements of conslist
 * @return a Maybe containing {@code sb} if found in any element, or Nothing if not found
 */
Maybe<String> checkStringofLists(ConsList<String> conslist,String sb){



}


void main(){

println(checkStringofLists(MakeList("LHH","LHL"),"HL"));

}