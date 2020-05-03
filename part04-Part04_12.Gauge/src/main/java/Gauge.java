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
Create the class Gauge. 
The gauge has the instance variable private int value, 
a constructor without parameters (sets the initial value of the meter variable to 0), 
and also the following four methods:

Method public void increase() grows the value instance variable's value by one. It does not grow the value beyond five.
Method public void decrease() decreases the value instance variable's value by one. It does not decrease the value to negative numbers.
Method public int value() returns the value variable's value.
Method public boolean full() returns true if the instance variable value has the value five. Otherwise, it returns false.
 */
public class Gauge {

    private int value;

    public Gauge() {

    }

    public void increase() {

        this.value++;
        if (this.value > 5) {
            this.value--;

        }
    }

    public void decrease() {

        this.value--;
        if (this.value < 0) {
            this.value++;

        }
    }

    public int value() {

        return value;
    }

    public boolean full() {

        if (this.value == 5) {

            return true;
        }

        return false;
    }

}
