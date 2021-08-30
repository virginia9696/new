package book;

public class Customer {
    private String customerName;
    private Book bouthgBook;

//    public Customer(String customerName, Book bouthgBook){
//        this.bouthgBook=bouthgBook;
//        this.customerName=customerName;
//    }

    public Book getBouthgBook() {
        return bouthgBook;
    }

    public void setBouthgBook(Book bouthgBook) {
        this.bouthgBook = bouthgBook;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
