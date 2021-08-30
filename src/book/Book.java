package book;

public class Book {
    private String bookName;
    private int releaseYear;
    private  Author author;

//    public Book (String bookName, int releaseYear, Author author){
//        this.bookName=bookName;
//        this.releaseYear=releaseYear;
//        this.author=author;
//    }

    public String getBookNameookName(){
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor(){
        return author;
    }

    public void setAuthor(Author author) {
        author = author;
    }
}
