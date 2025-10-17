package U1T11;

public class BabyParrotRunner {
    public static void main(String[] args) {
        BabyParrot baby = new BabyParrot("Toucan", 3, 4.25);
        baby.setName("Lil' Beans");
        String info = baby.parrotInfo();
        System.out.println(info);

    }
    
}
