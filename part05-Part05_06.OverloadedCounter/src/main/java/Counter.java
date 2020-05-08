/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atanas
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;

    }

    public Counter() {
        this(0);

    }

    public int value() {

        return this.value;
    }

    public void increase() {

        this.value++;
    }

    public void increase(int increaseBy) {

        if (increaseBy < 0) {
            this.value = this.value;

        } else {

            this.value = this.value + increaseBy;

        }

    }

    public void decrease() {

        this.value--;
    }

    public void decrease(int decreaseBy) {

        if (decreaseBy < 0) {
            this.value = this.value;

        } else {
            this.value = this.value - decreaseBy;

        }

    }

}
