package cs.lab;
import java.io.IOException;
import java.util.logging.Logger;

public class Demo {
    private static final Logger logger = Logger.getLogger(Demo.class.getName());

    public static void main(String[] args) throws IOException {
        Companhia a = new Companhia(10);
        Companhia b = new Companhia(15);
        Companhia c = new Companhia(20);

        Skyalert d = new Skyalert();
        a.Subscribe(d);
        b.Subscribe(d);
        c.Subscribe(d);
    }
}