import java.util.*;

public class Pemilihan2Percobaan316 {
    
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        // Var
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        // Input
        System.out.print("Masukkan kategori: ");
        kategori = input16.nextLine();
        System.out.print("Masukkan besarnya penghasilan: ");
        penghasilan = input16.nextInt();

        // Process
        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih: " +gajiBersih);
        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan bersih: " +gajiBersih);
        } else {
            System.out.print("Masukan kategori salah");
        }
    }
}