import java.util.ArrayList;
public class Stack < T > {
    private final ArrayList < T > stack;
    public Stack() {
        stack = new ArrayList < > ();
    }
    public void push(T t) {
        stack.add(t);
    }
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.removeLast();
    }
    public T peek() {
        return stack.getLast();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public int size() {
        return stack.size();
    }

    public ArrayList < T > getStack() {
        return stack;
    }
}