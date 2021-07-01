import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemList;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maximumWeight) {
            itemList.add(item);
        } else return;
    }

    public void printItems() {
        for (Item item: itemList) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;

        for (Item item: itemList) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {
        if (itemList.isEmpty()) {
            return null;
        }
        Item heaviest = this.itemList.get(0);


        for (Item item: itemList) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }

        return heaviest;
    }

    @Override
    public String toString() {
        String output = "";
        int count = 0;

        for (int i = 0; i < itemList.size(); i++) {
            count++;
        }
        if (itemList.isEmpty()) {
            output = "no items (" + totalWeight() + "kg)";
        } else if (itemList.size() == 1) {
            output = count + " item (" + totalWeight() + "kg)";
        } else {
            output = count + " items (" + totalWeight() +"kg)";
        }
        return output;
    }
}
