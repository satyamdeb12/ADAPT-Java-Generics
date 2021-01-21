package GenericInterfaces;

public class GenericClientTest {
    public static void main(String[] args) {
        GClassImpl<Integer> gClassImpl = new GClassImpl<>();
        gClassImpl.setValue(1000);
        Integer value = gClassImpl.getValue();
        System.out.println(value);
    }
}
