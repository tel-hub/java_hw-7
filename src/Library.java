import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Book[] books = new Book[3];

        books[0] = new Book(1965, "Незнайка на Луне", "Николай Носов");
        books[1] = new Book(1889, "Таис", "Анатоль Франс");
        books[2] = new Book(2007, "Мародёр", "Беркем аль Атоми");

        System.out.print("Введите первую букву названия >");

        String firstLetter = keyboard.next().charAt(0) + "";

        System.out.println("Введите год издания >");

        int year = keyboard.nextInt();

        int count = 0;

        for (Book book : books) {
            if (year >= book.date && (book.name.charAt(0) + "").equalsIgnoreCase(firstLetter)) {
                count++;
                System.out.println(count + ". " + book);
            }
        }

        System.out.println("Найдено книг: " + count);

    }
}
