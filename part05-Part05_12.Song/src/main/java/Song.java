
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    @Override
    public boolean equals(Object compared) {
        // if the variables are located on the same position they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not the type of song, objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object to a Song object
        Song comparedObject = (Song) compared;

        // if the values of the object variables are equal, objects are equal
        if (this.artist.equals(comparedObject.artist) &&
            this.name.equals(comparedObject.name) &&
            this.durationInSeconds == comparedObject.durationInSeconds
        ) {
            return true;
        }
        return false;
    }
}
