public class Fish extends Animal
{
    public String scalesColor;

    public Fish()
    {
        super();
    }

    public Fish(String scalesColor)
    {
        this.scalesColor = scalesColor;
    }

    public Fish(String name, int age, double weight, String scalesColor)
    {
        super(name, age, weight);
        this.scalesColor = scalesColor;
    }

    @Override
    public void eat() {}

    @Override
    public void getVoice() {}

    @Override
    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ", average scales color is " + scalesColor + ".";
    }
}
