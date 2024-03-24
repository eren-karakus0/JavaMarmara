public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {100, 22, 58, 41, 6, 50};
        Character[] charArray = {'v','g','a','c','x','d','t'};
        String[] stringArray = {"Istanbul","Tokyo","Seoul","Paris","London","Berlin","Madrid"};

        System.out.println("Sorted Integer array: ");
        sortGenericArray(integerArray);
        System.out.println("Sorted Character array: ");
        sortGenericArray(charArray);
        System.out.println("Sorted String array: ");
        sortGenericArray(stringArray);
    }
    public static <T extends Comparable<T>> void sortGenericArray(T[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j].compareTo(array[j + 1]) > 0)
                {
                    swap(j, j+1, array);
                }
            }
        }
        for (T elemment: array)
        {
            System.out.println(elemment + ", ");
        }
        System.out.println();
    }
    public static <T> void swap (int i, int j, T[] array){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}