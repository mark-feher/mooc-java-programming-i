
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String firstStr = "";
        String secondStr = "";

        for (String element: elements) {
            if (element.equals(elements.get(elements.size() - 1))) {
                secondStr += element;
            } else {
                secondStr = secondStr + element + "\n";
            }

        }
        if (elements.size() == 0) {
            firstStr = "The collection " + this.name + " is empty.";
        } else if (elements.size() == 1) {
            firstStr = "The collection " + this.name + " has 1 element:\n" + secondStr;
        } else {
            firstStr = "The collection " + this.name + " has " + elements.size() + " elements:\n" + secondStr;
        }

        return firstStr;
    }
}
