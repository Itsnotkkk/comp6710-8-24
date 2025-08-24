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
sealed interface Tree<T> permits Node,Leaf{}

record Node<T>(Tree<T> left,Tree<T> right) implements Tree<T>{}
record Leaf<T>(T value) implements Tree<T>{}


/**
 * Recursively folds a {@code Tree<T>} into a single value using the given aggregation function.
 * <p>
 * - If the tree is a {@code Leaf}, its stored value is returned directly.  
 * - If the tree is a {@code Node}, the method recursively folds the left and right subtrees,
 *   then applies the provided {@code BiFunction} {@code agg} to combine their results.
 *
 * Examples:
 *  given: treeFold((x, y) -> x + y, new Node<>(new Leaf<>(1), new Node<>(new Leaf<>(2), new Leaf<>(3))))
 *  expects: 6
 *
 *  given: treeFold((x, y) -> Math.max(x, y), new Node<>(new Leaf<>(7), new Node<>(new Leaf<>(2), new Leaf<>(9))))
 *  expects: 9
 *
 *  given: treeFold((x, y) -> x + "-" + y, new Node<>(new Leaf<>("x"), new Leaf<>("y")))
 *  expects: "x-y"
 *
 * @param <T> the type of values contained in the tree
 * @param agg a function that combines two values into one (used at each {@code Node})
 * @param tree the tree to fold; may be a {@code Leaf} or a {@code Node}
 * @return the aggregated result of folding the entire tree
 */
<T> T treeFold(BiFunction<T, T, T> agg, Tree<T> tree) {
    return switch (tree) {
        case Leaf<T>(var value) -> value;
        case Node<T>(var left, var right) -> {
            T l = treeFold(agg, left);
            T r = treeFold(agg, right);
            yield agg.apply(l, r); 
        }
    };
}



void main(){
    test();
}





// treeFoldTests
/**
 * given 
 *              N
 *             / \
 *            1   N
 *               / \
 *              2   3
 *(x, y) -> x + y
 * Expected: 1 + 2 + 3 = 6
 */

void treeFoldTest1() {
    // tree: Node(Leaf(1), Node(Leaf(2), Leaf(3)))
    Tree<Integer> tree = new Node<>(new Leaf<>(1), new Node<>(new Leaf<>(2), new Leaf<>(3)));
    testEqual(6, treeFold((x, y) -> x + y, tree));
}
/**
 *              N
 *             / \
 *            7   N
 *               / \
 *              2   9
 *
 * Expected: max(7, max(2, 9)) = 9
 */
void treeFoldTest2() {
    // tree: Node(Leaf(7), Node(Leaf(2), Leaf(9)))
    Tree<Integer> tree = new Node<>(new Leaf<>(7), new Node<>(new Leaf<>(2), new Leaf<>(9)));
    testEqual(9, treeFold((x, y) -> Math.max(x, y), tree));
}
/**
 *         N
 *        / \
 *      "x"  "y"
 *
 * Expected: "x-y"
 */
void treeFoldTest3() {
    // tree: Node(Leaf("x"), Leaf("y"))
    Tree<String> tree = new Node<>(new Leaf<>("x"), new Leaf<>("y"));
    testEqual("x-y", treeFold((x, y) -> x + "-" + y, tree));
}
/**
 *              N
 *             / \
 *            N   3
 *           / \
 *          1   2
 *(x, y) -> x + y
 * Expected: (1 + 2) + 3 = 6
 */
void treeFoldTest4() {
    // tree: Node(Node(Leaf(1), Leaf(2)), Leaf(3)) → sum
    Tree<Integer> tree = new Node<>(new Node<>(new Leaf<>(1), new Leaf<>(2)), new Leaf<>(3));
    testEqual(6, treeFold((x, y) -> x + y, tree));
}

void treeFoldTest5() {
    // tree: Leaf(42) → just the value
    Tree<Integer> tree = new Leaf<>(42);
    testEqual(42, treeFold((x, y) -> x + y, tree));
}



void test() {
    println("treeFoldTests Start");
    runAsTest(this::treeFoldTest1);
    runAsTest(this::treeFoldTest2);
    runAsTest(this::treeFoldTest3);
    runAsTest(this::treeFoldTest4);
    runAsTest(this::treeFoldTest5);
    println("treeFoldTests End");
}