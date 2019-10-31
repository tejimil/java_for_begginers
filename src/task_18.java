import java.io.*;
public class task_18 {
    public static void main(String[] args) {
        /* вывод содержимого файла на экран */
        String s;
        int i=0;
        System.out.println("Содержимое файла:");
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\test2.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                i++;
            }
        } catch (IOException exc) {
            System.out.println("Error1");
        }
        /*ввод с консоли в файл*/
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите данные для перезаписи файла");
        try(FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\test2.txt")) {
            while (i>0)
            {
                System.out.print(": ");
                str = br.readLine();
                str=str+"\r\n";
                fw.write(str);
                i--;
            }
            System.out.println("Файл был перезаписан.");
        }
        catch (IOException exc){
            System.out.println("Error1"+exc);
        }
    }
}