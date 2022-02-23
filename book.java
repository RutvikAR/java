public class book {
    int bookpr;
    String booknm;
    book()
    {
        // bookprice=0;
        // bookname = "nobook";
        // authorname = "noauthor";
        System.out.println("no data available");
    }
    book(int a){
        this.bookpr =a;
        System.out.println("this book cost :" + bookpr);
    }
    book(int a ,String s)
    {
        this.bookpr= a;
        this.booknm= s;
        System.out.println(booknm  + "book cost "+bookpr);
    }
    public static void main(String[] args) {
        book b1 = new book(10);   
        book b2 = new book(10,"samvad");
    }
}

