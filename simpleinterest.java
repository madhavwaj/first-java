import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        int p = sc.nextInt();
        System.out.println("Enter Time");
        int t = sc.nextInt();
        System.out.println("Enter Rate");
        int r = sc.nextInt();
        int si = p*t*r/100;
        System.out.println("Outcome of Simple Interest is "+si);
    }
}
