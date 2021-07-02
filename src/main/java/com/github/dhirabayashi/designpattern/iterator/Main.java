package com.github.dhirabayashi.designpattern.iterator;

public class Main {
    public static void main(String[] args) {
        var bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("達人プログラマー"));
        bookShelf.appendBook(new Book("リーダブルコード"));
        bookShelf.appendBook(new Book("Effective Java"));

        for (Book book : bookShelf) {
            System.out.println(book.getName());
        }
    }
}
