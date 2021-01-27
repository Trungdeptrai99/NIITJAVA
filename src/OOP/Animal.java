package OOP;

public abstract class Animal {

    private String name;

    private int age;

    private String environment;

    public Animal(String name,int age,String environment){
        this.name=name;
        this.age= age;
        this.environment=environment;
    }

    public abstract double getAvgLifExp();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public final Animal compare(Animal animal){
        double thisOld = this.age/getAvgLifExp();
        double animalOld = animal.getAge()/animal.getAvgLifExp();
        if((thisOld)<(animalOld)){
             return animal;
         }else if ((thisOld)==(animalOld)){
             if (animal.getAge()>this.age){
                 return animal;
             }
         }
        return this;
    }

    public final Animal compare(Animal[] animals){
        Animal animal = this;
        for (Animal e: animals
             ) {
            animal= animal.compare(e);
        }
        return animal;
    }

//    public Animal[] compare(Animal animal){
//        Animal[] arr =new Animal[2];
//        if((this.age/getAvgLifExp())<(animal.getAge()/animal.getAvgLifExp())){
//            arr[0]= animal;
//        }else if ((this.age/getAvgLifExp())==(animal.getAge()/animal.getAvgLifExp())){
//            if (animal.getAge()>this.age){
//                arr[0]=animal;
//            }
//            if (animal.getAge()==this.age){
//                arr[0]=animal;
//                arr[1]=this;
//            }
//        }
//        return arr;
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Thông tin của con vật: \n");
        sb.append("-Tên:\t").append(this.name).append("\t\n")
                .append("Tuổi:\t").append(this.age).append("\t\n")
                .append("Môi trường sống:\t").append(this.environment).append("\t\n")
                .append("Tuổi thọ trung bình:\t").append(this.getAvgLifExp()).append("\t\n")
                .append("------------");
        return sb.toString();
    }
}
