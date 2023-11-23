public class Mammal extends Animal
{
    public String furColor;

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    @Override
    public void eat() {}

    @Override
    public void getVoice() {}

    @Override
    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ", average fur color is " + furColor + ".";
    }
}
