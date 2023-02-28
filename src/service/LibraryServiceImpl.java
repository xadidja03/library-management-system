package service;

public interface LibraryServiceImpl {
    boolean register();
    void books();


    void getBooks();

    boolean update();

    boolean delete();

    String totalBooks();
    boolean delete(long id);

}
