package GenericInterface2;
import GenericInterfaces.GInterface;
public class GClassImpl implements GInterface<String>{
    private String e;

    @Override
    public void setValue(String e) {
        this.e = e;
    }

    @Override
    public String getValue() {
        return e;
    }
}