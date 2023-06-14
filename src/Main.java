import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;
        double c;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenari giriniz");
        a=girdi.nextInt();
        System.out.print("2.kenari giriniz");
        b=girdi.nextInt();

        c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenus : "+c);
    }
}