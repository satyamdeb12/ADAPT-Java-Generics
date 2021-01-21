package Generics;

//This generic class can have two arguments and the type of the arguments are not specified.
//When creating the object of this class we can specify which type of Key and Values do we want
public class MyGenericClass2 <K, V>{
    private  K key;
    private  V value;

    public MyGenericClass2(K key, V value) {
        super();
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
