import java.util.ArrayList;

public class Room {
    private ArrayList<Person> personList = new ArrayList<>();

    public void add(Person person) {
        personList.add(person);
    }

    public boolean isEmpty() {
        if (personList.isEmpty()) {
            return true;
        } else return false;
    }

    public ArrayList<Person> getPersons() {
        return personList;
    }

    public Person shortest() {
        if (personList.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.personList.get(0);

        for (Person prs: personList) {
                if (shortestPerson.getHeight() > prs.getHeight()) {
                    shortestPerson = prs;
                }
        }

        return shortestPerson;
    }

    public Person take() {
        if (personList.isEmpty()) {
            return null;
        }
        Person shortestPerson = shortest();

        this.personList.remove(shortestPerson);

        return shortestPerson;
    }

}
