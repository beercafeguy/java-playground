package com.beercafeguy.hackerrank.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        //Deque<String> deque = new LinkedList<String>();
        Deque<String> deque = new ArrayDeque<String>();

        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)"); //add to head
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");
        deque.add("Element 9 (Tail)");
        deque.addFirst("Element 8 (Head)");
        System.out.println(deque + "\n");


        //Iterate through Queue elements
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext())
            System.out.println("\t" + iterator.next());

        // Reverse order iterator
        Iterator reverse = deque.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext())
            System.out.println("\t" + reverse.next());


        // Peek returns the head, without deleting
        // it from the deque
        System.out.println("Peek " + deque.peek());
        System.out.println("After peek: " + deque);

        // Pop returns the head, and removes it from
        // the deque
        System.out.println("Pop " + deque.pop());
        System.out.println("After pop: " + deque);

        // pollLast(): Retrieves and removes the last element of
        // the deque
        System.out.println("pollLast " + deque.pollLast());
        System.out.println("After pollLast: " + deque);


        // We can remove the first / last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing " +
                "first and last: " + deque);

    }
}
