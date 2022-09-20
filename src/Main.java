import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner ip=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int n= ip.nextInt();
        double t=0.0;
        int i=1;
        while(i<=n){
            t+=(1.0/i);
            i++;
        }
        System.out.println("Sonuç:"+t);
    }
}