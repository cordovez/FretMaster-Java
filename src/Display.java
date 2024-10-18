import java.util.List;

public class Display {

    public String scaleOnFretboard(List<String> scale) {
        StringBuilder stringifiesFret = new StringBuilder();
        int numberOfFrets = Fretboard.VALUES.length;
        for (int i = 0; i < numberOfFrets; i++) {
            int numberOfStrings = Fretboard.VALUES[i].length;
            for (int j = 0; j < numberOfStrings; j++) {
                String noteValue = Fretboard.VALUES[i][j];
                if (scale.contains(noteValue)) {
                    stringifiesFret.append("\t__").append(noteValue).append("__\t");
                } else {
                    stringifiesFret.append("\t_____\t");
                }
            }
            stringifiesFret.append("\n");  // Add a line break after each fret
        }
        return stringifiesFret.toString();  // Convert StringBuilder to a string
    }
}

