
/* Lebron is my favorite basketball player in the NBA.
He got drafted when he was only 18.
  
*/
public class U1T2 {
    public static void main(String[] args) {
    
        // declare and initialize a constant
        final double FINAL_PRIZE = 10000;

        // declare and initialize variables
        String firstName = "Lebron";
        String lastName = "James";
        double height = 81; // inches
        int weight = 250; // pounds
        int age = 40;
        boolean isAdult = true;
        boolean hasWonROY;
        hasWonROY = true;
        
        // print out information using string concatentation
        System.out.println(firstName + " " + lastName + " is " + height + " inches tall.");
        System.out.println(firstName + " weighs " + weight + " pounds.");
        
        System.out.println(firstName + " is " + age + " years old.");
        System.out.println("True or false? Lebron has won rookie of the year: " + hasWonROY);
        
        //Lebron uses his wealth to figure out time travel to play basketball again
        age = 40-22;
        if (age >= 18) {
            isAdult = true;    
        }       
        else {
            isAdult = false;
}

        System.out.println(firstName + " time traveled! He is now " + age + " years old");
        System.out.print(firstName + " went on to win 5 tournaments! He made a total of " + 5*FINAL_PRIZE + " dollars.");
    }
}


