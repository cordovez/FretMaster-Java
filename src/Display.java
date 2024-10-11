public class Display {
    Note note;
    int randomFret = (int) (Math.random() * 15);
    int randomString = (int) (Math.random() * 6);

    public String randomNote() {
        String randomNote = Fretboard.NOTES[randomFret][randomString];
        note = new Note(randomFret,randomString,randomNote);
        return note.note;
    }

    public String randomNoteKeyOfC() {
        String randomNote = Fretboard.NOTES[randomFret][randomString];

        while (randomNote.length() != 1) {
            randomFret = (int) (Math.random() * 15);
            randomString = (int) (Math.random() * 6);
            randomNote = Fretboard.NOTES[randomFret][randomString];
        }
        note = new Note(randomFret,randomString,randomNote);
        return note.note;
    }

    public String drawFretboard() {
        StringBuilder fretboard = new StringBuilder();  // Use StringBuilder to build the output efficiently
        for (int i = 0; i < Fretboard.NOTES.length; i++) {
            for (int j = 0; j < Fretboard.NOTES[i].length; j++) {
                fretboard.append("\t__").append(Fretboard.NOTES[i][j]).append("__\t");
                if (j < Fretboard.NOTES[i].length - 1) {
                    fretboard.append(", ");  // Add a comma between notes on the same fret
                }
            }
            fretboard.append("\n");  // Add a line break after each fret
        }
        return fretboard.toString();  // Convert StringBuilder to a string
    }

}
