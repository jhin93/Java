/*
 * Represents a person, with a name and age
 */
public class Person {
	//instance variables
    /*
     * The name of the person
     */
	String name;
    /*
     * The age of the person
     */
	int age;
	
	
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*
     * Compare instances of Person based on name
     */
    
    public boolean equals(Object something) { // equals method is used to assertEquals()
        // cast given object to Person
        Person otherPerson = (Person) something;
        
        //Returns true if names of both persons are the same
        return this.name.equals(otherPerson.name);
    }
}
