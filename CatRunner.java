public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Matt", 3, 4.5);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Leo", 2, 3.2);
        cat2.printCatInfo();
        cat2.introduce();
    }
}