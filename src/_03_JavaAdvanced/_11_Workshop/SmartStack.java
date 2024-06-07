package _03_JavaAdvanced._11_Workshop;

import java.util.function.Consumer;

public class SmartStack {

    private Node top;
    private int size;

    private static class Node {
        private int topValue;
        private Node prevValue;

        public Node(int val, Node prev) {
            this.topValue = val;
            this.prevValue = prev;
        }
    }

    public void push(int element) {
        top = new Node(element, top); // top = на новиет елемент които влиза от вънка (който става върх) и на старата сойност (NODE) на топ;
        size++;
    }
    public int pop() {
        int val = top.topValue; // Запазваме стойността на елемента на върха на стека
        top = top.prevValue; // Променяме връха на стека, така че да сочи към предишния елеме
        size--;  // Намаляваме брояча за размера на стека
        return val; // Връщаме запазената стойност на елемента, който сме извадили (ako ще я позлваме за нещо)
    }
    public int size() {
        return size;
    }
    public void forEach(Consumer<Integer> consumer) {
        Node last = top;
        while (last != null) {
            consumer.accept(last.topValue);
            last = last.prevValue;
        }

    }
    public boolean isEmpty() {
        return size == 0;
    }
}
