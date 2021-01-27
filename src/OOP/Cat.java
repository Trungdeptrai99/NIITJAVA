package OOP;

public class Cat extends Animal {


    public Cat(String name, int age, String environment) {
        super(name, age, environment);
    }

    public String speak(){
        return "Gâu gâu!";
    }

    @Override
    public double getAvgLifExp() {
        return 10;
    }
}
