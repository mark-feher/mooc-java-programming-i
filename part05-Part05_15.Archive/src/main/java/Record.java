public class Record {
    private String identifier;
    private String name;

    public Record (String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getIdentifier() {
        return identifier;
    }

    @Override
    public String toString() {
        return identifier + ": " + name;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Record)) {
            return false;
        }

        Record compareRecord = (Record) compared;

        if (this.identifier.equals(compareRecord.identifier)) {
            return true;
        }
        return false;
    }
}
