
public class HealthStation {
    private int weighings;
                                //changed counter to weighting for readability
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighings++;
        return person.getWeight();
        
    }
    public void feed(Person person){
        int initialWeight = person.getWeight();
        person.setWeight(initialWeight + 1);   /*instead of person.setWeight(person.getWeight + 1);
                                                we will just person.getWeight() other times, so this would affect
                                                other Person objects.
                                                                 */
    }
    public int weighings(){
        return weighings;
    }

}
