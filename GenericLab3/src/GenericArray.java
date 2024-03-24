import java.util.Arrays;

public class GenericArray <E>{
    private final E[] array;

    public GenericArray(int lenght){
        array = (E[]) new Object[lenght];
    }
    public void set(int index, E element){
        array[index] = element;
    }
    public E get(int index){
        return array[index];
    }
    @Override
    public String toString(){
        return Arrays.toString(array);
    }
}