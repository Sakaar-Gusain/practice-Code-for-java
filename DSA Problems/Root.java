import java.util.Scanner;
import java.text.DecimalFormat;

public class Root{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = scanner.nextDouble();

        double result = n*20;
        DecimalFormat df = new DecimalFormat("#.00");
        String res = df.format(result);

        System.out.println(res);
        scanner.close();

    }
}