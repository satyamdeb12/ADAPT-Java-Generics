package GenericInterface3;

public class GenericClientTest {
    public static void main(String[] args) {
        GClassImpl<String, Integer> gClassImpl = new GClassImpl<>();
        gClassImpl.setValue(100);
        gClassImpl.setK("Century");

        String value3 = gClassImpl.getK();
        Integer key3 = gClassImpl.getValue();
        System.out.println(key3+":\t"+value3);
    }
}
