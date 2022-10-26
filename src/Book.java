public class Book {
    private String title;
    private Author author;
    private int yearPublishing;

    public Book(String title, Author author, int yearPublishing){
       this.title = title;
       this.author = author;
       this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }


}
