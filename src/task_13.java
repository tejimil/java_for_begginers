import java.util.Scanner;
public class task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = in.nextLine();
        System.out.println("Введите вторую строку");
        String s2 = in.nextLine();
        if(s1.length()>s2.length())
            System.out.println("Строка с наибольшей длиной: "+s1 );
        if(s2.length()>s1.length())
            System.out.println("Строка с наибольшей длиной: "+s2 );
        if(s2.length()==s1.length())
            System.out.println("Длины строк равны");
    }
}
