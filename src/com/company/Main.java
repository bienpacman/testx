package com.company;

import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook(3,"Life of Bin",15000,"Bin","vN","adc");
        books[1] = new ProgrammingBook(4,"oh nice",15000,"Bin","VN","adc");
        books[2] = new ProgrammingBook(3,"Life of Bc",15000,"Bin","vN","adc");
        books[3] = new ProgrammingBook(3,"Life of c",15000,"Bin","vN","adc");
        books[4] = new ProgrammingBook(3,"Life of B",15000,"Bin","vN","adc");
        books[5]= new FictionBook(4,"Life of siu",16000,"Bin","kinh di");
        books[6]= new FictionBook(4,"Life of siu1",16000,"Bin","kinh di");
        books[7]= new FictionBook(4,"Life of siu2",16000,"Bin","kinh di");
        books[8]= new FictionBook(4,"Life of siu3",16000,"Bin","kinh di");
        books[9]= new FictionBook(4,"Life of siu4",16000,"Bin","kinh di");

        // tính giá 10 book:
        double TotalPrice = 0;
        for (Book b1: books) {
            TotalPrice += b1.getPrice();
        }
        System.out.println("tong 10 cuon total = "+TotalPrice+"vnd");
//  đếm số sách có language truyen vao:
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap language muon tim");
        String language = scanner.next();
        int count = 0;
        for (Book listBook: books ) {
            if (listBook instanceof ProgrammingBook){
                ProgrammingBook bookk = (ProgrammingBook) listBook;
                if (bookk.getLanguage().equals(language)){
                    count++;
                    System.out.println(bookk);
                }
            }
        }
        System.out.println("so sach can tim = "+count);

    }
}
