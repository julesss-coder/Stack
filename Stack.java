import DoublyLinkedList.DoublyLinkedList;

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

    // Testen
    public T pop() {
        System.out.println(dataList.listLength());
        return dataList.delete(dataList.listLength() - 1);
    }

}
