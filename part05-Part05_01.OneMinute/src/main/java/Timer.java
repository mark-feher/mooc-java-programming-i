public class Timer {
    private ClockHand minutes;
    private ClockHand hundredths;

    public Timer () {
        this.minutes = new ClockHand(60);
        this.hundredths = new ClockHand(100);

    }

    @Override
    public String toString () {
        return minutes + ":" + hundredths;
    }

    public  void advance () {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.minutes.advance();
        }
    }
}
