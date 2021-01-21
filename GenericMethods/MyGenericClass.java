package GenericMethods;

public class MyGenericClass<T> {
    private T[] arr;

    public MyGenericClass(T[] arr) {
        super();
        this.arr = arr;
    }

    public T[] getArr() {
        return arr;
    }
    public <E> void printElements(E[] arr){
        for (E e : arr){
            System.out.println(e);
        }
    }
}
