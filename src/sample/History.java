package sample;

import java.util.Stack;

public class History {
    private Stack<Operations> historyOfOperations;
    private Stack<Operations> buffer;
    private Operations current;
    private static int count;

    public Operations getCurrent() {
        return current;
    }

    public History() {
        historyOfOperations = new Stack<Operations>();
        buffer = new Stack<Operations>();
    }

    public void previous() {
        if (!historyOfOperations.isEmpty()) {
            buffer.push(current);
            current = historyOfOperations.pop();
        }
    }

    public void next() {
        if (!buffer.isEmpty()) {
            historyOfOperations.push(current);
            current = buffer.pop();
        }
    }

    public void addtohistory(Operations operations) {
        if (buffer.isEmpty()) {
            operations.setIndex(count);
            count++;
            historyOfOperations.push(operations);
        } else {
            while (!buffer.isEmpty()) {
                historyOfOperations.push(buffer.pop());
            }
            operations.setIndex(count);
            count++;
            historyOfOperations.push(operations);
        }
        current = operations;
    }

    public static int getCount() {
        return count;
    }
}
