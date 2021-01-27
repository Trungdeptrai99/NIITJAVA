package OOP;

import java.io.*;

public class Controller {

    public void writeOBJ(){
        try {
            FileOutputStream fos = new FileOutputStream("Data2.txt",true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Stock[] s1 = {
                    new Stock(1, "CD ROM", 100, 2)
                    ,new Stock(2, "CPU", 500, 2)
            };
            Stock s= new Stock(1,"Hieu",1,1);
            Stock a=new Stock(4,"Trung",100,3);
            Stock a2=new Stock(4,"Trung",100,3)
                    ;
            oos.writeObject(a);
            oos.writeObject(s);
            oos.writeObject(a2);
            oos.writeObject(s1);
            fos.close();
            oos.close();
            System.out.println("Đã ghi xong!");
        } catch (FileNotFoundException ex) {
            System.out.println("Loi ghi file: "+ex);
        } catch (IOException e){
            System.out.println(e.getMessage());
            System.out.println("Lỗi ở đây!");
        }
    }

    public void readObject(){
        try {
            FileInputStream fis = new FileInputStream("Data2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object a;
            while ((a=ois.readObject())!=null){
                System.out.println(a);;
            }
            fis.close();
            ois.close();
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (StreamCorruptedException | EOFException e){
            System.out.println("Đã hết file!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
