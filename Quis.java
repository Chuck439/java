import java.util.Scanner;
import java.util.Random;
public class Quis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    char menu='y';
    do {
        int number = rand.nextInt(10)+1;
        boolean success = false;
        do {
            System.out.print("Tebak angka (1-10): ");
            int answer = sc.nextInt();
            sc.nextLine();
           
            if (answer == number) {
                success = true;
                System.out.println("Selamat tebakan anda benar!!!!");
            } else if(answer < number) {
                System.out.println("Angka tebakan anda terlalu kecil!!!!");
            }else {
                System.out.println("Angka tebakan anda terlalu Besar");
            }
        } while(!success);
        System.out.print("Apakah anda ingin mengulangi permainan (Y/Y)?");
        menu = sc.nextLine().charAt(0);
    } while(menu=='y'||menu=='Y');
    sc.close();
  }  
}
