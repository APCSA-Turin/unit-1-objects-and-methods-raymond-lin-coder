package U1T8;

public class Letter {
    // instance variables
    /* none yet */
    private String signatureName;
    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    public Letter(String yourName) {
        signatureName = yourName;
    }
    /* add your writeLetter method here: TO BE IMPLEMENTED IN #4 */
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
        System.out.println("From, " + signatureName);
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
    }
}

