package service.impl;;
import global.GlobalData;
import model.Books;
import util.InputUtil;

import static util.InputUtil.*;

public class LibraryService {
    public Books fillBooks() {
        String bookName = inputRequiredString("Enter the name: ");
        String authorName = inputRequiredString("Enter the surname: ");
        String genre = inputRequiredString("Enter the genre: ");
        int pageCount = inputRequiredInteger("Enter the page count: ");
        String language = inputRequiredString("Enter the lang: ");
        int price = inputRequiredInteger("Enter the price: ");
        Books books=new Books(bookName,authorName,genre,pageCount,language,price);
        return books;
    }
    public boolean register() {
        int book_size = InputUtil.inputRequiredInteger("Enter the size: ");
        if( GlobalData.books!=null){
            Books[] tempBooks=GlobalData.books;
            GlobalData.books=new Books[tempBooks.length+book_size];
            int k=1;
            for (int i = 0; i < tempBooks.length; i++) {
                if(tempBooks.length>i){
                    GlobalData.books[i]=tempBooks[i];
                } else {
                    System.out.println(k++ +". Student");
                    GlobalData.books[i]=fillBooks();
                }
                GlobalData.books[i]=tempBooks[i];

            }
        }
        else {
            GlobalData.books = new Books[book_size];
            for (int i = 0; i < book_size; i++) {
                GlobalData.books[i] = fillBooks();

            }
        }
        return true;
    }
    public void getListBooks() {
            if (GlobalData.books== null) {
                System.err.println("Warning: Employee list is empty! ");
            } else {
                for (int i = 0; i < GlobalData.books.length; i++) {
                    System.out.println("---------------");
                    System.out.println(i + 1 + ". Employee");
                    System.out.println(GlobalData.books[i]);
                    System.out.println("---------------");
                }
            }
        }
    }
