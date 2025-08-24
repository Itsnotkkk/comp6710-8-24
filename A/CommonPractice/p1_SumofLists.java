import comp1110.lib.*;
import comp1110.lib.Date;
import static comp1110.lib.Functions.*;
import static comp1110.testing.Comp1110Unit.*;

/**
 * Calculates the sum of all integer elements in a given ConsList.
 *
 * Examples:
 *  given: SumofList(Nil<Integer>())
 *  expects: 0
 *
 *  given: SumofList(Cons(5, Nil<Integer>()))
 *  expects: 5
 *
 *  given: SumofList(Cons(1, Cons(2, Cons(3, Nil<Integer>()))))
 *  expects: 6
 *
 * @param conslist the list of integers to sum; may be empty (Nil) or non-empty (Cons)
 * @return the total sum of all integers in the list
 */
int SumofListInt(ConsList<Integer> conslist){
    //TODO
     // solution1

//    return Fold((x,y)->x+y,0,conslist);
     // solution2

    //  int result = 0;
    //  for(int i =0;i<Length(conslist);i++){
    //     result += Nth(conslist,i);
    //  }
    //  return result;

    // solution3
    return switch(conslist){
        case Nil()-> 0;
        case Cons(var first,var rest)-> first+SumofListInt(rest);
    };


}
/**
 * Concatenates all string elements in a given ConsList<String>.
 *
 * Examples:
 *  given: SumofListString(Nil<String>())
 *  expects: ""
 *
 *  given: SumofListString(Cons("Hello", Nil<String>()))
 *  expects: "Hello"
 *
 *  given: SumofListString(Cons("a", Cons("b", Cons("c", Nil<String>()))))
 *  expects: "abc"
 *
 * @param conslist the list of strings to concatenate; may be empty (Nil) or non-empty (Cons)
 * @return a single string formed by concatenating all elements of the list
 */
String SumofListString(ConsList<String> conslist){
    //TODO
    // solution1
    // return Fold((x,y)->x+y,"",conslist);
     // solution2

    //  String result ="";
    //  for(int i =0;i<Length(conslist);i++){
    //     result += Nth(conslist,i);
    //  }
    //  return result;

    // solution3
    return switch(conslist){
        case Nil()-> "";
        case Cons(var first,var rest)-> first+SumofListString(rest);
    };
    
}


void main(){
    println("Start");
    test();
    
}



// SumofListIntTests

void SumofListIntTest1() {
    testEqual(0, SumofListInt(MakeList()));
}

void SumofListIntTest2() {
    testEqual(5, SumofListInt(MakeList(5)));
}

void SumofListIntTest3() {
    testEqual(6, SumofListInt(MakeList(1, 2, 3)));
}

// SumofListStringTests

void SumofListStringTest1() {
    testEqual("", SumofListString(MakeList()));
}

void SumofListStringTest2() {
    testEqual("Hello", SumofListString(MakeList("Hello")));
}

void SumofListStringTest3() {
    testEqual("abc", SumofListString(MakeList("a", "b", "c")));
}

void test() {
    println("SumofListIntTests Start");
    runAsTest(this::SumofListIntTest1);
    runAsTest(this::SumofListIntTest2);
    runAsTest(this::SumofListIntTest3);
    println("SumofListIntTests End");

    println("SumofListStringTests Start");
    runAsTest(this::SumofListStringTest1);
    runAsTest(this::SumofListStringTest2);
    runAsTest(this::SumofListStringTest3);
    println("SumofListStringTests End");
}

