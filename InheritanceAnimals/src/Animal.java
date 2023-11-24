public abstract class Animal
{
    String name;
    int age;
    double weight;

    public Animal() { }

    public Animal(String name, int age, double weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public abstract void eat();

    public abstract void getVoice();

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age) { this.age = age; }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public String toString()
    {
        return "Animal name is " + name + ", average age is " + age + ", average weight is " + weight + ".";
    }
}
