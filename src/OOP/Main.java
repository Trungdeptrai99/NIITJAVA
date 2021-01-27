package OOP;

public class Main {
    public static void main(String[] args) {
//        Cat cat = new Cat("Mun",10,"Nhà");
//        Dog dog = new Dog("John",9,"Nhà");
//        Dog dog1 = new Dog("Dũng",9,"Nhà");
//        Cat cat1 = new Cat("Quỳnh",10,"Nhà");
//        Animal[] animals ={cat,cat1,dog1,};
//        Dog[] dogs = {dog,dog1};
//        System.out.println(dog1.compare(cat1));
        Controller controller = new Controller();
        controller.writeOBJ();
        controller.readObject();
    }
}
