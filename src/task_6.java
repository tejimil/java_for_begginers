import java.util.Scanner;
public class task_6 {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа:");
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        double a=(x+y+z)/3;
        int b=(int) a/2;
        if (b>3)
        System.out.println("Программа выполнена корректно");
    }

}
