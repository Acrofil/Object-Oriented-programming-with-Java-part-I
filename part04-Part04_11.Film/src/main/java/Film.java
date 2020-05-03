/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atanas
 */

/*
Create a film class with the instance variables name (String) and ageRating (int). 
Write the constructor public Film(String filmName, int filmAgeRating) for the class, 
and also the methods public String name() and public int ageRating(). 
The first of these returns the film title and the second returns its rating.
 */
public class Film {

    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRating) {

        this.name = filmName;
        this.ageRating = filmAgeRating;

    }

    public String name() {

        return name;
    }

    public int ageRating() {

        return ageRating;

    }
}
