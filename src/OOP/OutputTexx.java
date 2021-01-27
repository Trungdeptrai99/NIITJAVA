package OOP;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputTexx {
    public void writeFileText(String value){
        File file = new File("text.txt");
        try {
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(value);
            bufferedWriter.close();
            System.out.println("Đã ghi xong!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OutputTexx  outputTexx = new OutputTexx();
        String value = "Trung đẹp trai vãi cả đái 222 \n";
        outputTexx.writeFileText(value);
    }
}
