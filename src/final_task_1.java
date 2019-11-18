import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class final_task_1 {
    public static void main(String args[]) throws IOException {
        System.out.println("Введите число в двоичном формате");
        System.out.print(":");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        int res = 0;
        while((c = buffer.read()) != 10) {
            if((c != 48) & (c != 49)) {
                System.out.println("Неверный формат.");
                System.exit(0);
            }
            res =  res*2+(c-48);
        }
        buffer.close();
        System.out.println("Введенное число = "+res +" в десятичной системе");


    }
}