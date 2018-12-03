package ru.mirea.lab.second;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Лабораторная работа 2
 * Барчо Руслан ИКБО-13-17
 * Вариант 3
 */
public class BookTest {
    public static void main (String[] args){
        Date date;
        try{
            date =  new SimpleDateFormat( "dd-M-yyyy hh:mm:ss" ).parse( "22-05-1999 10:15:00" );
            Book book = new Book(256, date, "Тестовый автор", "Тестовое название");
            System.out.println("\nНазвание: " + book.getName() + "\nАвтор: " + book.getAuthor() + "\nКол-во страниц: " + book.getPages() + "\nДата создания: " + book.getCreationDate());
        } catch (ParseException e){
            System.out.println(e.toString());
        }
    }
}
