public class Giraffe extends Animal{
    public Giraffe(String name) {
        super(name,"leaves");
    }

    public void sleep() {
        System.out.println(name + " sleeps for 8 hours ");

    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == favoriteFood) {
            System.out.println("Yum!!! " + name + " wants more leaves ");
        } else {
            System.out.println("YUCK!!!" + name + " will not eat " + food);
        }
    }
}
