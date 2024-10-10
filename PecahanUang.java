import java.util.Scanner;

public class PecahanUang {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan jumlah uang (dalam rupiah): ");
    int jumlahUang = scanner.nextInt();
    scanner.close();
    hitungPecahanUang(jumlahUang);
   } 
   public static void hitungPecahanUang(int jumlah) {
    // Mendefinisikan pecahan uang
    int[] pecahan = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

    // Mencetak hasil pecahan uang
    System.out.println("Uang pecahan untuk: " + jumlah + " :");
    for (int nominal : pecahan) {
        if (jumlah >= nominal) {
            int jumlahLembar = jumlah / nominal;
            jumlah -= jumlahLembar * nominal;
            System.out.println(jumlahLembar + "Lembar" + nominal + "ribuan");
        }
    }
    if (jumlah > 0){
        System.out.println("Sisa: " + jumlah + "rupiah");
    }
   }
   
}
