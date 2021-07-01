public class Container {
    private int state;

    public Container() {
        this.state = 0;
    }

    public int contains() {
        return this.state;
    }

    public void add(int amount) {
        if (amount < 0) {
            this.state += 0;
        } else if (this.state + amount > 100) {
            this.state = 100;
        } else {
            this.state += amount;
        }

    }

    public void remove(int amount) {
        if (amount < 0) {
            this.state -= 0;
        } else if (this.state - amount < 0) {
            this.state = 0;
        } else {
            this.state -= amount;
        }

    }

    @Override
    public String toString() {
        return this.state + "/100";
    }
}
