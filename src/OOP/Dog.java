package OOP;

public class Dog extends Animal{


    public Dog(String name, int age, String environment) {
        super(name, age, environment);
    }

    public String speak(){
        return "Meo meo!";
    }

    @Override
    public double getAvgLifExp() {
        return 12;
    }
}
