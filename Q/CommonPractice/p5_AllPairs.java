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
 * Creates a new ConsList<Pair<String,Integer>> containing all possible pairs
 * formed by combining each element from conslist1 with each element from conslist2.
 * <p>
 * This is equivalent to the Cartesian product of the two lists.
 *
 * Examples:
 *  given: AllPairs(["Alice", "Bob"], [1, 2])
 *  expects: [(Alice, 1), (Alice, 2), (Bob, 1), (Bob, 2)]
 *
 *  given: AllPairs(["X"], [10, 20, 30])
 *  expects: [(X, 10), (X, 20), (X, 30)]
 *
 *  given: AllPairs([], [1, 2])
 *  expects: []
 *
 *  given: AllPairs(["Alice"], [])
 *  expects: []
 *
 * @param conslist1 the list of Strings (first component of the pairs)
 * @param conslist2 the list of Integers (second component of the pairs)
 * @return a new ConsList<Pair<String,Integer>> containing all possible pairs
 */

ConsList<Pair<String,Integer>> AllPairs(ConsList<String> conslist1,ConsList<Integer> conslist2){
    
}




void main(){
    println(AllPairs(MakeList("Alice", "Bob"),MakeList(1, 2)));
}