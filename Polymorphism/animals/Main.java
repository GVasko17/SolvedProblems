package animals;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Maci", "bob s liutenica");
        Dog dog = new Dog("Bruno", "meshtinka");

        System.out.println(cat.explainSelf());
        System.out.println(dog.explainSelf());
    }
}
