package com.pb.shkabara.hm5;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        Reader[] readers = new Reader[3];

        books[0] = new Book("Пригоди", "Іванов І. І.", "2000 р.");
        books[1] = new Book("Словник", "Сідоров А. В", "1980 р.");
        books[2] = new Book("Енциклопедія", "Гусєв К. В.", "2010 р.");

        readers[0] = new Reader("Петров В. В.", 113, "економічний", "01.01.1990", "0988888888");
        readers[1] = new Reader("Федоров В. В.", 114, "юридичний", "02.02.1991", "0988888888");
        readers[2] = new Reader("Павлов В. В.", 115, "історичний", "03.03.1992", "0966666666");


        System.out.println("Всі книги: ");

        for (Book book : books) {
            System.out.print(book.title + " " + book.author + " " + book.year);
            System.out.println();
        }

        System.out.println("Всі читачі: ");

        for (Reader reader : readers) {
            System.out.print(reader.name + " " + reader.readerNumber + " " +
                    reader.faculty + " " + reader.birthDate + " " + reader.phoneNumber);
            System.out.println();
        }

        readers[0].takeBook(1);
        readers[1].takeBook(books[1].title, books[2].title);
        readers[2].takeBook(books[2]);

        System.out.println();

        readers[0].returnBook(1);
        readers[1].returnBook(books[1].title, books[2].title);
        readers[2].returnBook(books[2]);

    }

}
