import java.util.Scanner;
public class task_12 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count=0;
        char[] chArray = s.toCharArray();
        for(int i = 0; i<chArray.length; i++){
            if(chArray[i] == ' '){
                for (int j=i;j<chArray.length-1;j++){
                    chArray[j]=chArray[j+1];
                }
                count++;
            }
        }
        if(count>0) {
            char[] chArray1 = new char[chArray.length - count];
            for (int i = 0; i < chArray.length - count;i++)
                chArray1[i]=chArray[i];
                System.out.println(chArray1);
        }
        else
            System.out.println(chArray);
    }
}
