package GenericInterface3;
import GenericInterfaces.GInterface;

public class GClassImpl<K, E> implements GInterface<E>{

    private E e;
    private K k;

    @Override
    public void setValue(E e) {
        this.e = e;

    }

    @Override
    public E getValue() {
        return e;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
}
