import java.util.Arrays;

public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers(){
        size = 0;
    }

    public StackOfIntegers(int capacity){
        size = 0;
        elements = new int[capacity];
    }

    public boolean empty(){
        if (elements == null || elements.length == 0)
            return true;
        else
            return false;
    }

    public int peek(){
        return elements[elements.length - 1];
    }

    public void push(int value) {
        if(empty())
        {
            elements = new int[1];
            elements[0] = value;
        }
        else
        {
            elements = Arrays.copyOf(elements, elements.length + 1);
            elements[elements.length-1] = value;
        }
        size++;
        System.out.println(Arrays.toString(elements));
    }
    
    public int pop() {
        int temp = elements[elements.length-1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        size--;
        return temp; 
    }

    public int getSize(){
        //return elements.length;
        return size;
    }
}
