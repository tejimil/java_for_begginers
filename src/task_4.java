import java.util.Scanner;
public class task_4 {
    public static void main(String args[]) {
        int a=0;
        int o=1;
        System.out.println("Введите число в двоичном формате");
        System.out.print(":");
       Scanner in = new Scanner(System.in);
       String b = in.nextLine();
       for(int i=0;i<b.length();i++){
            if(b.charAt(i)>'1') {
                System.out.println("Неверный формат.");
                System.exit(0);
            }
       }
       for(int j=0;j<b.length();j++) {
           if(b.charAt(j)=='1'){
               o <<= (b.length() - j - 1);
               a=a|o;
               o=1;
           }
       }
       System.out.println(b +" в двоичном формате = "+a+" в десятичном формате");
    }
}
