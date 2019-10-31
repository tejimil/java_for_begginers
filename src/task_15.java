import java.util.Scanner;
public class task_15 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int[] mass =new int[l];
        System.out.println("Введите элементы массива");
        for(int i=0;i<l;i++)
            mass[i]=in.nextInt();

        for(int i = mass.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( mass[j] > mass[j+1] ){
                    int tmp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = tmp;
                }
            }
        }
        System.out.println("Отстортированный массив:");
        for(int i=0;i<mass.length;i++)
            System.out.print(mass[i]+" ");

    }
}