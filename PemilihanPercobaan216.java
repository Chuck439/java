import java.util.Scanner;

public class PemilihanPercobaan216 {
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        String message = "";

        System.out.print("Nilai uas     : ");
        float uas = input16.nextFloat();
        System.out.print("Nilai uts     : ");
        float uts = input16.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input16.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input16.nextFloat();
        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);

        if (total <= 100 && total > 80) {
            message = "A";
        } else if (total <= 80 && total > 73) {
            message = "B+";
        } else if (total <= 73 && total > 65) {
            message = "B";
        } else if (total <= 65 && total > 60) {
            message = "C+";
        } else if (total <= 60 && total > 50) {
            message = "C";
        } else if (total <= 50 && total > 39) {
            message = "D";
        } else if (total <= 39) {
            message = "E";
        }

        System.out.println("Nilai akhir = " +total+ " dan nilai huruf anda adalah " +message);
    }
}