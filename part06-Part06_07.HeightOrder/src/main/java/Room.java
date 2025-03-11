/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room(){
        persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    public boolean isEmpty(){
        if(persons.isEmpty()){
            return true;
        }
        return false;
    }
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(this.persons.isEmpty()){
            return null;
        }
        
        Person shortestPerson = this.persons.get(0);
        for(Person person : this.persons){
            if(shortestPerson.getHeight() > person.getHeight()){
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }
    
    public Person take(){
        //Take the smallest person from the list and return the shortest and take them out of the list
        if(this.persons.isEmpty()){
            return null;
        }
        Person shortestPerson = this.shortest();
        
        this.persons.remove(shortestPerson);
        

        return shortestPerson;
        

        
    }
}
