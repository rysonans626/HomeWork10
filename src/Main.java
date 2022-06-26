public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Toove", "Jansson");
        Author author2 = new Author("Fedor", "Dostoevskiy");
        Book book1 = new Book("Moomin", author1, 1969);
        Book book2 = new Book("Idiot", author2, 1867);

        System.out.println("первый hashCode: " + author1.hashCode());
        System.out.println("второй hashCode: " + author2.hashCode());

        System.out.println("Туве это Федор? ответ: " + author1.equals(author2));

        System.out.println("превый автор - " + author1);
        System.out.println("второй автор - " + author2);

        System.out.println("Муми-тролль - идиот? ответ: " + book1.equals(book2));

        System.out.println("Первая книга - " + book1);
        System.out.println("Вторая книга - " + book2);
    }
}