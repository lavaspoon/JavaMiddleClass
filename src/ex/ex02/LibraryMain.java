package ex.ex02;

public class LibraryMain {

    public static void main(String[] args) {
        Library lib = new Library(4);
        lib.addBook("책1", "저자1");
        lib.addBook("책2", "저자2");
        lib.addBook("책3", "저자3");
        lib.addBook("JPA", "김영한");
        lib.addBook("OneMoreThing", "잡스");
        lib.showBooks();
    }
}
