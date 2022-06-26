import java.util.Objects;

public class Author {
    String Name;
    String LastName;
    public  Author (String Name, String LastName) {
        this.Name = Name;
        this.LastName = LastName;
    }
    @Override
    public String toString(){
        return "Имя: " + Name + "; фамилия: " + LastName;
    }
    public int hashCode(){
        return Objects.hash(Name, LastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(Name, author.Name) && Objects.equals(LastName, author.LastName);
    }
}