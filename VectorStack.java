import java.util.Vector;

public class VectorStack<T> implements Stack<T> {
    Vector<T> pila = new Vector<>();

    public VectorStack(){

    }

    public void push(T element){
        pila.addElement(element);
    };

    public T pop(){
        T dato = pila.lastElement();
        pila.removeElementAt(size()-1);
        return dato;
    };
    public T peek(){
        return pila.lastElement();
    };

    public int size(){
        return pila.size();
    };

    public boolean isEmpty(){
        return pila.size()==0;
    };
}
