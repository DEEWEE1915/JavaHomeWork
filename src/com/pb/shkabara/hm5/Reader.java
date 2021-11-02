package com.pb.shkabara.hm5;

public class Reader {

    String name;
    int readerNumber;
    String faculty;
    String birthDate;
    String phoneNumber;

    public Reader(String name, int readerNumber, String faculty, String birthDate, String phoneNumber ) {
        this.name = name;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int booksCount) {
        System.out.println(name + " взяв " + booksCount + " книг");
    }

    public void takeBook(String... books){
        System.out.println(name + " взяв книги: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(Book... books) {
        System.out.println(name + " взяв книги: ");
        for (Book book : books) {
            System.out.print(book.title + " " + book.author + " " + book.year);
        }
    }

    public void returnBook(int booksCount) {
        System.out.println(name + " повернув " + booksCount + " книг");
    }

    public void returnBook(String... books){
        System.out.println(name + " повернув книги: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(Book... books) {
        System.out.println(name + " повернув книги: ");
        for (Book book : books) {
            System.out.print(book.title + " " + book.author + " " + book.year);
        }
    }

}
