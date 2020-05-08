/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Atanas
 */
public class Records {
    private String teamName;
    private int points;
    private int win;
    private int loss;
   
    
    public Records(String initialName, int initialPoints, int win, int loss) {
        
        this.teamName = initialName;
        this.points = initialPoints;
        this.win = win;
        this.loss = loss;
       
    
    }
    
    public String getTeamName() {
    
        return this.teamName;
    }
    
    public int getTeamPoints() {
    
        return this.points;
    }
    
    public int getWin() {
    
        return this.win;
    }
    
    public int getLoss() {
    
        return this.loss;
    }
    
   // @Override
    //public String toString() {
    
      //  return this.teamName + ", " + this.points;
    //}
    
   
}
