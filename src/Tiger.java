 public class Tiger extends Animal {

     public Tiger(String name) {
         super(name, "meat");
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


 }
