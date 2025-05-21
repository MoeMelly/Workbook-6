import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    List<T> mama;
    int maxSize;



    public FixedList(int maxSize) {
        this.mama = new ArrayList<>(this.maxSize);
        this.maxSize = maxSize;
    }

    public List<T> getMama() {
        return mama;
    }

    public void add(T mel) {

        if (this.mama.size() < this.maxSize) {
               this.mama.add(mel);
        } else {
            throw new RuntimeException("List full.");
        }

    }
}

