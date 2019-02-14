public class Animal {

   String name;
   String favoriteFood;

    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        population++;

    }

    public void sleep() {

        System.out.println(name + " sleeps for 8 hours ");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if (food == favoriteFood) {
            System.out.println("Yum!!! " + name + " wants more meat ");
        } else {
            sleep();
        }
    }
static int population;
    }

