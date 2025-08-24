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
 * Creates a new ConsList of Pair<String, Integer> by combining elements
 * from two given lists at corresponding positions.
 * <p>
 * The first list provides the String component of each pair,
 * and the second list provides the Integer component.
 * Both lists must have the same length.
 *
 * Examples:
 *  given: PairofTwoConsLists(["Alice", "Bob"], [10, 20])
 *  expects: [(Alice, 10), (Bob, 20)]
 *
 *  given: PairofTwoConsLists([], [])
 *  expects: []
 *
 * @param conslist1 the list of Strings; must have the same length as conslist2
 * @param conslist2 the list of Integers; must have the same length as conslist1
 * @return a ConsList of Pair<String, Integer> where each pair combines elements from the same index
 * @throws IllegalArgumentException if the two lists have different lengths
 */
ConsList<Pair<String,Integer>> PairofTwoConsLists(ConsList<String> conslist1,ConsList<Integer> conslist2){

}

void main(){
    println(PairofTwoConsLists(MakeList("Alice", "Bob"),MakeList(1, 2)));
}