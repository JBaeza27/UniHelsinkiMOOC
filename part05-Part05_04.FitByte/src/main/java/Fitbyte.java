/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class Fitbyte {
    private int age;
    private int restingHeartRate;
    
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double getMaxHeartRate(){
        return 206.3 - (0.711 * age);
    }


    
    public double targetHeartRate(double percentOfMaximum){
        return ((getMaxHeartRate() - restingHeartRate) * (percentOfMaximum) + restingHeartRate);
    }
    
    
}
