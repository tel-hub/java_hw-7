public class Book {
    int date;
    String name;
    String author;

    public Book(int date, String name, String author) {
        this.date = date;
        this.name = name;
        this.author = author;
    }


    @Override
    public String toString() {
        return "Кинга " +
                " '" + name +
                "', автор " + author +
                ", издана в " + date +
                " году";
    }
}
