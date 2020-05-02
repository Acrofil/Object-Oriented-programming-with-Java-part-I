/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atanas
 */
public class Dog {
    
    private String name;
    private String breed;
    private int age;
    
    public Dog(String initialName, String initialBreed, int initialAge) {
        
        this.age = 0;
        this.name = initialName;
        this.breed = initialBreed;
    
    }
    
    public void printDog() {
        System.out.println(this.name + ", breed " + this.breed + ", age " + this.age);
    }
    
}
