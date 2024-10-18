
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compared){
        //if they are located in same position, they are equal
        if(this == compared){
            return true;
        }
        //if the compared objects are not of type book
        if(!(compared instanceof Book)){
            return false;
        }
        //Changing object to Book type
        Book comparedBook = (Book) compared;
        
        if(this.name.equals(comparedBook.name) && this.publicationYear == comparedBook.publicationYear){
            return true;
        }else{
            return false;
        }
    }
}
