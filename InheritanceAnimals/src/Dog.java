public class Dog extends Mammal
{
    private String species;

    public Dog(String name, int age, double weight, String furColor, String species) {
        super(name, age, weight, furColor);
        this.species = species;
    }

    @Override
    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ", average fur color is " + furColor + ", species - " + species + ".";
    }
}
