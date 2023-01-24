import DoublyLinkedList.DoublyLinkedList;

import java.util.ArrayList;

public class Stack<T> {
    private DoublyLinkedList<T> dataList;

    public Stack() {
        dataList = new DoublyLinkedList<T>();
    }

    public void push(T value) {
        dataList.append(value);
        // Warum muss ich ein Integer-Objekt uebergeben, wenn ich push() im Debugger aufrufe? Warum funktioniert es nicht, nur eine Integer zu uebergeben?
        System.out.println("this: " + this); //exp.: Objekt der KLasse Stack mit Property `dataList` und Methode push, 20%
        System.out.println(dataList);
    }

    public int size() {
        return dataList.listLength();
    }

    public T pop() {
        if (this.size() == 0) {
            throw new NullPointerException("Stack is empty - nothing to delete.");
        }
        return dataList.delete(dataList.listLength() - 1);
    }

    public ArrayList<T> pop(int n) {
        if (this.size() == 0) {
            throw new NullPointerException("Stack is empty - nothing to delete.");
        }
        // Create array to store deleted values in
        // Wie erzeuge ich ein neues Array vom Datentyp T mit der Laenge n?
        // T[] deletedValues = (T[]) new Object[n];
        ArrayList<T> deletedValues = new ArrayList<T>();

        for(int i = 0; i < n; i++) {
            T value = this.pop();
            deletedValues.add(value);
        }

        return deletedValues;
    }

    public T peek() {
        if (this.size() == 0) {
            throw new NullPointerException("Stack is empty - no elements to show.");
        }
        return dataList.searchListReverse(this.size() - 1);
    }

}
