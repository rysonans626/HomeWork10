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
    @Override
    public String toString(){
        return "название книги: \"" + name +"\" " +  "автор: " + author + "год публикации: " + age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, age);
    }
}