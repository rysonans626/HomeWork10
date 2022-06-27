import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int age;

    public Book(String name, Author author, int age) {
        this.name = name;
        this.author = author;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "название книги: \"" + getName() +"\" " +  "автор: " + getAuthor() + " год публикации: " + getAge();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.getName()) &&
                Objects.equals(author, book.getAuthor()) &&
                Objects.equals(age, book.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAuthor(), getAge());
    }
}
