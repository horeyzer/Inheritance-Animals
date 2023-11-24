public class Bird extends Animal
{
    public String featherColor;

    public Bird()
    {
        super();
    }

    public Bird(String featherColor)
    {
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, double weight, String featherColor)
    {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {}

    @Override
    public void getVoice() {}

    @Override
    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ", average feather color is " + featherColor + ".";
    }
}
