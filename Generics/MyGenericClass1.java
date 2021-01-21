package Generics;
import java.util.List;

//Creating a generic class
public class MyGenericClass1 <T>{
    //Creating a generic List that can accept value of any type
    private List<T> list;

    //Creating getter for the List
    public List<T> getList() {
        return list;
    }

    //Creating setter for the List
    public void setList(List<T> list) {
        this.list = list;
    }
}
