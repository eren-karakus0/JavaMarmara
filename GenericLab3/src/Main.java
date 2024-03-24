public class Main {
    public static void main(String[] args) {
        final int lenght = 20;
        GenericArray<Integer> intArray= new GenericArray<>(lenght);
        for (int i = 0; i < lenght; i++)
            intArray.set(i, i * 2);
        System.out.println("Generic Array <Integer>: " + intArray);
        GenericArray<String> strArray= new GenericArray<>(lenght);
        for (int i = 0; i < lenght; i++)
            strArray.set(i, String.valueOf((char) (i + 97)));
        System.out.println("Generic Array <String>: "+ strArray);
    }
}