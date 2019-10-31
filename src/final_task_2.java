import java.util.Scanner;
public class final_task_2 {
    public static void sort(int arrayToSort[]) {
        int n = arrayToSort.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arrayToSort[i];
                int j = i;
                while (j >= gap && arrayToSort[j - gap] > key) {
                    arrayToSort[j] = arrayToSort[j - gap];
                    j -= gap;
                }
                arrayToSort[j] = key;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int[] mass =new int[l];
        System.out.println("Введите элементы массива");
        for(int i=0;i<l;i++)
            mass[i]=in.nextInt();
        sort(mass);
        System.out.println("Отсортированный массив:");
        for(int i=0;i<l;i++)
            System.out.println(mass[i]);

    }
}