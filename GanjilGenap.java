import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Menentukan Bilangan Ganjil Genap === ");
        System.out.print("Masukan sebuah angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap. ");
        }else{
            System.out.println(angka + " adalah bilangan ganjil. ");

        }
        scanner.close();

    }
    
}
