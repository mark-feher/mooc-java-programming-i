public class Bird {
    private String name;
    private String nameInLatin;
    private int observation;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observation = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getNameInLatin() {
        return this.nameInLatin;
    }

    public int getObservation() {
        return this.observation;
    }

    public void incrementObservation() {
        this.observation++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.nameInLatin + "): " + getObservation() + " observations";
    }
}
