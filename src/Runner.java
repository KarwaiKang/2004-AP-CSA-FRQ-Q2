public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        System.out.println(cat.speak());

        LoudDog loudDog = new LoudDog("Loud Dog");
        System.out.println(loudDog.speak());

        Kennel kennel = new Kennel();

    }
}
