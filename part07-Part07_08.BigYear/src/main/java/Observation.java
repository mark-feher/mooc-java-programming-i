import java.util.ArrayList;

public class Observation {
    private ArrayList<Bird> birdList;

    public Observation() {
        this.birdList = new ArrayList<>();
    }

    public void addBird(String name, String nameInLatin) {
        birdList.add(new Bird(name, nameInLatin));
    }

    public void observe(String name) {
        for (Bird bird: birdList) {
            if (bird.getName().equals(name)) {
                bird.incrementObservation();
            }
        }
    }

    public void listBirds() {
        for (Bird bird: birdList) {
            System.out.println(bird);
        }
    }

    public void listOneBird(String name) {
        for (Bird bird: birdList) {
            if (bird.getName().equals(name)) {
                System.out.println(bird);
            }
        }
    }
}
