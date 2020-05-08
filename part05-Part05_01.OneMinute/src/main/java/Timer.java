/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atanas
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hundrets;

    public Timer() {

        this.seconds = new ClockHand(60);
        this.hundrets = new ClockHand(100);

    }

    public void advance() {
        this.hundrets.advance();

        if (this.hundrets.value() == 0) {
            this.seconds.advance();

        }
        
       

    }
    @Override
    public String toString() {
    
        return this.seconds + ":" + this.hundrets;
    }

}

/*
public class Timer {

    private ClockHand hundrets;
    private ClockHand seconds;

    public Timer(int initial) {
        this.hundrets = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundrets.advance();

        if (this.hundrets.value() == 0) {
            this.seconds.advance();

        }
    }

    public String toString() {

        return this.seconds + ":" + this.hundrets;
    }

}
*/
