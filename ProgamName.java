import java.util.Scanner;

public class ProgamName {
    public static void main(String...args){
        Scanner namescanner = new Scanner(System.in);
        System.out.print("Введите своё имя: ");
        String yourname = namescanner.nextLine();

        System.out.println("Привет, " + yourname + "!");


    }
}
