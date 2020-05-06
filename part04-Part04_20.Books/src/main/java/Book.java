/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atanas
 */
public class Book {

    private String title;
    private int numberPages;
    private int year;

    public Book(String initialTitle, int initialPages, int initialYear) {
        this.title = initialTitle;
        this.numberPages = initialPages;
        this.year = initialYear;

    }

    public String getName() {

        return this.title;
    }

    public String toString() {

        return this.title + ", " + this.numberPages + " pages, " + this.year;
    }

}
