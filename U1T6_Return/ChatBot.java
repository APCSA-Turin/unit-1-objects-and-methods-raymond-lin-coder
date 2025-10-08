public class ChatBot {

   // instance variables
   private String name;
   private int number;

   // constructor
   public ChatBot(String chatBotName, int faveNum) {
       name = chatBotName;
       number = faveNum;
   }

   // void method that prints a greeting
   public void greeting(String yourName) {
       System.out.println("Hello, " + yourName + " my name is " + name); // name is an instance variable
       System.out.println("and I am a chat bot! How are you today?");
   }

   // void method that prints the weather
   public void weather() {
       System.out.println("I actually don't know much about the weather! Ha ha!");
       System.out.println("But I know it's warm and dry inside a computer! Ha ha!");
   }

   // method that converts feet to meters and returns the meters
   public double convertFeetToMeters(int numFeet) {
       final double METERS_PER_FOOT = 0.3048;
       return METERS_PER_FOOT * numFeet;
   }

   // void method that prints information about favorite numbers
   public void favoriteNumber(int yourNumber) {
       int distance = yourNumber - number;  // number is an instance variable
       System.out.println("My favorite number is " + number);
       System.out.println("That is " + distance + " away from your number!");
   }

   // method that adds and returns the sum of three numbers
   public int addNumbers(int num1, int num2, int num3) {
       return num1 + num2 + num3;
   }

   // method that returns a goodbye message -- note that this method does not print a string, but
   // rather RETURNS a string
   public String goodbye() {
       return "It was nice talking with you! Have a great day! Sincerely, " + name;
   }
   public void favPlace(String favPlace) {
       System.out.println("Here is a (totally) random place: " + favPlace);
   }
   public void help(int emergencyCallNumber) {
       System.out.println("You think the emergency call number is: " + emergencyCallNumber);
   }
   public String joke(String funnyThing) {
       return "Here is a joke about " + funnyThing + ": Why did the chicken cross the road? To get to the other side!";
   }
   public String quote(String famousPerson) {
       return famousPerson + " once said in the Art of War, 'If you know the enemy and know yourself, you need not fear the result of a hundred battles. If you know yourself but not the enemy, for every victory gained you will also suffer a defeat. If you know neither the enemy nor yourself, you will succumb in every battle.'";
   }
   public double inchesToFeet(int totalInches) {
       final int INCHES_PER_FOOT = 12;
       return (double) totalInches / INCHES_PER_FOOT;
   }
   public int meme(int funnyNumber1, int funnyNumber2) {
       return funnyNumber1 + funnyNumber2;
   }

}



