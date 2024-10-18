/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sierra02
 */
public class Archive {
    private String name;
    private String identifier;

    public Archive(String name, String identifier) {
        this.name = name;
        this.identifier = identifier;
    }
    public boolean equals(Object compared){
        
        if(this == compared){
            return true;
        }
        if(!(compared instanceof Archive)){
            return false;
        }
        
        Archive comparedArchive = (Archive) compared;
        if(this.identifier.equals(comparedArchive) && this.name.equals(comparedArchive.name)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.identifier;
    }
    
    
    
}
