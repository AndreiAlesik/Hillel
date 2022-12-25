import java.util.Objects;

public class Structure {
    private String name;
    private int occurrence;
    public Structure(String name) {
        this.name = name;
    }

    public void setOccurrence(int occurrence) {
        this.occurrence = occurrence;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Structure)) return false;
        Structure structure = (Structure) o;
        return name.equals(structure.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
