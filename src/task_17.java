import java.io.*;
public class task_17 {
    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для окончания ввода введите 'Стоп'");
        try(FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\test1.txt")) {
            do{
                System.out.print(": ");
                str = br.readLine();
                if(str.compareTo("stop") == 0 | str.compareTo("Stop") == 0 | str.compareTo("стоп") == 0 | str.compareTo("Стоп") == 0)
                    break;
                str=str+"\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0 | str.compareTo("Stop") != 0 | str.compareTo("стоп") != 0 | str.compareTo("Стоп") != 0);
        }
        catch (IOException exc){
            System.out.println("Error1"+exc);
        }
    }
}