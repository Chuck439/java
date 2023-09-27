import java.util.Scanner;

public class PemilihanPercobaan116 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input16.nextInt();
        String result = (angka % 2 == 0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(result);
    }
}