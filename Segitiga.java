import java.util.Scanner;
import java.lang.Math;

public class Segitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alas, tinggi, luas;
        double sisiA, sisiB, sisiC;
        double semiPerimeter;

        System.out.println("Masukkan alas segitiga: ");
        alas = input.nextDouble();

        System.out.println("Masukkan tinggi segitiga: ");
        tinggi = input.nextDouble();

        luas =  0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + luas);

        System.out.println("Masukkan sisi A segitiga: ");
        sisiA = input.nextDouble();

        System.out.println("Masukkan sisi B segitiga: ");
        sisiB = input.nextDouble();

        System.out.println("Masukkan sisi C segitiga: ");
        sisiC = input.nextDouble();

        // Menggunakan rumus Heron untuk menghitung luas segitiga dengan tiga sisi
        semiPerimeter = (sisiA + sisiB + sisiC) /  2;
        luas = Math.sqrt(semiPerimeter * (semiPerimeter - sisiA) * (semiPerimeter - sisiB) * (semiPerimeter - sisiC));
        System.out.println("Luas segitiga dengan tiga sisi: " + luas);
    }
}
