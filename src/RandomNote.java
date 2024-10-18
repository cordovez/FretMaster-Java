public class RandomNote {
    int randomFret = (int) (Math.random() * 15);
    int randomString = (int) (Math.random() * 6);
    private String randomNote = Fretboard.VALUES[randomFret][randomString];
    Note fretted = new Note(randomFret,randomString,randomNote);

    public String noteInKeyOf() {
        return fretted.note;
    }

    public String noteInKeyOf(String key) {
        while (randomNote.length() != 1) {
            randomFret = (int) (Math.random() * 15);
            randomString = (int) (Math.random() * 6);
            randomNote = Fretboard.VALUES[randomFret][randomString];
        }
        return fretted.note;
    }

}
