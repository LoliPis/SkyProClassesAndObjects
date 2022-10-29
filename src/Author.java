import java.util.Objects;

public class Author {
    private String family;
    private String name;

    public Author(String family, String name) {
        this.family = family;
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Author: " + family + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return family.equals(author.family) && name.equals(author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(family, name);
    }
}
