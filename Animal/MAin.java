package Animal;

public class MAin {
    public static void main(String[] args) {
        Child ch = new Child();
        ch.name = "Mika";//assigning value for instance variable from parent class(Animal)
        ch.disPlay();
        ch.eat();//accessing eat method from parent class(Animal) through child class

    }
}
