
public class Main {
    public static void main(String[] args) {
        var randomNoteC = new Display().randomNoteKeyOfC();
        var randomNote = new Display().randomNote();
        var fretboard = new Display().drawFretboard();
        System.out.println(fretboard);
    }
}
