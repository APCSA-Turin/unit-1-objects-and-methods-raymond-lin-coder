package U1T11L3;
public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println(methods.longerThan("Hello everyone", 15));
        System.out.println(methods.funnyString("goofy", 4));
        System.out.println(methods.halvesReversed("Toilets"));
        System.out.println(methods.pigLatin("Roblox"));
        System.out.println(methods.removeCharacter("Hahaha", 3));
        System.out.println(methods.insertAt("Hahahahaha", "You're crazy", "a"));
        System.out.println(methods.endUp("I'm going insane", 6));
        System.out.println(methods.yellOrWhisper("What's up?"));
        System.out.println(methods.starBetween("Testing"));
    }
}
