import java.util.Scanner;
public class task_7 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int x=1;
        int y=2;
        int z=3;
        if(number == x | number == y | number == z)
            System.out.println("Данное значение имеется в константах");
        else
            System.out.println("Такой константы нет!");
    }
}
