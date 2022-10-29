import java.util.Scanner;
public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static Book[] arrayBooks = new Book[5];

    public static void addBooks(Book[] arrayBook){
        Author temporaryAuthor;
        String addBook;
        System.out.println("Хотите добавить книгу?");
        for (int i = 0; i < arrayBook.length; i++) {
            if (arrayBook[i] == null) {
                addBook = sc.nextLine();
                if (addBook.equals("да")){
                    System.out.println("вводите в строго указаном в консоле порядке.Каждый параметр с новой строки");
                    System.out.println("Введите автора книги. Сначала фамилию, затем имя");
                    temporaryAuthor = new Author(sc.nextLine(), sc.nextLine());
                    System.out.println("Затем введите название книги и год публикации");
                    arrayBook[i] = new Book(sc.nextLine(), temporaryAuthor, sc.nextInt());
                    addBook.replace("да","");
                }
                else if (addBook.equals("нет")) {
                    break;
                }
            }
        }
    }

    public static void printLibrary(Book[] library) {
        for (int i = 0; i < library.length; i++) {
            if (library[i] != null) {
                System.out.printf(" \"%s: %s %s: %s \" ", arrayBooks[i].getTitle(),
                        arrayBooks[i].getAuthor().getFamily(), arrayBooks[i].getAuthor().getName(),
                        arrayBooks[i].getYearPublishing());
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        /*Author tolstoi = new Author("Tolstoi", "Lev");
        Author bulgakov = new Author("Bulgakov", "Michail");
        Book voionaIMir = new Book("Voina i Mir", tolstoi, 1865);
        Book masterIMargarita = new Book("Master i Margarita", bulgakov, 1967);
        voionaIMir.setYearPublishing(1866);
        //Средний уровень
        arrayBooks[0] = voionaIMir;
        arrayBooks[1] = masterIMargarita;
        addBooks(arrayBooks);
        printLibrary(arrayBooks);
        //сложный уровень
        Library lib1 = new Library(5);
        lib1.addBook();
        System.out.println("Введите название книги которую хотите найти");
        String  bookTitle = sc.nextLine();
        lib1.findBook(bookTitle);
        System.out.println("Введите новый год  публикации");
        int newPublisherYear = sc.nextInt();
        lib1.changeYearPublisherByTitle(bookTitle, newPublisherYear);*/


        //Homework "Методы объектов"
        //сложный уровень
        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing.toString());
        System.out.println(levTolstoy.toString());

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand.toString());
        System.out.println(warAndPeace.toString());

        System.out.println("==============================");

        Library library = new Library(2);
        library.addBookInMain(theStand);
        library.addBookInMain(warAndPeace);
        System.out.println(library.toString());
    }



}