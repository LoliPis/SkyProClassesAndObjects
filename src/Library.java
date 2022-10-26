import java.util.Scanner;

public class Library {
    private Book[] books;
    public static Scanner sc = new Scanner(System.in);

    public Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(){
        Author temporaryAuthor;
        String addBook;
        System.out.println("Хотите добавить книгу?");
        for (int i = 0; i < books.length; i++) {
            addBook = sc.nextLine();
            if (books[i] == null && addBook.equals("да")) {
                addBook.replace("да","");
                System.out.println("вводите в строго указаном в консоле порядке.Каждый параметр с новой строки");
                System.out.println("Введите автора книги. Сначала фамилию, затем имя");
                temporaryAuthor = new Author(sc.nextLine(), sc.nextLine());
                System.out.println("Затем введите название книги и год публикации");
                books[i] = new Book(sc.nextLine(), temporaryAuthor, sc.nextInt());
                System.out.println("Еще одну?");
            } else if (addBook.equals("нет")){
                break;
            }
        }
    }

    public void findBook(String bookTitle){
        System.out.println("Какую хотите найти книгу?  Введите название");
        for (int i = 0; i < books.length; i++) {
                if (bookTitle.equals(books[i].getTitle())){
                    System.out.printf(" \"%s by %s %s was published in %s \" ", books[i].getTitle(),
                            books[i].getAuthor().getFamily(), books[i].getAuthor().getName(),
                            books[i].getYearPublishing());
                    break;
                } else {
                    System.out.println("Такой книги нет");
                }

        }
    }

    public void changeYearPublisherByTitle(String bookTit, int newYearPublisher){
        for (int i = 0; i < books.length; i++) {
            if (bookTit.equals(books[i].getTitle())){
                books[i].setYearPublishing(newYearPublisher);
                break;
            }
        }
    }

}
