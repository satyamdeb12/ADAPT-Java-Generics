package GenericMethods;

public class GenericMethodTest {
    public static void main(String[] args) {
        Integer arr[] = {2, 1, 4, 5};
        MyGenericClass<Integer> myGenericClass1 = new MyGenericClass<>(arr);
        Integer[] arr2 = myGenericClass1.getArr();
        myGenericClass1.printElements(arr2);
        System.out.println("===========================================");

        String strArr[] = {"Hello", "World", "Hi"};
        MyGenericClass<String> myGenericClass2 = new MyGenericClass<>(strArr);
        myGenericClass2.printElements(myGenericClass2.getArr());
        System.out.println("===========================================");

        NonGenericClass nonGenericClass = new NonGenericClass();
        //Mentioning type parameter is not madatory
        //While calling a generic method a nonGeneric class
        nonGenericClass.printElements(arr);
        System.out.println("===========================================");
        nonGenericClass.<String>printElements(strArr);
        System.out.println("===========================================");
    }
}
