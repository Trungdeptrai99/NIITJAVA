package learning;

public class Test extends Employee implements Compare {
    public void testMethod(){
        System.out.println("learning.Test");
    }

    @Override
    public Employee findOld(Employee employee) {
        System.out.println("Trung");
        return null;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.findOld(test);
    }
}
