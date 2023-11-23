public class Main
{
    public static void main(String[] args)
    {
        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Mammal", 30, 12.2, "Brown");
        animals[1] = new Dog("Dog", 10, 68.1, "Dark", "Mammal");
        animals[2] = new Bird("Bird", 4, 0.7, "Dark gray");
        animals[3] = new Pigeon("Pigeon", 4, 0.3,"White", "Bird");
        animals[4] = new Fish("Fish", 6, 68.8,"Silver");
        animals[5] = new Blowfish("Blowfish", 10, 11.3,"Brownish", "Fish");

        for (Animal animal : animals)
        {
            System.out.println(animal);
            animal.eat();
            animal.getVoice();
        }
    }
}