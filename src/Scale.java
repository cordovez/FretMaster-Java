import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scale {
    private final List<String> SCALE = Arrays.asList("A", "Bb", "B", "C", "Db", "D", "Eb", "E", "F", "Gb", "G", "Ab");
    private final List<Integer> MAJOR = Arrays.asList(2,2,1,2,2,2,1);
    private final List<Integer> MINOR = Arrays.asList(2,1,2,2,1,2,2);
    private final List<String> NOTES = new ArrayList<>();

    public List<String> keyOf(String key, String mode){
        int rootIndex = SCALE.indexOf(key); // Find the index of the root note (key)
        NOTES.add(SCALE.get(rootIndex));  // Add the first (root) note
        List<Integer> majorOrMinor = getMode(mode);

        int currentIndex = rootIndex;
        for (int interval : majorOrMinor) {
            currentIndex = (currentIndex + interval) % SCALE.size();  // Move by the interval, wrapping around if necessary
            NOTES.add(SCALE.get(currentIndex));
        }
        return NOTES;
    }

    private List<Integer> getMode(String mode) {
        if (mode.equalsIgnoreCase("MAJOR")) {
            return MAJOR;
        }
        return MINOR;
    }

}
