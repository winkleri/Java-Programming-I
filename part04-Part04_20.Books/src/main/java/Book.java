/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ilja
 */
public class Book {
    private int year;
    private String title;
    private String pages;
    
    public Book(String title, String pages, int year) {
        this.year = year;
        this.title = title;
        this.pages = pages;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getPages()  {
        return this.pages;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String toString() {
        return getTitle() + ", " + getPages() + ", " + getYear();
    }
} 
