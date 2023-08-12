import java.util.Scanner;

public class rupeestousd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in rupees");
        double rupees = sc.nextDouble();
        double dollar = rupees/80;
        System.out.println("The amount in usd is "+dollar);
    }
}
