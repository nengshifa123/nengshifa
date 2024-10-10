import java.util.Scanner;

public class konversinilai {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("program konveri nilai");
        System.out.println("Masukan Nilai");
        int nilai = scan.nextInt();
        if (nilai>=85&&nilai<=100){
            System.out.println("Nilai A");
        }
        else if (nilai>=75&&nilai<=84){
            System.out.println("Nilai B");
        }
        else if (nilai>=65&&nilai<=74){
            System.out.println("Nilai C");
        }
        else if (nilai>=55&&nilai<=64){
            System.out.println("Nilai D");
        }
        else{
            System.out.println("input salah");
        }
    }
    
}
