import java.util.ArrayList;
public class GenericStack <E>{
    private ArrayList<E> list = new ArrayList<>();
    public int getSize(){
        return list.size();
    }
    public E peek(){
        return list.get(getSize() - 1);
    }
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        E o = peek();
        list.remove(getSize() - 1);
        return o;
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public String toString(){
        return "Stack: " + list.toString();
    }
}
