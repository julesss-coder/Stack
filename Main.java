// Benutzer soll nur die Methoden des Stack haben, keinen Einblick in DLList

// QUESTIONS
// - Does pop() return the deleted node, or its value?
public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        System.out.println(stack.size());
        System.out.println("pop: " + stack.pop());
    }
}
