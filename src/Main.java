import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        var scale = new Scale().keyOf("A", "minor");
        var fretboard = new Display().scaleOnFretboard(scale);

        System.out.println(fretboard);
    }
}
