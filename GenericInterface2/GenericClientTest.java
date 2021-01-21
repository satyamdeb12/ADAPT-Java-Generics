package GenericInterface2;

public class GenericClientTest {
    public static void main(String[] args) {
        GClassImpl gClassImpl = new GClassImpl();
        gClassImpl.setValue("Hello World");
        Object s = gClassImpl.getValue();
        String value = (String) s;
        System.out.println(value);
    }
}
