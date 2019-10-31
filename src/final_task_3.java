import java.util.Scanner;
import java.text.DecimalFormat;
public class final_task_3 {
    public static void main(String[] args) {

        System.out.println("Введите текущий курс:");
        Scanner in = new Scanner(System.in);
        double exchange = in.nextDouble();
        System.out.println("Введите количество рублей:");
        double rub = in.nextDouble();
        double usd = rub/exchange;
        DecimalFormat f = new DecimalFormat("#.00");
        System.out.println("Количество долларов: "+f.format(usd));
    }
}