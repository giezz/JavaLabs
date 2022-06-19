
import java.util.HashMap;

public class Phonebook<K, V> extends HashMap<K, V> {
    Phonebook() {
    }
    public void add(K number, V lastName) {
        this.put(number, lastName);
    }
}
