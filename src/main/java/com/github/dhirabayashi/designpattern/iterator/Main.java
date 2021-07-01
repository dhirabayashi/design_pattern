package com.github.dhirabayashi.designpattern.iterator;

public class Main {
    public static void main(String[] args) {
        var bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("達人プログラマー"));
        bookShelf.appendBook(new Book("リーダブルコード"));
        bookShelf.appendBook(new Book("Effective Java"));

        var iterator = bookShelf.iterator();
        while(iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
