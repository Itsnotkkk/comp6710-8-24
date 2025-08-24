import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Checks whether the given ConsList<String> contains the specified string.
 * If the string is found, returns a Maybe containing that string; 
 * otherwise returns an empty Maybe (Nothing).
 *
 * Examples:
 *  given: ContainsString(["Alice", "Bob", "Charlie"], "Bob")
 *  expects: Something("Bob")
 *
 *  given: ContainsString(["Alice", "Bob", "Charlie"], "David")
 *  expects: Nothing()
 *
 *  given: ContainsString([], "Alice")
 *  expects: Nothing()
 *
 * @param conslist the list of strings to search; may be empty (Nil) or non-empty (Cons)
 * @param s the target string to search for
 * @return a Maybe containing the found string, or Nothing if not found
 */
Maybe<String> ContainsString(ConsList<String> conslist,String s){
    // TODO
    //soLUTION1
    // for(int i = 0;i<Length(conslist);i++){
    //     if(Contains(Nth(conslist,i),s)){
    //         return new Something<>(s);
    //     }
    // }
    // return new Nothing<>();

    // Solution2
        return switch(conslist){
        case Nil()->  new Nothing<>();
        case Cons(var first,var rest)-> Equals(first,s)?new Something<>(s):ContainsString(rest,s);
    };

}




void main(){
    println("ContainsStringTests Start");
    runAsTest(this::ContainsStringTest1);
    // runAsTest(this::SumofTwoConsListsTest2);
    // runAsTest(this::SumofTwoConsListsTest3);
    println("ContainsStringTests End");
}


//ContainsString
void ContainsStringTest1(){
    testEqual(
        ContainsString(MakeList("q","w","e","r"),"e")
        ,
        new Something<String>("e")
    );
}