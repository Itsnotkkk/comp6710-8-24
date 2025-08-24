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
void main(){
    test();
}

/**
 * Parses each string in the given ConsList<String> as an integer,
 * then sums them and returns the result as an int.
 * <p>
 * If a string is not a valid integer, a NumberFormatException should be thrown.
 *
 * Examples:
 *  given: IntSumofString(["1", "2", "3"])
 *  expects: 6
 *
 *  given: IntSumofString(["10", "-5", "20"])
 *  expects: 25
 *
 *  given: IntSumofString([])
 *  expects: 0
 *
 * @param conslist the list of strings to parse as integers
 * @return the total sum of parsed integers

 */
int IntSumofString(ConsList<String> conslist) {
    // TODO implement
    int result = 0;
    for (int i =0 ;i<Length(conslist);i++){
        result+=StringToInt(Nth(conslist,i));
    }
    return result;
}

// IntSumofStringTests

void IntSumofStringTest1() {
    testEqual(6, IntSumofString(MakeList("1","2","3")));
}

void IntSumofStringTest2() {
    testEqual(25, IntSumofString(MakeList("10","-5","20")));
}

void IntSumofStringTest3() {
    testEqual(0, IntSumofString(MakeList()));
}


void test() {
    println("IntSumofStringTests Start");
    runAsTest(this::IntSumofStringTest1);
    runAsTest(this::IntSumofStringTest2);
    runAsTest(this::IntSumofStringTest3);
    println("IntSumofStringTests End");
}

