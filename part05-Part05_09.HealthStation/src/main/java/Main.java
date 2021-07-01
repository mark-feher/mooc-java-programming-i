
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation h = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter",33,176,85);

        System.out.println(ethan.getName()+ " weight "+h.weigh(ethan)+" kilos");
        System.out.println(peter.getName()+ " weight "+h.weigh(peter)+" kilos");

        h.feed(ethan);
        h.feed(ethan);
        h.feed(ethan);
        h.feed(ethan);

        System.out.println(ethan.getName()+ " weight "+h.weigh(ethan)+" kilos");
        System.out.println(peter.getName()+ " weight "+h.weigh(peter)+" kilos");

        System.out.println("number of weighings " + h.weighings());
    }
}
