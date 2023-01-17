import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Princ {
    public static void main(String[] args) {
        Person p = new Person("Ionel", 45);

        try (FileOutputStream fos = new FileOutputStream(("person.txt"));
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p); //salvare pe disc, noi ii spunem serializare
        }
        catch (IOException ioex) {
                 ioex.printStackTrace();
        }

    }
}
