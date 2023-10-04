import java.util.*;

public class Pemilihan2Percobaan216 {
    
    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);

        // Var
        int sudut1, sudut2, sudut3, totalSudut;

        // Input
        System.out.println("Masukkan sudut pertama: ");
        sudut1 = input16.nextInt();
        System.out.println("Masukkan sudut kedua: ");
        sudut2 = input16.nextInt();
        System.out.println("Masukkan sudut ketiga: ");
        sudut3 = input16.nextInt();

        // Process
        totalSudut = sudut1 + sudut2 + sudut3;
        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
            }
        } else {
            System.out.println("Bukan segtiga");
        }
    }
}