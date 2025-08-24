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

}

String SumofListString(ConsList<String> conslist){
    //TODO
    
}


void main(){
    println("Start");
    test();
    
}
// SumofListTest1
void SumofListTest1(){
    testEqual(10, SumofList(MakeList(1,2,3,4)));
}

void SumofListTest2(){
    testEqual(0,SumofList(MakeList()));
}
void SumofListTest3(){
    testEqual(0,SumofList(MakeList(0,0,0,0,0)));
}
void SumofListTest4(){
    testEqual(0,SumofList(MakeList(-1,1,1,-1)));
}

void SumofTwoConsListsTest1(){
    testEqual(
        MakeList(10, 10, 10, 10), 
    SumofTwoConsLists(
        MakeList(1, 3, 4, 5),
        MakeList(9, 7, 6, 5)
        )
    );
}





void test(){
    println("SumofListTests Start");
    runAsTest(this::SumofListTest1);
    runAsTest(this::SumofListTest2);
    runAsTest(this::SumofListTest3);
    runAsTest(this::SumofListTest4);
    println("SumofListTests End");

}

