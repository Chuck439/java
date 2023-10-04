import java.util.*;

public class Pemilihan2Percobaan116 {
    
    public static void main(String[] args) {
        int tahun;
        Scanner input16 = new Scanner(System.in);

        // Input
        System.out.print("Masukkan tahun: ");
        tahun = input16.nextInt();

        // Process
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0 || (tahun % 400) == 0) {
                System.out.println("Tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}
