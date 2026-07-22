public class AnimalTest {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println("Animal Class:");
        animal.eat();
        animal.sleep();

        System.out.println();

        Bird bird = new Bird();
        System.out.println("Bird Class:");
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
