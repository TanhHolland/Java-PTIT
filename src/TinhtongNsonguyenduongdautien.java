import java.util.Scanner;

public class TinhtongNsonguyenduongdautien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            long n = sc.nextInt();
            long sum = n*(n+1)/2;
            System.out.println(sum);
        }
    }
}