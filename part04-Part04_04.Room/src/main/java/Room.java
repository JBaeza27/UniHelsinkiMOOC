/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class Room {
    private String code;
    private int seats;
    
    public Room(String classCode, int numberOfSeats){ //constructor
        this.code = classCode;
        this.seats = numberOfSeats;
    }
}
