public class Blowfish extends Fish
{
    private String species;

    public Blowfish()
    {
        super();
    }

    public Blowfish(String species)
    {
        this.species = species;
    }

    public Blowfish(String name, int age, double weight, String scalesColor, String species)
    {
        super(name, age, weight, scalesColor);
        this.species = species;
    }

    @Override
    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ", average scales color is " + scalesColor + ", species - " + species + ".";
    }
}
