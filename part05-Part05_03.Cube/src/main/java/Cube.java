public class Cube {
    private int edgeLength;

    public Cube (int initialEdgeLength) {
        this.edgeLength = initialEdgeLength;
    }

    public int volume () {
        return this.edgeLength * this.edgeLength * this.edgeLength;
    }

    @Override
    public String toString () {
        return "The length of the edge is " + this.edgeLength + " and the volume " + volume();
    }
}
