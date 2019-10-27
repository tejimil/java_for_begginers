import java.util.Scanner;
public class task_9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int[] mass =new int[l];
        System.out.println("Введите элементы массива");
        for(int i=0;i<l;i++)
            mass[i]=in.nextInt();
        System.out.println("Удвоенные элементы массива");
        for(int i=0;i<l;i++)
            System.out.println(mass[i]*2);

    }
}
