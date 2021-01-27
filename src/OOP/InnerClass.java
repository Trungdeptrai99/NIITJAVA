package OOP;

import java.util.Scanner;

public class InnerClass {
    class ValidateAccount{

        String email = "hoangvantrung@gmail.com";

        public boolean isExistedAccount(String email){
            if (email.equals(this.email)){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args)  {
        String email = "hoangvantrung@gmail.com";
        InnerClass innerClass = new InnerClass();
        ValidateAccount validateAccount = innerClass.new ValidateAccount();
        System.out.println(validateAccount.isExistedAccount(email));
        Scanner sc = new Scanner(System.in);
        while (true){
            int n = sc.nextInt();
            if (n==0){
                try {
                    throw new Exception("Nhập lại bạn ei!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
