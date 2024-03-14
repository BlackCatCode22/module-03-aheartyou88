package myanimals;

public class Animal {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println(Cat.getCatCount());

        Dog myDog = new Dog();
        myDog.woof();
        myDog.name = "Bingo";
        myDog.age = 8;
        System.out.println(Dog.getDogCount());
    }
}
