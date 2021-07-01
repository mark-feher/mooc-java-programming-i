
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here

        Counter c = new Counter();
        Counter d =  new Counter(5);

        System.out.println("Counter c: " + c.value());
        System.out.println("Counter d: " + d.value());

        c.increase();
        d.increase();

        System.out.println("Counter c: " + c.value());
        System.out.println("Counter d: " + d.value());

        c.increase(5);
        d.increase(5);

        System.out.println("Counter c: " + c.value());
        System.out.println("Counter d: " + d.value());

        c.decrease();
        d.decrease();

        System.out.println("Counter c: " + c.value());
        System.out.println("Counter d: " + d.value());

        c.decrease(5);
        d.decrease(5);

        System.out.println("Counter c: " + c.value());
        System.out.println("Counter d: " + d.value());
    }
}
