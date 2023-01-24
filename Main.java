// Benutzer soll nur die Methoden des Stack haben, keinen Einblick in DLList

// TODOS

// - [X] void push(int newElement)
//        fügt ein neues Element oben in den Stack ein
// - [X] int size()
//        gibt die Anzahl der Elemente im Stack zurück
// - [x] int pop()
//        gibt das letzte Elemente des Stacks zurück und entfernt dieses vom Stack // d.h. das letzte, das man hinzugefuegt hat -  der letzte Index
//        Wird auf einen leeren Stack pop() oder peek() aufgerufen sollte eine Fehlermeldung ausgegeben werden.
// - [x] int peek()
//        gibt das letzte Elemente des Stacks zurück ohne den Stack zu modifizieren
//        Wird auf einen leeren Stack pop() oder peek() aufgerufen sollte eine Fehlermeldung ausgegeben werden.
// - [x] int[] pop(int n)
//        gibt die letzten n Elemente des Stacks zurück und entfernt diese vom Stack

// QUESTIONS
// - Does pop() return the deleted node, or its value? - The value, as the user need not be concerned with what data structures are used to contain the data; only with the data.
// - pop() method: Is `NullPointerException` the right exception to use for calling pop() on an empty stack?
// In method pop(n): Would it be better to call delete in DoublyLinkedList, or pop? Pros and cons?
// Calling pop n times:
// + What is the point of writing pop if I don't use it where I could?

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // Warum kann ich beim Aufruf von Stack den Inhalt der <>-Klammern weglassen?
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack size: " + stack.size());
        System.out.println("Value of the deleted element: " + stack.pop());

        ArrayList<Integer> deleted = stack.pop(3);
        System.out.println("Deleted elements: " + deleted);

//        System.out.println(stack.pop(3)); // Implicit call to 'toString()' on array returned by call to 'stack.pop(3)'
        System.out.println("Last (= most recently added) value on stack: " + stack.peek());
    }
}
