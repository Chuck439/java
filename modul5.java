import java.util.Scanner;

public class modul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Var
        boolean noExit = true;
        double total = 0;
        
        // Process
        System.out.println("Menu");
        System.out.println("1. Mango ($5)");
        System.out.println("2. Apple ($3)" );
        System.out.println("3. Grapes ($2)");
        System.out.println("4. Exit");
        while(noExit){
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            switch (menu) {
                case 1:
                    total += 5.00;
                    break;
                case 2:
                    total += 3.00;
                    break;
                case 3:
                    total += 2.00;
                    break;
                case 4:
                    noExit = false;
                    break;
                default:
                System.out.println("Menu tidak tersedia! silahkan masukkan ulang");
                    break;
            }
        }
        input.close();
        
        // Output
        System.out.println("Total harga: $" + total);
    }
}
