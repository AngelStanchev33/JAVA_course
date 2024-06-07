package _03_JavaAdvanced._11_Workshop;

import java.util.function.Consumer;

public class SmartArray {

    private int[] data;
    private int index;

    public SmartArray() {
        this.data = new int[2];
        this.index = 0;
    }

    public void add(int element) {
        if (index == data.length) { // Проверява дали индека на които искаме да добавим е равен на дължината на масива върху който добавяме;
            data = resize(data.length * 2);// ако е масива = метод resize;(отиваме на метода resize) ->

            //!!!Презаписването на стойностите се извършва, защото ние променяме размера на масива, което означава, че
            // трябва да създадем нов масив с желания размер и
            // да прехвърлим всички стойности от стария масив в новия!!!.

            //казваме ,че стария масив е = на новия и му умножаваме дължината по 2;
        }

        data[index] = element;
        index++;
    }

    private int[] resize(int newSize) { //след като извикан метода започваме операцията;
        int[] newSizeArray = new int[newSize]; //създваме нов масив newSizeArray които приема стойност (newSize)
        for (int i = 0; i < data.length; i++) { //копираме стойностите от стария масив върху newSizeArray
            newSizeArray[i] = data[i]; //

        }
        return newSizeArray;// връщаме стойноста newSizeArray;
    }

    public int size() {
        return index;
    }

    public int get(int index) {
        checkIndex(index);

        return data[index];

        //!!return data[index]; връща стойността на елемента в масива data на позиция index.

        //Този метод се използва, за да вземем стойността на елемент от масива по конкретен индекс.
        // В случая index е индексът на елемента, който искаме да върнем.
        // Ако просто използваме return index;, това ще върне стойността на променливата index,
        // която е индексът, подаден като параметър на метода, а не стойността на елемента в масива.
        // Тъй като целта е да върнем стойността на елемента в масива, правилният избор е return data[index]!!;.

    }

    public void checkIndex(int index) {
        if (index < 0 || index >= data.length) {
            String message = String.format("Index %d out of bounds for lenght %d",
                    index, data.length);
            throw new IndexOutOfBoundsException(message);
        }
    }

    public boolean contains(int element) {
        for (int i = 0; i < index; i++) {
            if (data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public int remove(int index) {
        int element = data[index];

        for (int i = index; i < this.index - 1; i++) {
            data[i] = data[i + 1]; // на индекс i сложи този който е от дясно

            //!!Тази операция премахва елемента на индекс (data[i + 1]) index от масива data.
            // За да извършите тази операция, трябва да преместите всички елементи след index с една позиция наляво,
            // за да запълните празното място след премахнатия елемент!!

        }
        data[this.index - 1] = 0; // След като сме преместили всички елементи наляво, на последния индекс в масива се
        // присвоява стойността 0, за да укаже, че този елемент е изваден от масива.

        this.index--; // След това броячът this.index се намалява с 1, за да отрази факта, че един елемент (последният) е премахнат от масива.

        if (this.index == data.length / 4) {
            data = resize(data.length / 2);

            //Ако размерът на масива стане по-малък от четвъртата му част (т.е. стане равен на data.length / 4), тогава
            // масивът се преоразмерява на половина от текущия размер, за да се избегне излишно заета памет.
        }

        return element; // връща стойността на елемента, който е премахнат от масива.
    }

    public void addIndexEl(int index, int element) {

        int lastElement = data[this.index - 1]; // това сочи към последният елемент от масива;

        for (int i = this.index - 1; i > index; i--) {
            data[i] = data[i - 1];

            //тази операция место всики елементи от масива на дясно;
        }

        data[index] = element; // когато излезнем от цикъла и се озовем на задения иднекс ,казваме че е = на стойноста която сме искали да добавим;

        add(lastElement); // Добавяме последният елемент който се е загубил зради разместването в масива;
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < index; i++) {
            consumer.accept(data[i]);
        }
    }


}

