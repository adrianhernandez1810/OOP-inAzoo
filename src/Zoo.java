public class Zoo {


    public static void main(String[] args){
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
//        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");
        Bee stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");
        Animal[] animals = {tigger,pooh,rarity,gemma,stinger};

        Zookeeper zoebot = new Zookeeper("Zoebot");
        zoebot.feedAnimals(animals,"meat");

    }


//    public void sleep(String name){
//        System.out.println(name + " sleeps for 8 hours ");
//    }
//    public void eat(String name, String food){
//        System.out.println(name + " eats " + food);
//        if(food == favoriteFood){
//            System.out.println("Yum!!! " + name + " wants more bacon ");
//        }else{
//            sleep(name);
//        }
//    }



}
