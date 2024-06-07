package _03_JavaAdvanced._11_Workshop;

public class Main {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        for (int i = 0; i < 10; i++) {
            smartArray.add(i);
        }


        SmartStack stack = new SmartStack();
        stack.push(4);
        stack.push(7);
        stack.push(12);
        stack.push(56);
        stack.forEach(System.out::println);


    }
}
