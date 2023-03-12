import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double a,b,c;
        System.out.println("Lütfen Ücgenin Birinci Kenarını Giriniz");

        a= input.nextDouble();

        System.out.println("Lütfen Ücgenin İkinci Kenarını Giriniz");

        b= input.nextDouble();

        System.out.println("Lütfen Ücgenin Üçüncü Kenarını Giriniz");

        c= input.nextDouble();

        double u = (a+b+c)/2;
        double cevre = 2*u;
        double alan = u*(u-a)*(u-b)*(u-c);
        System.out.println("Üçgenin Çevresi :" + cevre);
        System.out.println("Üçgenin Alanı : "+alan);


    }
}




























