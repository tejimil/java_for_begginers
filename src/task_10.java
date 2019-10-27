import java.util.Scanner;
public class task_10 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int[][] mass =new int[m][n];
        for(int i=0;i<m;i++) {
            System.out.println("Введите элементы строки " + (i+1));
            for (int j = 0; j < n; j++)
                mass[i][j] = in.nextInt();
        }
        System.out.println("Утроенные элементы первой строки массива");
        for(int i=0;i<n;i++)
            System.out.println(mass[0][i]*3);

    }
}