package edu.saintjoe.cs.yohanesl.DogYJL;

/* 
 * class Dog
 * This is the Dog program from page 61 of the text
 * Programmed by Brian Capouch 16 March 2016
 * This is straight out of the book but we will be changing it
 */

public class Dog {
	// This class (for now) has but a single data member
	/* Note that this is now an encapsulated class as per pp. 80-82!! */
	// This value represents the dog's name, and is a String object
    private String name;
    
    // This value represents the dog's size, as exhibited by it's weight
    private int weight;
    
    /* -------------------------------------------------------- */
    
    // See p. 73 this method really belongs in a "driver" class
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2;
        dog1.bark();
        
        // The "old way of doing business" without encapsulation
        // Watch what happens to this next line later on
        dog1.name = "Bart";
        
        dog1.setName("Bart");
        dog2 = dog1;
        dog2.bark();
        dog2.setName("Emil");
        dog2.bark();
        dog1.setWeight(100);
        dog2.bark();
        dog1.bark();
        
        // See p. 59 and 83
        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        
        myDogs[0].setName("Fred");
        myDogs[0].setWeight(42);
        myDogs[1].setName("Marge");
        myDogs[1].setWeight(13);
        myDogs[0].bark();
        }
    
    /* --------------------------------------------------------------*/
    
    // Instance methods begin here
    
    
    // In a "standard" class, there is one getter and one setter for each instance variable
    //   NOTE: the fancy CS names are accessor and mutator
    public void setName(String newName) {
    	name = newName;
    }
    
    // The parameter newWeight is sent into this method see p. 74
    public void setWeight(int newWeight) {
    	weight = newWeight;
    }
    
    // This method returns information back to the caller see p. 75
    public String getName() {
    	return name;
    }
    
    public int getWeight() {
    	return weight;
    }
    
    public void bark() {
    	// This declares a variable with LOCAL scope to the bark() method - See p. 85
    	// Note that its initial value MUST BE set by the programmer, unlike instance variables above
    	int pointless = 0;
    	
    	
    	if (weight > 60 ) {
          System.out.println("Woof!! Woof!! says " + name + " that weighs " + weight);
    	} else if (weight > 14 ) {
    		System.out.println("Ruff!! Ruff!! says " + name + " that weighs " + weight);
    	} else
    		System.out.println("Yip!! Yip!! says " + name + " that weighs " + weight);
    }
    
    // Example of multiple parameters - NOT a good example of programming style - see p. 76
    public int setBoth(String newName, int newWeight) {
    	
    	// Here's an example of the use of a local variable, i.e. it really does something
    	int oldWeight = weight;
    	
    	name = newName;
    	weight = newWeight;
    	return oldWeight;
    }
    	

    public void eat() { }
    
    public void chaseCat() { }
}

