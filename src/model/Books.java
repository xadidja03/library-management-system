package model;

public class Books {
    int id;
    String bookName;
    String authorName;
    String genre;
    int pageCount;
    String lang;
    int price;
    boolean isStock;

    public Books(String bookName, String authorName, String genre, int pageCount, String lang, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.genre = genre;
        this.pageCount=pageCount;
        this.lang = lang;
        this.price = price;
        this.id=id;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", genre='" + genre + '\'' +
                ", pageCount=" + pageCount +
                ", lang='" + lang + '\'' +
                ", price=" + price +
                ", isStock=" + isStock +
                '}';
    }
}
