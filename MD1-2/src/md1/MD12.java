package md1;

import java.util.Scanner;

public class MD12 {
    private static Hasil hasil = new Hasil();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String nama;
        int nilai;
        for (int i = 0; i<5; i++){
        System.out.print("Masukkan Nama: ");
        nama = scan.next();
        System.out.print( "Masukkan Nilai: ");
        nilai = scan.nextInt();
        hasil.hasil(nama, nilai);
        
        }
    }
}
