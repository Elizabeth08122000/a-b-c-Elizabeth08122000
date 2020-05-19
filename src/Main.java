import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        float C = in.nextFloat();
        System.out.println((A+B)*C);
        in.close();
    }
}
