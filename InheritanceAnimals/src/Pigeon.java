public class Pigeon extends Bird
{
    private String species;

    public Pigeon()
    {
        super();
    }

    public Pigeon(String species)
    {
        this.species = species;
    }

    public Pigeon(String name, int age, double weight, String featherColor, String species)
    {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    @Override
    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ", average feather color is " + featherColor + ", species - " + species + ".";
    }
}
