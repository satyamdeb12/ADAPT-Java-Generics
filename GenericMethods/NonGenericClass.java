package GenericMethods;

public class NonGenericClass {
    public <E> void printElements(E[] arr){
        for (E e : arr){
            System.out.println(e);
        }
    }
}
